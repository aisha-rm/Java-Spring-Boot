package com.tmt.contactsrestapi.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tmt.contactsrestapi.pojo.Contact;

@Repository
public class ContactRepository {
    
    private List<Contact> contacts = Arrays.asList(
        new Contact("123", "Aisha R", "976456"),
        new Contact("456", "Musty A", "4569876"),
        new Contact("789", "Amina R", "2598234")
    );

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }
 
    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(int index, Contact contact) { 
        contacts.set(index, contact); 
    }
    
    public void deleteContact(int index) {
        contacts.remove(index);
    }

}
