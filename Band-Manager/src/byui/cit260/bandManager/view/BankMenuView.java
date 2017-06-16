/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;
import byui.cit260.bandManager.model.Game;
import java.util.Scanner;

/**
 *
 * @author Crazian
 */
public class BankMenuView extends MenuView {

    private String promptMessage;
    private BankingControl bankControl;
    private Game game;

    public BankMenuView() {
           super( "\n"
                + "\n-------------------------------------------------"
                + "\n| Bank Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nB -- Check bank account"
                + "\nT -- Take out Loan"
                + "\nL -- Check loan status/make payment"
                + "\nP -- Pay Band Salary"
                + "\nQ -- Quit the Bank Menu"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nPlease choose a Bank Menu option: ");

        bankControl = new BankingControl(); //Imported

    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "B": // View Bank Account Contents
                this.viewBankAccount();
                break;
            case "T": // Take Loan from bank
                this.takeLoan();
                break;
            case "L": // Check Loan Status or Pay a Loan
                this.checkLoanStatusPayLoan();
                break;
            case "P": // Pay the Bands Salary
                this.payBand();
                break;
            case "Q": // Quit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void viewBankAccount() {
        System.out.println("*** viewBankAccount function called ***");
    }

    private void checkLoanStatusPayLoan() {
        System.out.println("*** checkLoanStatusPayLoan function called ***");
    }

    private void payBand() {
        // display the pay band view
        PayBandView bandSalary = new PayBandView();
        bandSalary.displayPayBandView();
    }

    private void takeLoan() {
        int loanAmount = -1;
        Scanner userInput = new Scanner(System.in);
        while (loanAmount < 500 || loanAmount > 25000) {
            System.out.println("Please enter a number that is between $500.00 and $25000.00");
            while (!userInput.hasNextInt()) {
                userInput.next();
            }
            loanAmount = userInput.nextInt();
        }

    }

}
