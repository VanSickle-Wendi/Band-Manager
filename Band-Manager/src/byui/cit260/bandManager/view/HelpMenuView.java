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
                    + "\n| Help Menu |"
                    + "\n--------------------------------------------------"
                    + "\nG -- What is the goal of the game"
                    + "\nL -- How to make payments or pay off the loan"
                    + "\nU -- How to upgrade instruments/equipment"
                    + "\nQ -- Quit the Help Menu"
                    + "\n--------------------------------------------------";
    
        this.promptMessage = "\nPlease choose a Help Menu option: ";
    }
    
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            System.out.println(menu);
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            
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
        System.out.println("*** goalOfGame function called ***");
    }

    private void payOnLoan() {
        System.out.println("*** payOnLoan function called ***");
    }

    private void upgradeInstruments() {
        System.out.println("*** upgrade instruments function called ***");
    }
}
