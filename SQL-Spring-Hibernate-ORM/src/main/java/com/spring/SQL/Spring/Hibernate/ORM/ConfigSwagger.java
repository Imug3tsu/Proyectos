package com.spring.SQL.Spring.Hibernate.ORM;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class ConfigSwagger {

    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(new Info().title("Proyecto Spring-Boot ORM - Book")
                .version("1.0-SNAPSHOT").description("Api que se encargara de gestionar funciones de tipo Libro")
                .contact(new Contact().url("https://twitter.com/Imug3tsu2").email("pabloguzman.dev@gmail.com").name("Pablo"))
                .license(new License().name("Spring").url("url de licencia")).termsOfService("terms Of Service"));
    }

}
