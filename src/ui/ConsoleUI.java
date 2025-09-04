package ui;

import model.Contact;
import service.ContactService;

import java.util.Scanner;

public class ConsoleUI {
    ContactService contactService = new ContactService();
    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.println(
                    "1. Afficher les contacts\n" +
                    "2. Ajouter un contact\n" +
                    "3. Supprimer un contact\n" +
                    "4. Quitter"
            );

            System.out.print("> ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> displayContacts();
                case 2 -> addContact();
                case 3 -> deleteContact();
                case 4 ->  {
                    System.out.println("Au revoir!");
                    return;
                }
                default -> System.out.println(" choix invalide, réessayez.");
            }
        }
    }

    private void deleteContact() {
        System.out.println("---------------------");
        System.out.println("En construction");
        System.out.println("---------------------");
    }

    private void displayContacts() {
        System.out.println("---------------------");
        for (Contact c : contactService.listContacts()) {
            System.out.println(c);
        }
        System.out.println("---------------------");
    }

    private void addContact() {
        System.out.print("ID : ");
        String id = scanner.nextLine();
        System.out.print("Nom : ");
        String name = scanner.nextLine();
        System.out.print("Téléphone : ");
        String phone = scanner.nextLine();
        System.out.print("Email : ");
        String email = scanner.nextLine();

        contactService.addContact(id, name, phone, email);
        System.out.println("---------------------");
        System.out.println("Contact ajouté !");
        System.out.println("---------------------");
    }


}
