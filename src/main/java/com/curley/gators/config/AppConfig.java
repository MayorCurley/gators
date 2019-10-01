/**
 * 
 */
package com.curley.gators.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;*/
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Configuration file
 * 
 * @author Mayor Curley
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
    "com.curley.gators"
})
/*
 * @EnableJpaRepositories(basePackages= { "com.curley.gators.model",
 * "com.curley.gators.repository"})
 */
public class AppConfig {
    
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    /**
     * Retrieve configured jpa entity manager factory
     * 
     * @return
     */
    /*
     * @Bean(name="entityManagerFactory") public
     * LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
     * LocalContainerEntityManagerFactoryBean entityManagerFactory = new
     * LocalContainerEntityManagerFactoryBean(); return entityManagerFactory; }
     */

}
