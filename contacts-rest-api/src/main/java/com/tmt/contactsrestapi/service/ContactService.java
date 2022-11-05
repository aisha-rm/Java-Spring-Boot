package com.tmt.contactsrestapi.service;

import com.tmt.contactsrestapi.pojo.Contact;

public interface ContactService {

    //initializing method that returns contact based on id, method to be overridden in  subclass
    Contact getContactById(String id);
}
