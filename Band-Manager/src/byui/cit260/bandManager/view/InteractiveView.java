/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import java.util.Scanner;

/**
 *
 * @author shaza
 */
public abstract class InteractiveView implements ViewInterface {
    
    protected String display;    

    public InteractiveView() {
    }

    public InteractiveView(String interactiveMessage) {
        display = interactiveMessage;
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
            valid = true; // End the loop
        }
        return value; // return the value entered
    }
    
   /* public double getDouble(String prompt) {
        String number = getInput(prompt);
        
        return Double.parseDouble(number);
        
        
    }*/
}
