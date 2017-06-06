/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import java.util.Scanner;

/**
 *
 * @author Wendi
 */
public class AuditionMenuView {
    
    private String menu;
    private String promptMessage;

    public AuditionMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------------------"
                + "\n| Audition Menu                                 |"
                + "\n-------------------------------------------------"
                + "\nD -- Audition a Drummer"
                + "\nS -- Audition a Singer"
                + "\nG -- Audition a Guitar Player"
                + "\nB -- Audition a Bass Player"
                + "\nK -- Audition a Keyboard Player"
                + "\nC -- Calculate Audition Points"
                + "\nQ -- Quit the Audition Menu"
                + "\n-------------------------------------------------";     
        
        this.promptMessage = "\nChoose a band member to audition: ";        
        
    } 
    
    public void displayAuditionMenuView() {

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
            case "D": // Audition a Drummer
                this.auditionDrummer();
                break;
            case "S": // Audition a Singer
                this.auditionSinger();
                break;
            case "G": // Audition a Guitar Player
                this.auditionGuitarPlayer();
                break;
            case "B": // Audition a Bass Player
                this.auditionBassPlayer();
                break;
            case "K": // Audition a Keyboard Player
                this.auditionKeyboardPlayer();
                break;
            case "C": // Calculate Audition Points
                this.calculateBandAuditionPoints();
                break;                
            case "Q": // Quit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }    

    private void auditionDrummer() {
        System.out.println("*** auditionDrummer function called ***");
    }

    private void auditionSinger() {
        System.out.println("*** auditionSinger function called ***");
    }

    private void auditionGuitarPlayer() {
        System.out.println("*** auditionGuitarPlayer function called ***");
    }

    private void auditionBassPlayer() {
        System.out.println("*** auditionBassPlayer function called ***");
    }

    private void auditionKeyboardPlayer() {
        System.out.println("*** auditionKeyboardPlayer function called ***");
    }

    private void calculateBandAuditionPoints() {
        System.out.println("*** calculateBandAuditionPoints function called ***");
    }
    
}

