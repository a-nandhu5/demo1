package com.simpleapi.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simpleapi.cruddemo.model.Contact;
import com.simpleapi.cruddemo.service.ContactService;

@RestController
public class ContactController{
	
	@Autowired
	private ContactService service;
	
	@PostMapping("/addcontact")
	public Contact addContact(@RequestBody Contact contact) {
		return service.saveContact(contact);
	}
	@PostMapping("/addcontacts")

	public List<Contact> addContacts(@RequestBody List<Contact> contacts) {
		return service.saveContacts(contacts);
	}
	@GetMapping("/contacts")
	public List<Contact> findAllContacts(){
		return service.getContacts();
	}
	@GetMapping("/contact/{id}")

	public Contact findContactById(@PathVariable int id) {
		return service.getContactsById(id);
	}
	@GetMapping("/contacts/{name}")

	public Contact findContactByName(@PathVariable String name) {
		return service.getContactsByName(name);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteContact(@PathVariable int id) {
		return service.deleteContact(id);
	}
	
	
	
}
