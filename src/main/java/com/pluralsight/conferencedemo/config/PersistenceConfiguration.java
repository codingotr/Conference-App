package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/conference-app");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("admin");
        System.out.println("PersistenceConfiguration.dataSource is my custom datasource builder ^^^^");
        return dataSourceBuilder.build();
    }
}
