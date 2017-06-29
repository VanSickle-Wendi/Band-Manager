/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import static byui.cit260.bandManager.control.GameControl.CarLotScene;
import byui.cit260.bandManager.model.CarLotScene;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Vehicle;
import java.util.Scanner;
/**
 *
 * @author Crazian
 */
public class CarLotMenuView extends MenuView {
    
    
    
    private final CarLotScene scene = new CarLotScene();
    
    public CarLotMenuView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n| Welcome to the Car Lot                        |"
                + "\n-------------------------------------------------"
                + "\nA -- See what we have on lot One"
                + "\nB -- See what we have on lot Two"
                + "\nC -- See what we have on lot Three"
                + "\nD -- See what we have on lot Four"
                + "\nQ -- Leave Music Store"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nPlease choose a Car Lot Menu option: ");

    }
    
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "A": // View Car Lot One
                this.viewListOfLevelOneVehicle(scene.getLevelOneVehicle());
                break;
            case "B": //  View Car Lot Two
                this.viewListOfLevelTwoVehicle(scene.getLevelTwoVehicle());
                break;
            case "C": //  View Car Lot Three
                this.viewListOfLevelThreeVehicle(scene.getLevelThreeVehicle());
                break;
            case "D": //  View Car Lot Four
                this.viewListOfLevelFourVehicle(scene.getLevelFourVehicle());
                break;
            case "Q": // Quit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        

        return false;
    }
    
    private void viewListOfLevelOneVehicle(Vehicle[] levelOneVehicle) {
        StringBuilder line;

        // Display header
        System.out.println("\n         List of vehicles in Lot One");
        line = new StringBuilder("                                     ");
        line.insert(0, "Vehicle Type");
        line.insert(20, "Description");
        line.insert(40, "Price");
        line.insert(50, "Performance Points");
        System.out.println(line.toString());

        // for each loop to display the levelOneCar    
        for (Vehicle carOne : levelOneVehicle) {
            line = new StringBuilder("                                 ");
            line.insert(0, carOne.getType());
            line.insert(20, carOne.getDescription());
            line.insert(40, carOne.getPrice());
            line.insert(50, carOne.getPerformancePoints());

            // Display the line
            System.out.println(line.toString());

        }

    }
    
    private void viewListOfLevelTwoVehicle(Vehicle[] levelTwoVehicle) {
        StringBuilder line;

        // Display header
        System.out.println("\n         List of vehicles in Lot Two");
        line = new StringBuilder("                                     ");
        line.insert(0, "Vehicle Type");
        line.insert(20, "Description");
        line.insert(40, "Price");
        line.insert(50, "Performance Points");
        System.out.println(line.toString());

        // for each loop to display the levelTwoCar    
        for (Vehicle carTwo : levelTwoVehicle) {
            line = new StringBuilder("                                 ");
            line.insert(0, carTwo.getType());
            line.insert(20, carTwo.getDescription());
            line.insert(40, carTwo.getPrice());
            line.insert(50, carTwo.getPerformancePoints());

            // Display the line
            System.out.println(line.toString());

        }

    }
    
    private void viewListOfLevelThreeVehicle(Vehicle[] levelThreeVehicle) {
        StringBuilder line;

        // Display header
        System.out.println("\n         List of vehicles in Lot Three");
        line = new StringBuilder("                                     ");
        line.insert(0, "Vehicle Type");
        line.insert(20, "Description");
        line.insert(40, "Price");
        line.insert(50, "Performance Points");
        System.out.println(line.toString());

        // for each loop to display the levelThreeCar    
        for (Vehicle carThree : levelThreeVehicle) {
            line = new StringBuilder("                                 ");
            line.insert(0, carThree.getType());
            line.insert(20, carThree.getDescription());
            line.insert(40, carThree.getPrice());
            line.insert(50, carThree.getPerformancePoints());

            // Display the line
            System.out.println(line.toString());

        }

    }
    
    private void viewListOfLevelFourVehicle(Vehicle[] levelFourVehicle) {
        StringBuilder line;

        // Display header
        System.out.println("\n         List of vehicles in Lot Three");
        line = new StringBuilder("                                     ");
        line.insert(0, "Vehicle Type");
        line.insert(20, "Description");
        line.insert(40, "Price");
        line.insert(50, "Performance Points");
        System.out.println(line.toString());

        // for each loop to display the levelFourCar    
        for (Vehicle carFour : levelFourVehicle) {
            line = new StringBuilder("                                 ");
            line.insert(0, carFour.getType());
            line.insert(20, carFour.getDescription());
            line.insert(40, carFour.getPrice());
            line.insert(50, carFour.getPerformancePoints());

            // Display the line
            System.out.println(line.toString());

        }

    }
    
    
}
