package com.julio.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.julio.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
