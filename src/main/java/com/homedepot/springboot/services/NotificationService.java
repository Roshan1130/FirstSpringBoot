package com.homedepot.springboot.services;

import com.homedepot.springboot.dtos.NotificationDto;

public class NotificationService {
	private EmailService emailService;
	private TextService textService;
	
	public void notifyMe(NotificationDto notDto) {
		if("TEXT".equals(notDto.getType())) {
			textService.sendText(notDto.getTo());
		} else if("EMAIL".equalsIgnoreCase(notDto.getType())) {
			emailService.sendEmail(notDto.getTo());
		}
	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public TextService getTextService() {
		return textService;
	}

	public void setTextService(TextService textService) {
		this.textService = textService;
	}
	
	
}
