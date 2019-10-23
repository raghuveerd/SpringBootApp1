package com.dr.sprintboot;

import com.dr.sprintboot.config.SprintBootProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(SprintBootProperties.class)

public class SprintBootApplication {

    @Autowired
    private SprintBootProperties sprintBootProperties;

    public static void main(String[] args) {
        SpringApplication.run(SprintBootApplication.class, args);
        System.out.println("Hello Raghuveer!!");
        //System.out.println("==>" + sprintBootProperties.getWelcome());
    }

    @Bean
	@Profile("production")
    CommandLineRunner runner() {
        return args -> {
			System.out.println("==>" + sprintBootProperties.getWelcome());
        };
    }

}
