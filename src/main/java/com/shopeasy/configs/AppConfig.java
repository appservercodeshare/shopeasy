package com.shopeasy.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.shopeasy.daos", "com.shopeasy.jms.services", "com.shopeasy.persistences.beans"})
@PropertySource("classpath:dbConfig.property")
public class AppConfig {

}
