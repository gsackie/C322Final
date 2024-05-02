package edu.iu.gsackie.C322Final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class C322FinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(C322FinalApplication.class, args);
	}
}