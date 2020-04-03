package com.repairparts.repair_parts.configurations;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class JdbcConfig {
//    @Value("${db.url}")
//    String url;
//    @Value("${db.username}")
//    String username;
//    @Value("${db.password}")
//    String password;

    @Bean
    DataSource getHikariCp(){
        HikariDataSource source = new HikariDataSource();
        source.setJdbcUrl("jdbc:postgresql://localhost:5432/Phones");
        source.setUsername("postgres");
        source.setPassword("root");
        return source;
    }
}
