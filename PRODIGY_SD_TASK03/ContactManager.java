package PRODIGY_SD_TASKS;

import java.util.ArrayList;

public class ContactManager {

    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Add a new contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("\nContact added successfully!");
    }

    // View all contacts
    public void viewContacts() {

        if (contacts.isEmpty()) {
            System.out.println("\nNo contacts found.");
            return;
        }

        System.out.println("\n========== CONTACT LIST ==========");

        for (int i = 0; i < contacts.size(); i++) {

            System.out.println("\nContact " + (i + 1));
            contacts.get(i).displayContact();
        }

        System.out.println("==================================");
    }

    // Search contact by name
    public Contact searchContact(String name) {

        for (Contact contact : contacts) {

            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }

        return null;
    }

    // Edit contact
    public boolean editContact(String oldName, String newName,
                                String newPhone, String newEmail) {

        Contact contact = searchContact(oldName);

        if (contact != null) {

            contact.setName(newName);
            contact.setPhone(newPhone);
            contact.setEmail(newEmail);

            return true;
        }

        return false;
    }

    // Delete contact
    public boolean deleteContact(String name) {

        Contact contact = searchContact(name);

        if (contact != null) {
            contacts.remove(contact);
            return true;
        }

        return false;
    }
}
