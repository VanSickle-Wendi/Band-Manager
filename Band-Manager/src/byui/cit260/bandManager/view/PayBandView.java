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
        // prompt user for 5 inputs, change the user input from String to double
        double venuePayment = Double.parseDouble(getInput("How much did you get paid?"));
        double equipmentCost = Double.parseDouble(getInput("What did you spend on equipment?"));
        double hotelCost = Double.parseDouble(getInput("How much did you spend on hotel?"));
        double salaryPercentage = Double.parseDouble(getInput("What percentage do you want to pay the band?"));
        double bankAccount = Double.parseDouble(getInput("How much is in your bank account?"));

        // new instance of BankingControl class
        BankingControl salary = new BankingControl();

        double payBandSalary = salary.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
        System.out.println("\nYou owe the band " + payBandSalary);

        return true;
    }

}
