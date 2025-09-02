package service;

import model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    List<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String id, String name, String phone, String email) {
        Contact c = new Contact(id, name, phone, email);
        this.contacts.add(c);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
