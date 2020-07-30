package com.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;

/**
 * @author zzx
 * @version 1.0
 * @date 2020/7/26 15:50
 */
@Configurable
@ComponentScan( basePackages="com",excludeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
public class AppConfig {
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "c3p0")
    public DataSource dataSource() {
        return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
    }
}
