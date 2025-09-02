import model.Contact;
import service.ContactService;

public class Main {
    public static void main(String[] args) {

        ContactService contactService = new ContactService();
        contactService.addContact("#00001", "Robert Duchemin", "0470/01.02.03", "duchemin.r@hotmail.com");
        contactService.addContact("#00002", "Alice Lavalière", "0471/04.05.06", "lavaliere.a@gmail.com");
        contactService.addContact("#00003", "Sheldon Cooper", "0473/66.77.89", "Shelly.C@gmail.com");

        for (Contact c : contactService.getContacts()) {
            System.out.println(c);
        }
    }
}