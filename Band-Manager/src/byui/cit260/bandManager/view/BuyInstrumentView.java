/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;

/**
 *
 * @author shaza
 */
public class BuyInstrumentView extends InteractiveView {
    public BuyInstrumentView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  You are at the Music Store                   |"
                + "\n-------------------------------------------------"
                + "\n  Pick an instrument to buy                      "
                + "\n                                                 "
                + "\n  Yamaha Stage                        | $499.99 |"
                + "\n  Pearl Masters                       | $749.50 |"
                + "\n  Party Suite with 3 bedrooms:        |$109999  |"
                + "\n  DW Performance                      |$1665.98 |"
                + "\n-------------------------------------------------"
        );
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        // prompt user for 5 inputs, change the user input from String to double
        String buyDrums = (getInput("Which drum set would you like to buy?"));
        
                System.out.println("\n" + buyDrums + " is a good choice");
                
                return true;

    }

}