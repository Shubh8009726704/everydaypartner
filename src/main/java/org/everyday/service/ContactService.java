package org.everyday.service;

import org.everyday.model.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendContactEmail(ContactForm contactForm) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("myeverydaypartner2024@gmail.com"); // Replace with your email address
        message.setSubject(contactForm.getSubject());
        message.setText("From: " + contactForm.getName() + "\n\n" + contactForm.getMessage());
        message.setReplyTo(contactForm.getEmail());
        mailSender.send(message);
    }
}
