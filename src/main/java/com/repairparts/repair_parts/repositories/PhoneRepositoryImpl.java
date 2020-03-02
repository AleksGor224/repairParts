package com.repairparts.repair_parts.repositories;

import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

@Repository
public class PhoneRepositoryImpl implements PhoneRepository {

    @Autowired
    DataSource dataSource;

    private List<PhoneEntity> phones;

    public PhoneRepositoryImpl(){
    }


    @Override
    public PhoneEntity addPhone(PhoneEntity entity) {

        PhoneEntity res = new PhoneEntity();

        if (ifExistsValue(entity.getBrand(), entity.getModel())) {
            System.out.println("Not Added");
            return null;
        } else {

            String SQL = "CREATE TABLE IF NOT EXISTS AllPhones(id text,brand text,model text,created_date timestamp,last_update_date timestamp);" +
                    "INSERT INTO AllPhones(id,brand,model,created_date,last_update_date) " +
                    "VALUES(?,?,?,?,?)";
            String id = null;
            try (Connection connection = dataSource.getConnection();
                 PreparedStatement pstmt = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, entity.getId());
                pstmt.setString(2, entity.getBrand());
                pstmt.setString(3, entity.getModel());
                pstmt.setTimestamp(4, Timestamp.valueOf(entity.getAddedTime()));
                if (entity.getLastUpdateTime() != null) {
                    pstmt.setTimestamp(5, Timestamp.valueOf(entity.getLastUpdateTime()));
                } else {
                    pstmt.setTimestamp(5, null);
                }

                int affectedRows = pstmt.executeUpdate();
                if (affectedRows > 0) {
                    try (ResultSet set = pstmt.getGeneratedKeys()) {
                        if (set.next()) {
                            if(set.getString(1)!=null) {
                                res.setId(set.getString(1));
                                res.setBrand(set.getString(2));
                                res.setModel(set.getString(3));
                                res.setAddedTime(set.getTimestamp(4).toLocalDateTime());
                            }
                            if(set.getTimestamp(5)!=null){
                                res.setLastUpdateTime(set.getTimestamp(5).toLocalDateTime());
                            }
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex.getSQLState());
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return res;
        }
    }

    @Override
    public PhoneEntity findById(String id) {
        Iterator<PhoneEntity> iterator = phones.iterator();
        return phones.stream().filter((e)->id.equals(e.getId())).findFirst().orElse(null);
    }

    @Override
    public boolean removeById(String id) {
        PhoneEntity entity = phones.stream().filter((e)->id.equals(e.getId())).findFirst().orElse(null);
        return phones.remove(entity);
    }

    @Override
    public List<PhoneEntity> getAll() {
        return new ArrayList<>(phones);
    }

    private boolean ifExistsValue(String brand, String model){

        HashMap<String,String> map = new HashMap<>();

        //preparing
        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM allphones")) {

            //check if database already exists. If No i need to return false because we dont have any instances of phones
            DatabaseMetaData dbmd = connection.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, "allphones", null);
            if (rs.next()) {
                //if database exists i need to check values in database
                try (ResultSet set = preparedStatement.executeQuery()) {
                    while (set.next()) {
                        //putting values in map for check Key: brand, Value: model
                        map.put(set.getString(2), set.getString(3));
                    }
                }catch (SQLException e){
                    System.out.println("Error after check of database :" + e.getMessage());
                }
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error before check of database :" + e.getMessage());
        }

        //check values for contains. If contains i need to return true
        for (Map.Entry<String,String> entry:map.entrySet()){
            if(entry.getKey().toLowerCase().equals(brand.toLowerCase())&&entry.getValue().toLowerCase().equals(model.toLowerCase())){
                return true;
            }
        }
        return false;
    }
}
