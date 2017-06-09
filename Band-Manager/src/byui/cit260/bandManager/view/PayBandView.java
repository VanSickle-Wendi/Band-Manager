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
public class PayBandView {

    public PayBandView() {

        this.displayBanner();

    }

    private void displayBanner() {

        System.out.println("\n"
                + "\n-------------------------------------------------"
                + "\n|  It's time to pay the band                     |"
                + "\n-------------------------------------------------"
                + "\n   The band just finished playing a gig.         "
                + "\n   They want their money!                        "
                + "\n-------------------------------------------------"
        );
    }

    private String getSalaryInput(String prompt) {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + prompt);
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; // end the loop
        }

        return value; // return the value entered
    }

    public void displayPayBandView() {
        // prompt user for 5 inputs, change the user input from String to double
        double venuePayment = Double.parseDouble(getSalaryInput("How much did you get paid?"));
        double equipmentCost = Double.parseDouble(getSalaryInput("What did you spend on equipment?"));
        double hotelCost = Double.parseDouble(getSalaryInput("How much did you spend on hotel?"));
        double salaryPercentage = Double.parseDouble(getSalaryInput("What percentage do you want to pay the band?"));
        double bankAccount = Double.parseDouble(getSalaryInput("How much is in your bank account?"));

        // new instance of BankingControl class
        BankingControl salary = new BankingControl();

        double payBandSalary = salary.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
        System.out.println("\nYou owe the band " + payBandSalary);
    }

}
