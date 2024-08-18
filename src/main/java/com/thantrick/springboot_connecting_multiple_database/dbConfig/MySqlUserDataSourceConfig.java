package com.thantrick.springboot_connecting_multiple_database.dbConfig;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created on 14-08-2024
 *
 * @author : Rithesh Nagaraj
 * @project : SpringBoot-Connecting-Multiple-Database
 */

@Configuration
public class MySqlUserDataSourceConfig {

    @ConfigurationProperties("spring.datasource.user")
    @Bean
    public DataSourceProperties mySqlUserDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    public DataSource mySqlUserDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(mySqlUserDataSourceProperties().getUrl());
        dataSource.setUsername(mySqlUserDataSourceProperties().getUsername());
        dataSource.setPassword(mySqlUserDataSourceProperties().getPassword());
        return dataSource;
    }
}
