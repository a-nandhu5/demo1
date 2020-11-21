package com.simpleapi.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpleapi.cruddemo.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

	Contact findByName(String name);

}
