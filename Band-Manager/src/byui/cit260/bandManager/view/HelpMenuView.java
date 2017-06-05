/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import java.util.Scanner;

/**
 *
 * @author Crazian
 */
class HelpMenuView {

    private String menu;
    private String promptMessage;

    public HelpMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------------------"
                + "\n| Help Menu                                     |"
                + "\n-------------------------------------------------"
                + "\nG -- What is the goal of the game"
                + "\nL -- How to make payments or pay off the loan"
                + "\nU -- How to upgrade instruments/equipment"
                + "\nQ -- Quit the Help Menu"
                + "\n-------------------------------------------------";

        this.promptMessage = "\nPlease choose a Help Menu option: ";
    }

    public void displayHelpMenuView() {

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
            case "G": // goal of the game
                this.goalOfGame();
                break;
            case "L": // payments and payoff loan
                this.payOnLoan();
                break;
            case "U": // upgrade instuments/equipment
                this.upgradeInstruments();
                break;
            case "Q": // Quit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void goalOfGame() {
        System.out.println("\n"
                + "\n--------------------------------------------------"
                + "\n The goal of the game is to take your band to     "
                + "\n the highest star status while paying off your    "
                + "\n loan and becoming a financial success yourself.  "
                + "\n--------------------------------------------------"
        );
    }

    private void payOnLoan() {
        System.out.println("\n"
                + "\n--------------------------------------------------"
                + "\n Loan payments are due at the completion of each  "
                + "\n level. If the band manager doesn’t have enough   "
                + "\n money to cover their loan payment, game is lost. "
                + "\n--------------------------------------------------"
        );
    }

    private void upgradeInstruments() {
        System.out.println("\n"
                + "\n--------------------------------------------------"
                + "\n After the band members are selected or a level is"
                + "\n completed, the manager is able to upgrade the    "
                + "\n band’s instruments or equipment using the Assets "
                + "\n Menu.                                            "
                + "\n--------------------------------------------------"
        );
    }
}
