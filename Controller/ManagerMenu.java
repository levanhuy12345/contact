/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Contact;
import Model.Manager;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ManagerMenu extends Menu<String> {

    private static String[] mc = {" Add a contact.", "Display all contact.","Delete a contact.","Exit"};
    private ArrayList<Contact> lc;
    private Manager manager;

    public ManagerMenu() {
        super("\n MAIN MENU", mc);
        lc = new ArrayList<>();
        manager = new Manager();
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                manager.createContact(lc);
                break;
            case 2:
                manager.printAllContact(lc);
                break;
            case 3:
                manager.deleteContactd(lc);
                break;
            case 4:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}