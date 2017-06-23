/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;

/**
 *
 * @author Crazian
 */
public class CarLotView extends InteractiveView {
    public CarLotView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Welcome to the Car Lot                       |"
                + "\n-------------------------------------------------"
                + "\n  Pick a vehicle you would like to buy           "
                + "\n                                                 "
                + "\n  Volkswagen Bus                      |$5000.00 |"
                + "\n  Conversion Van                      |$5000.00 |"
                + "\n  Mini Van                            |$5000.00 |"
                + "\n-------------------------------------------------"
        );
    }
    
@Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
       
        String buyVehicle = (getInput("Which vehicle would you like to buy?"));
        
                System.out.println("\n" + buyVehicle + " will get you where you need to be!");
                
                return true;

    }

}