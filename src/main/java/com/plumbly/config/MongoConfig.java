package com.plumbly.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;;

@Configuration
public class MongoConfig {
    @Value("${mongodbConnectionUrl}") 
    String connectionUrl;
    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(connectionUrl);
    }
}
