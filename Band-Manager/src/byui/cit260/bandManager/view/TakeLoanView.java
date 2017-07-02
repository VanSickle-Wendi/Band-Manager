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
 * @author Crazian
 */
public class TakeLoanView extends InteractiveView {

    public TakeLoanView() {

        this.displayBanner();
    }

    private void displayBanner() {

        System.out.println("\n"
                + "\n-------------------------------------------------"
                + "\n|  It's time to get a loan                      |"
                + "\n-------------------------------------------------"
                + "\n   It might be a good idea to get a headstart    "
                + "\n   Just remember all loans have interest         "
                + "\n-------------------------------------------------"
        );
    }

    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        double initialLoan = 0;
        int z = 1;
        // prompt user for 5 inputs, change the user input from String to double
        do {
        try {
            initialLoan = Double.parseDouble(getInput("Please enter the amount you would like to request for a loan"));
            z = 2;
        } catch (NumberFormatException nf) {

            System.out.println("\nYou must enter a valid number.");

        }
        }while (z == 1);

        return true;
    }

}
