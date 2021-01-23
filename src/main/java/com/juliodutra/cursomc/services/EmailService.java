package com.juliodutra.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.juliodutra.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendMail(SimpleMailMessage msg);
}
