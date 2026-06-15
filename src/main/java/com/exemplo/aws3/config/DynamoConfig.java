package com.exemplo.aws3.config;

import javax.swing.plaf.synth.Region;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@Configuration
public class DynamoConfig {
	
	

	    @Bean
	    public DynamoDbClient dynamoDbClient() {
	        return DynamoDbClient.builder()
	                .region(Region.SA_EAST_1)
	                .credentialsProvider(DefaultCredentialsProvider.create())
	                .build();	    
	}

}
