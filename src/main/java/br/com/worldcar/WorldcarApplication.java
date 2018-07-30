package br.com.worldcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WorldcarApplication extends org.springframework.boot.web.support.SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(WorldcarApplication.class, args);
	}
}
