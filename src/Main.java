import model.Contact;
import service.ContactService;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("#00001", "Robert Duchemin", "0470/01.02.03", "duchemin.r@hotmail.com");
        Contact contact2 = new Contact("#00002", "Alice Lavalière", "0471/04.05.06", "lavaliere.a@gmail.com");

        ContactService contactService = new ContactService();

        contactService.addContact(contact1);
        contactService.addContact(contact2);

        for (Contact c : contactService.getContacts()) {
            System.out.println(c.getName());
        }
    }
}