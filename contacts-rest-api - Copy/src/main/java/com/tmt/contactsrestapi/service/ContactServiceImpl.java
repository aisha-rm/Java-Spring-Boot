package com.tmt.contactsrestapi.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmt.contactsrestapi.exception.ContactNotFoundException;
import com.tmt.contactsrestapi.pojo.Contact;
import com.tmt.contactsrestapi.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;
    
    @Override
    public List<Contact> getContacts() {
        return contactRepository.getContacts();
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.saveContact(contact);
    }

    /*
    public Contact getContact(int index) {
        return contactRepository.getContact(index);
    }


    public void updateContact(int index, Contact contact) { 
        contactRepository.updateContact(index, contact); 
    }
    
    public void deleteContact(int index) {
        contactRepository.deleteContact(index);
    }
    */

    private int findIndexById(String id){
        //returns index of obj when given its id
        return IntStream.range(0, contactRepository.getContacts().size())
            .filter(index -> contactRepository.getContacts().get(index).getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new ContactNotFoundException(id));  //Throw the new unchecked exception class 
            //the exception doesnt need to be added to the method definition
    }

    @Override
    public Contact getContactById(String id) {
        //accesses repo to get contact, using index generated from id
        return contactRepository.getContact(findIndexById(id));
    }

    @Override
    public void updateContactById(String id, Contact contact) {
        contactRepository.updateContact(findIndexById(id), contact);
    }

    @Override
    public void deleteContactById(String id) {
        contactRepository.deleteContact(findIndexById(id));
        
    }

}
