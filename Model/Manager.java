/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Manager {

    //allow user create contact
    public static void createContact(ArrayList<Contact> lc) {
        System.out.print("Enter id contact: ");
        int contactId = Validation.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = Validation.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = Validation.checkInputString();
        System.out.print("Enter group: ");
        String group = Validation.checkInputString();
        System.out.print("Enter address: ");
        String address = Validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = Validation.checkInputPhone();
        lc.add(new Contact(contactId, firstName + lastName, group, address,
                phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    //allow user display all contact
    public static void printAllContact(ArrayList<Contact> lc) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    //allow user delete contact
    public static void deleteContactd(ArrayList<Contact> lc) {
        System.out.print("Enter id: ");
        int idDelete = Validation.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    //get contact by id
    public static Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}