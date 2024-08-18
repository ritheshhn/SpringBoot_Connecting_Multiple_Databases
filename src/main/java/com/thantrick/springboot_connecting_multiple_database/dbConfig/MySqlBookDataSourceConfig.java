package com.thantrick.springboot_connecting_multiple_database.dbConfig;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

/**
 * Created on 14-08-2024
 *
 * @author : Rithesh Nagaraj
 * @project : SpringBoot-Connecting-Multiple-Database
 */


@Configuration
public class MySqlBookDataSourceConfig {

    @ConfigurationProperties("spring.datasource.book")
    @Bean
    public DataSourceProperties mySqlBookDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Primary
    @Bean
    public DataSource mySqlDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(mySqlBookDataSourceProperties().getUrl());
        dataSource.setUsername(mySqlBookDataSourceProperties().getUsername());
        dataSource.setPassword(mySqlBookDataSourceProperties().getPassword());
        return dataSource;
    }
}
