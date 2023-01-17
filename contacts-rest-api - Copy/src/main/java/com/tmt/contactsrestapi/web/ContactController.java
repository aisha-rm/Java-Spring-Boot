package com.tmt.contactsrestapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tmt.contactsrestapi.pojo.Contact;
import com.tmt.contactsrestapi.service.ContactService;


@RestController
public class ContactController {
    
    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    //return all contacts in arrayList in repo
    public ResponseEntity<List<Contact>> getContacts(){
        List<Contact> contacts = contactService.getContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    //@ResponseBody not needed here as already included in RestController
    @GetMapping("/contact/{id}")
    //retrieve a contact
    //id is the expected uri to be specified in the get request
    public ResponseEntity<Contact> getContact(@PathVariable String id){
        //ResponseEntity allows returning data and status code. data to be returned is in the <>
        Contact contact = contactService.getContactById(id);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PostMapping("/contact")
    //add contact to repo
    public ResponseEntity<HttpStatus> createContact(@RequestBody Contact contact){
        //request body allows the json sent in payload to be read/deserialised into contact java object else returns null
        contactService.saveContact(contact);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PutMapping("contact/{id}")
    //update contact by using its id
    public ResponseEntity<Contact> updateContact(@PathVariable String id, @RequestBody Contact contact){
        
        contactService.updateContactById(id,contact );
        //send back updated contact as below with status
        return new ResponseEntity<>(contactService.getContactById(id), HttpStatus.OK);
        
    }

    @DeleteMapping("contact/{id}")
    public ResponseEntity<HttpStatus> deleteContact(@PathVariable String id){
        
        contactService.deleteContactById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       
    }

   
}
