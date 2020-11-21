package com.simpleapi.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpleapi.cruddemo.model.Contact;
import com.simpleapi.cruddemo.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repository;
	
	public Contact saveContact(Contact contact) {
		return repository.save(contact);
	}
	public List<Contact> saveContacts(List<Contact> contacts) {
		return repository.saveAll(contacts);
	}
	
	public List<Contact> getContacts(){
		return repository.findAll();
	}
	
	public Contact getContactsById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Contact getContactsByName(String name) {
		return repository.findByName(name);
		}
	
	public String deleteContact(int id) {
		repository.deleteById(id);
		return "contact deleted"+id;
	}
	

	
}
