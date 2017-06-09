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
public class BankMenuView {

    private String menu;
    private String promptMessage;
    private BankingControl bankControl;
    private Game game;

    public BankMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------------------"
                + "\n| Bank Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nB -- Check bank account"
                + "\nT -- Take out Loan"
                + "\nL -- Check loan status/make payment"
                + "\nP -- Pay Band Salary"
                + "\nQ -- Quit the Bank Menu"
                + "\n-------------------------------------------------";

        this.promptMessage = "\nPlease choose an Bank Menu option: ";

        bankControl = new BankingControl(); //Imported

    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void displayBankMenuView() {

        boolean done = false; // set flag to not done
        do {
            System.out.println(menu);
            // prompt for and get menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; //exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;

            }
            valid = true; // End the loop
        }
        return value; // return the value entered
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
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

    private String getUserInput(int prompt) {
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
