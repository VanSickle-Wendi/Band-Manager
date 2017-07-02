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
public class PayBandView extends InteractiveView {


    public PayBandView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  It's time to pay the band                     |"
                + "\n-------------------------------------------------"
                + "\n   The band just finished playing a gig.         "
                + "\n   They want their money!                        "
                + "\n-------------------------------------------------"
        );
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        double venuePayment = 0;
        double equipmentCost = 0;
        double hotelCost = 0;
        double salaryPercentage = 0;
        double bankAccount = 0;
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 1;
       

        
        do {
            // prompt user for 5 inputs, change the user input from String to double
            try {
                venuePayment = Double.parseDouble(getInput("How much did you get paid?"));
                a = 2;
            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a valid number.");

            }
        } while (a == 1);

        do {
            try {
                equipmentCost = Double.parseDouble(getInput("What did you spend on equipment?"));
                b = 2;
            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a valid number.");
            }
        } while (b == 1);

        do {
            try {
                hotelCost = Double.parseDouble(getInput("How much did you spend on hotel?"));
                c = 2;

            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a valid number.");
            }
        } while (c == 1);

        do {
            try {
                salaryPercentage = Double.parseDouble(getInput("What percentage do you want to pay the band?"));
                d = 2;

            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a valid number.");
            }
        } while (d == 1);

        do {
            try {
                bankAccount = Double.parseDouble(getInput("How much is in your bank account?"));
                e = 2;

            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a valid number.");
            }
        } while (e == 1);

        // new instance of BankingControl class
        BankingControl salary = new BankingControl();

        try {
            double payBandSalary;

            payBandSalary = salary.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
            System.out.println("\nYou owe the band " + payBandSalary);
           

        } catch (BankControlException bce) {
            System.out.println(bce.getMessage());
        }

        return true;

        
    }

}
