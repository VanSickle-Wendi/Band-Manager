/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;
import byui.cit260.bandManager.exceptions.BankControlException;
import byui.cit260.bandManager.model.Game;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaza
 */
public class LoanPaymentView extends InteractiveView {

    private Game game;

    public LoanPaymentView() {

        this.displayBanner();

    }

    private void displayBanner() {

        this.console.println("\n"
                + "\n-------------------------------------------------"
                + "\n|  It's time to make a loan payment.            |"
                + "\n-------------------------------------------------"
                + "\n   Your interest rate is 10%.                    "
                + "\n   You may pay extra principle if you wish.      "
                + "\n-------------------------------------------------"
        );
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public void display() {
        doAction(null);
    }

    public boolean doAction(String value) {

        double loanBalance = 0;
        double extraPrinciple = 0;
        int x = 1;
        int y = 1;
        int z = 1;

        while (z == 1) {
            do {
                try {
                    // prompt user for 5 inputs, change the user input from String to double
                    loanBalance = Double.parseDouble(getInput("How much is your loan balance?"));
                    x = 2;

                } catch (NumberFormatException nf) {

                    ErrorView.display(this.getClass().getName(),
                            "\nYou must enter a valid number.");
                }
            } while (x == 1);

            do {
                try {

                    extraPrinciple = Double.parseDouble(getInput("How much extra principle ?"));
                    y = 2;

                } catch (NumberFormatException nf) {

                    ErrorView.display(this.getClass().getName(),
                            "\nYou must enter a valid number.");
                }
            } while (y == 1);

            // new instance of BankingControl class
            BankingControl payLoan = new BankingControl();

            try {
                double makeLoanPayment;
                makeLoanPayment = payLoan.calcLoanPayment(loanBalance, extraPrinciple);
                //this.console
                System.out.println("\nYour loan payment is " + makeLoanPayment);
                z = 2;

            } catch (BankControlException bce) {
                ErrorView.display(this.getClass().getName(),
                        bce.getMessage());

            }
        }

        return true;
    }

}
