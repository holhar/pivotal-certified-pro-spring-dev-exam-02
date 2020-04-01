package com.apress.cems.config;

import com.apress.cems.pojos.repos.DetectiveRepo;
import com.apress.cems.repos.JdbcDetectiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * @author Holger Harms
 */
@Configuration
@ComponentScan(basePackages = {"com.apress.cems.repos"})
@Import(DbConfig.class)
public class RepositoryConfig {

    @Bean
    DetectiveRepo detectiveRepo(DataSource dataSource){
        return new JdbcDetectiveRepo(dataSource);
    }
}
