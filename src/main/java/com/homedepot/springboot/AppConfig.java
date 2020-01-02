package com.homedepot.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.homedepot.springboot.services.EmailService;
import com.homedepot.springboot.services.NotificationService;
import com.homedepot.springboot.services.TextService;

@Configuration
public class AppConfig {

	@Bean
	public EmailService emailService() {
		return new EmailService();
	}
	
	@Bean
	public TextService textService(){
		return new TextService();
	}
	
	//injecting the dependency
	@Bean
	public NotificationService notification() {
		NotificationService ns = new NotificationService();
		ns.setEmailService(emailService());
		ns.setTextService(textService());
		return ns;
	}
}
