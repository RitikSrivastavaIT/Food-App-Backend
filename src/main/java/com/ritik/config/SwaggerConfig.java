package com.ritik.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myCustomConfig(){
        return new OpenAPI().info(
                new Info()
                        .title("Food Ordering App APIs")
                        .description("By Ritik Srivastava")
        )
                .tags(List.of(
                        new Tag().name("Home API"),
                        new Tag().name("Authentication APIs"),
                        new Tag().name("User API")
                        )
                );
    }
}
