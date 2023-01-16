package com.tmt.contactsrestapi.service;

import java.util.List;

import com.tmt.contactsrestapi.exception.NoContactException;
import com.tmt.contactsrestapi.pojo.Contact;

public interface ContactService {

    //initializing method that returns contact based on id, method to be overridden in service subclass
    Contact getContactById(String id) throws NoContactException;

    //initializing method that saves a contact, again overriden in subclass
    void saveContact(Contact contact);

    void updateContactById(String id, Contact contact) throws NoContactException;

    void deleteContactById(String id) throws NoContactException;

    List<Contact> getContacts();
}
