
import Controller.ManagerMenu;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        ManagerMenu controller = new ManagerMenu ();
        controller.run();
    }
}

