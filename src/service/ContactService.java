package service;

import model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    List<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
