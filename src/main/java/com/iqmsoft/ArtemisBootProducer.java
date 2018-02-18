package com.iqmsoft;

import org.apache.activemq.artemis.jms.client.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"com.iqmsoft"})
@EnableScheduling
public class ArtemisBootProducer {
	public static void main(String[] args) {
		SpringApplication.run(ArtemisBootProducer.class, args);
	}
	
	@Bean
	public ActiveMQQueue queue(){
		return new ActiveMQQueue("artemis-queue-test");
	}
}
