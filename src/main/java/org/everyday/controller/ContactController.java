package org.everyday.controller;

import org.everyday.model.ContactForm;
import org.everyday.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController { // Corrected class name

    @Autowired
    private ContactService contactService;

    @GetMapping
    public String showContactForm(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "/contact";
    }

    @PostMapping
    public String submitContactForm(@ModelAttribute ContactForm contactForm, Model model) {
        contactService.sendContactEmail(contactForm);
        model.addAttribute("contactForm", new ContactForm()); // Clear the form
        model.addAttribute("message", "Thank you for your message! We will get back to you soon.");
        return "redirect:/contact"; // Return the same view with message
    }
}
