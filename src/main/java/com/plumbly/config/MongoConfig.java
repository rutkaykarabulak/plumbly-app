package com.plumbly.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.plumbly.models.User;

import java.util.Collections;


@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration{
    @Value("${mongodb.connection.url}") 
    private String connectionUrl;
    
    @Value ("${mongodb.database.name}")
    private String databaseName;

    @Value ("${mongodb.host}")
    private String host;

    @Value ("${mongodb.port}")
    private int port;
    
    @Override
    public String getDatabaseName() {
        return databaseName;
    }
    
    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        builder
                .applicationName("plumbly")
                .applyConnectionString(new ConnectionString(connectionUrl))
                .applyToClusterSettings(
                        settings -> settings.hosts(Collections.singletonList(new ServerAddress(host, port))))
                .build();
    }

    @Override
    @Bean
    public MongoClient mongoClient() {
        MongoClient mongoClient = super.mongoClient();
        return mongoClient;
    }

}
