package com.thantrick.springboot_connecting_multiple_database.dbConfig;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Created on 18-08-2024
 *
 * @author : Rithesh Nagaraj
 * @project : SpringBoot-Connecting-Multiple-Database
 */

@Configuration
@EnableJpaRepositories(
        basePackages = "com.thantrick.springboot_connecting_multiple_database.bookRepository",
        entityManagerFactoryRef = "mySqlBookEntityManagerFactory",
        transactionManagerRef = "mySqlBookTransactionManager"
)
public class MySqlBookEntityManagerConfig {

    @Bean
     LocalContainerEntityManagerFactoryBean mySqlBookEntityManagerFactory(EntityManagerFactoryBuilder entityManagerFactoryBuilder,
                                                                          @Qualifier("mySqlDataSource") DataSource dataSource){
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages("com.thantrick.springboot_connecting_multiple_database.bookEntity")
                .build();
    }

    @Bean
    PlatformTransactionManager mySqlBookTransactionManager(@Qualifier("mySqlBookEntityManagerFactory") LocalContainerEntityManagerFactoryBean lcemfb){
        return new JpaTransactionManager(lcemfb.getObject());
    }
}
