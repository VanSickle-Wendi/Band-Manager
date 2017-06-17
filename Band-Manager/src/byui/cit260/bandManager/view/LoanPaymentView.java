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
public class LoanPaymentView extends InteractiveView {

    public LoanPaymentView() {

        this.displayBanner();

    }

    private void displayBanner() {

        System.out.println("\n"
                + "\n-------------------------------------------------"
                + "\n|  It's time to make a loan payment.            |"
                + "\n-------------------------------------------------"
                + "\n   Your interest rate is 10%.                    "
                + "\n   You may pay extra principle if you wish.      "
                + "\n-------------------------------------------------"
        );
    }

    public void display() {
        doAction(null);
    }

    public boolean doAction(String value) {
        // prompt user for 5 inputs, change the user input from String to double
        double loanBalance = Double.parseDouble(getInput("How much is your loan balance?"));
        double extraPrinciple = Double.parseDouble(getInput("How much extra principle ?"));

        // new instance of BankingControl class
        BankingControl payLoan = new BankingControl();

        double makeLoanPayment = payLoan.calcLoanPayment(loanBalance, extraPrinciple);
        System.out.println("\nYour loan payment is " + makeLoanPayment);

        return true;
    }

}
