/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;
import byui.cit260.bandManager.exceptions.BankControlException;
import java.text.DecimalFormat;

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
                + "\n  Level One Vehicles                             "
                + "\n  Volkswagen Bus                      |$5000.00 |"
                + "\n  Conversion Van                      |$5000.00 |"
                + "\n  Mini Van                            |$5000.00 |"
                + "\n  Level Two Vehicles                             "
                + "\n  Dodge Grand Caravan                 |$30000.00|"
                + "\n  Chevrolet Express                   |$30000.00|"
                + "\n  Ford Transit Connect	           |$30000.00|"
                + "\n  Level Three Vehicles                           "
                + "\n  Tour Bus                            |$60000.00|"
                + "\n  Hummer Limo	                   |$60000.00|"
                + "\n  Party Bus                           |$60000.00|"
                + "\n  Level Four Vehicles                            "
                + "\n  Conversion Van                     |$100000.00|"
                + "\n  Mini Van                           |$100000.00|"
                + "\n  Volkswagen Bus                     |$100000.00|"
                + "\n-------------------------------------------------"
        );
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        double originalVehicleCost = 0;
        double newVehiclePrice = 0;
        double currentPerformancePoints = 0;
        int x = 1;
        int y = 1;
        int z = 1;

        //Format bank balance to 2 decimal places 
        DecimalFormat df = new DecimalFormat("#.00");

        {
            do {
                try {
                    originalVehicleCost = Double.parseDouble(getInput("How much did you pay for your current vehicle?"));
                    y = 2;

                } catch (NumberFormatException nf) {

                    ErrorView.display(this.getClass().getName(),
                            "\nYou must enter a valid number.");
                }
            } while (y == 1);

            do {
                try {
                    currentPerformancePoints = Double.parseDouble(getInput("How many performance points have you earned?"));
                    z = 2;

                } catch (NumberFormatException nf) {

                    ErrorView.display(this.getClass().getName(),
                            "\nYou must enter a valid number.");
                }
            } while (z == 1);

            do {
                try {
                    newVehiclePrice = Double.parseDouble(getInput("How much is the vehicle you would like to buy?"));
                    x = 2;
                } catch (NumberFormatException nf) {

                    ErrorView.display(this.getClass().getName(),//ErrorView.display(this.getClass().getName(),
                            "\nYou must enter a valid number.");

                }
            } while (x == 1);

            // new instance of BankingControl class
            BankingControl carCost = new BankingControl();

            try {
                double newVehicleCost;

                newVehicleCost = carCost.calcNewVehicleCost(originalVehicleCost, newVehiclePrice, currentPerformancePoints);
                this.console.println("\n Your new vehicle costs" + newVehicleCost);

            } catch (BankControlException bce) {
                ErrorView.display(this.getClass().getName(), bce.getMessage());
            }
        }
        return true;
    }
}
