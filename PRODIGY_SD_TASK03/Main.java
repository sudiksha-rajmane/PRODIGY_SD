package PRODIGY_SD_TASKS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        int choice;

        System.out.println("======================================");
        System.out.println("      CONTACT MANAGEMENT SYSTEM");
        System.out.println("======================================");

        do {
            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Search Contact");
            System.out.println("6. Exit");
            System.out.println("----------------------------");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n----- ADD CONTACT -----");

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    Contact contact = new Contact(name, phone, email);
                    manager.addContact(contact);
                    break;

                case 2:
                    manager.viewContacts();
                    break;

                case 3:
                    System.out.println("\n----- EDIT CONTACT -----");

                    System.out.print("Enter name of contact to edit: ");
                    String oldName = sc.nextLine();

                    Contact existingContact = manager.searchContact(oldName);

                    if (existingContact != null) {

                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter new phone: ");
                        String newPhone = sc.nextLine();

                        System.out.print("Enter new email: ");
                        String newEmail = sc.nextLine();

                        manager.editContact(
                                oldName,
                                newName,
                                newPhone,
                                newEmail
                        );

                        System.out.println("\nContact updated successfully!");

                    } else {
                        System.out.println("\nContact not found.");
                    }
                    break;

                case 4:
                    System.out.println("\n----- DELETE CONTACT -----");

                    System.out.print("Enter name of contact to delete: ");
                    String deleteName = sc.nextLine();

                    if (manager.deleteContact(deleteName)) {
                        System.out.println("\nContact deleted successfully!");
                    } else {
                        System.out.println("\nContact not found.");
                    }
                    break;

                case 5:
                    System.out.println("\n----- SEARCH CONTACT -----");

                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();

                    Contact foundContact = manager.searchContact(searchName);

                    if (foundContact != null) {
                        System.out.println("\nContact found!");
                        System.out.println("----------------------------");
                        foundContact.displayContact();
                        System.out.println("----------------------------");
                    } else {
                        System.out.println("\nContact not found.");
                    }
                    break;

                case 6:
                    System.out.println("\nThank you for using Contact Management System!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please select 1-6.");
            }

        } while (choice != 6);

        sc.close();
    }
}
