package com.tmt.contactsrestapi.service;

import java.util.List;

import com.tmt.contactsrestapi.pojo.Contact;

public interface ContactService {

    //initializing method that returns contact based on id, method to be overridden in  subclass
    Contact getContactById(String id);

    //initializing method that saves a contact, again overriden in subclass
    void saveContact(Contact contact);

    List<Contact> getContacts();
}
