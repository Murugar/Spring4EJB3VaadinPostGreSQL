package com.iqmsoft.spring.ejb.vaadin.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan(basePackages = {
        "com.iqmsoft.spring.ejb.vaadin.service.config",
        "com.iqmsoft.spring.ejb.vaadin.common",
        "com.iqmsoft.spring.ejb.vaadin.service.repos",
        "com.iqmsoft.spring.ejb.vaadin.service.main"
})
public class CustomerManagerConfiguration {

    /**
     * Placeholder config for ${}s.
     *
     * @return PropertySourcesPlaceholderConfigurer
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
