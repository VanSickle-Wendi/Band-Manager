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
    
      public boolean doAction(String value) {
        // prompt user for 5 inputs, change the user input from String to double
        double initialLoan = Double.parseDouble(getInput("Please enter the amount you would like to request for a loan"));
        
        System.out.println("\nHere is your loan of " + initialLoan);

        return true;
    }

}
