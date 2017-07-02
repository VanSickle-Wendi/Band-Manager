/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;
import byui.cit260.bandManager.exceptions.BankControlException;
import java.util.Scanner;

/**
 *
 * @author shaza
 */
public class HotelCheckInView extends InteractiveView {
    public HotelCheckInView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  You are at the Hotel                         |"
                + "\n-------------------------------------------------"
                + "\n  You have the following room options:           "
                + "\n                                                 "
                + "\n  Regular rooms with two queen beds:  |$200 each |"
                + "\n  Regular room with one King bed:     |$500 each|"
                + "\n  Studio suite with two queen beds    |$800 each |"
                + "\n  Party Suite with 3 bedrooms:        |$1000     |"
                + "\n-------------------------------------------------"
        );
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        double roomCharge = 0;
        double bankAccount = 0;
        double quantity = 0; 
        double payHotelCost = 0;
        int a = 1;
        int b = 1;
        int c = 1;
        
        // prompt user for 5 inputs, change the user input from String to double
         do {
        try {
         quantity = Double.parseDouble(getInput("How many rooms would you like to rent?"));
         a = 2;
        } catch (NumberFormatException nf) {
            System.out.println("\n you must enter a valid number");
        } 
         } while(a == 1);
        do {
        try {
         roomCharge = Double.parseDouble(getInput("Enter the cost of the rooms you would like to rent."));
         b = 2;
        } catch (NumberFormatException nf) {
            System.out.println("\n you must enter a valid number");
        }
        } while(b == 1);
        do {
        try {
         bankAccount = Double.parseDouble(getInput("How much is in your bank account?"));
         c = 2;
         
        } catch (NumberFormatException nf) {
            System.out.println("\n you must enter a valid number");
        }
        } while(c == 1);
        // new instance of BankingControl class
        BankingControl hotel = new BankingControl();
         
        try { 
        payHotelCost = hotel.calcHotelCost(roomCharge, bankAccount, quantity);
        } catch(BankControlException bce) {
        
        System.out.println(bce.getMessage());
        }

        return true;
    }

}
