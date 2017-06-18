/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;
import java.util.Scanner;

/**
 *
 * @author shaza
 */
public class HotelCheckInView extends InteractiveView {

    public HotelCheckInView() {

        this.displayBanner();

    }

    private void displayBanner() {

        System.out.println("\n"
                + "\n-------------------------------------------------"
                + "\n|  You are at the Hotel                         |"
                + "\n-------------------------------------------------"
                + "\n  You have the following room options:           "
                + "\n                                                 "
                + "\n  Regular rooms with two queen beds:  |$99 each |"
                + "\n  Regular room with one King bed:     |$109 each|"
                + "\n  Party Suite with 3 bedrooms:        |$995     |"
                + "\n-------------------------------------------------"
        );
    }

    public void display() {
        doAction(null);
    }

    public boolean doAction(String value) {
        // prompt user for 5 inputs, change the user input from String to double
        double quantity = Double.parseDouble(getInput("How many rooms would you like to rent?"));
        double roomCharge = Double.parseDouble(getInput("Enter the cost of the rooms you would like to rent."));
        double bankAccount = Double.parseDouble(getInput("How much is in your bank account?"));
       
        // new instance of BankingControl class
        BankingControl hotel = new BankingControl();

        double payHotelCost = hotel.calcHotelCost(roomCharge, bankAccount, quantity);

        if (payHotelCost == -999) {
            System.out.println("\nYou don't have enough for that purchase, try again.");
            
        }else
            System.out.println("\nYou have " + payHotelCost + "left in your bank account");
        
        return true;
        }

}
