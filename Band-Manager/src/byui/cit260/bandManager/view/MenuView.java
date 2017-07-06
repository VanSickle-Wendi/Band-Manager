/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Wendi
 */
public abstract class MenuView implements ViewInterface {

    protected String promptMessage;

    protected final BufferedReader keyboard = BandManager.getInFile();
    protected final PrintWriter console = BandManager.getOutFile();

    public MenuView() {
    }

    public MenuView(String message) {
        this.promptMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get menu option
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                return; //exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {

        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid
        try {

            while (!valid) { // loop while an invalid value is entered

                this.console.println("\n" + this.promptMessage);

                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                            "\nInvalid value: value can not be blank");
                    continue;

                }
                valid = true; // End the loop Brother Anderson suggested this instead of break
            }
        } catch (Exception e) {

            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return value; // return the value entered
    }

    @Override
    public String getInput(String prompt) {

        return null;
    }
}
