/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaza
 */
public abstract class InteractiveView implements ViewInterface {

    protected String display;
    
    protected final BufferedReader keyboard = BandManager.getInFile();
    protected final PrintWriter console = BandManager.getOutFile();

    public InteractiveView() {

    }

    public InteractiveView(String message) {
        this.display = message;
        System.out.println(message);
    }

    @Override
    public void display() {

    }

    @Override
    public String getInput() {

        return null;
    }

    @Override
    public String getInput(String prompt) {

        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        try {

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + prompt);

            value = keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                //ErrorView.display(this.getClass().getName(),
                System.out.println("\nInvalid value: value can not be blank");
                continue;

            }
            valid = true; // End the loop
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
                
        return value; // return the value entered
    }

}
