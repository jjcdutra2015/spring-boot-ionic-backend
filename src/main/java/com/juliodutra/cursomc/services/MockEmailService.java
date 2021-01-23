package com.juliodutra.cursomc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractMailService {
	
	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void sendMail(SimpleMailMessage msg) {
		LOG.info("Simulando envio de e-mail...");
		LOG.info(msg.toString());
		LOG.info("E-mail enviado");
	}
 
}
