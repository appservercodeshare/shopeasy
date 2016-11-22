package com.shopeasy.configs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.shopeasy.controllers", "com.shopeasy.daos", "com.shopeasy.services", "com.shopeasy.persistences"})
@EnableTransactionManagement
@PropertySource(value = {"classpath:dbConfig.properties"})
public class WebAppConfig {

	
	/*@Bean(name = "messageConverters")
	public RequestMappingHandlerAdapter messageConverters() {
		RequestMappingHandlerAdapter requestMappingHandlerAdapter = 
		new RequestMappingHandlerAdapter();
		
		List<?> list = new ArrayList<MappingJackson2HttpMessageConverter>();
		list.add(jsonMessageConverter());
		requestMappingHandlerAdapter.setMessageConverters();
	}
	
	@Bean(name = "jsonMessageConverter")
	public MappingJackson2HttpMessageConverter jsonMessageConverter() {
		MappingJackson2HttpMessageConverter jsonMessageConverter = 
		new	MappingJackson2HttpMessageConverter();
		return jsonMessageConverter;
	} */
	
}