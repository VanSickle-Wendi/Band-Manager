/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.EquipmentControl;
import byui.cit260.bandManager.exceptions.BankControlException;
import byui.cit260.bandManager.exceptions.EquipmentControlException;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Vehicle;
import byui.cit260.bandManager.model.CarLotScene;
import java.io.PrintWriter;
/**
 *
 * @author Crazian
 */
public class BuyVehicleMenuView extends MenuView {
    
    private String promptMessage;
    private EquipmentControl equipmentControl;
    private final CarLotScene scene = new CarLotScene();
    private Game game;
    int item;
    
    
    public BuyVehicleMenuView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n| Buy Vehicle Menu                          |"
                + "\n-------------------------------------------------"
                + "\nD -- Buy Level One"
                + "\nG -- Buy Level Two"
                + "\nB -- Buy Level Three"
                + "\nK -- Buy Level Four"     
                + "\nR -- Print List of Vehicles"
                + "\nA -- Go to Asset Menu"
                + "\nQ -- Quit this Menu"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nChoose a type of Vehicle to purchase: ");

        equipmentControl = new EquipmentControl();

    }
    
    public void setGame(Game game) {
        this.game = game;
    }
    
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "D": // buy LevelOneVehicle
                this.buyLevelOneVehicle(scene.getLevelOneVehicle());
                break;
            case "G": // buy LevelTwoVehicle
                this.buyLevelTwoVehicle(scene.getLevelTwoVehicle());
                break;
            case "B": // buy LevelThreeVehicle
                this.buyLevelThreeVehicle(scene.getLevelThreeVehicle());
                break;
            case "K": // buy LevelFourVehicle
                this.buyLevelFourVehicle(scene.getLevelFourVehicle());
                break;
            case "R": // Calculate Audition Points
                this.printList();
                break;
            case "A": // Calculate Audition Points
                this.goToAssetMenu();
                break;
            case "Q": // Quit
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
    
     private String getUserInput(String prompt) {

        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        try {

            while (!valid) { // loop while an invalid value is entered
                this.console.println("\n" + prompt);
                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                            "\nInvalid value: value can not be blank");
                    continue;
                }
                break; // end the loop
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }

        return value; // return the value entered
    }
    
    public Vehicle buyLevelOneVehicle(Vehicle[] LevelOneVehicle) {
        Vehicle bandLevelOneVehicle = null;
        CarLotMenuView showLevelOneVehicle = new CarLotMenuView();
        int buyLevelOneVehicle = 0;
        int a = 1;

        showLevelOneVehicle.viewListOfLevelOneVehicle(scene.getLevelOneVehicle());
        do {
            try {
                buyLevelOneVehicle = Integer.parseInt(getUserInput("Please enter a corresponding number to the Vehicle "
                        + "\nyou would like to purchase (1, 2, or 3): "));
                a = 2;

            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, or 3");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.vehicleAssets(buyLevelOneVehicle);
            bandLevelOneVehicle = LevelOneVehicle[item];
            
            PrintWriter pw = new PrintWriter(console);

            pw.printf("You have purchased %s, ", bandLevelOneVehicle.getType());
            pw.printf("%s, ", bandLevelOneVehicle.getDescription());
            pw.printf("$%s%n", bandLevelOneVehicle.getPrice());

        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandLevelOneVehicle;
    }
    
    public Vehicle buyLevelTwoVehicle(Vehicle[] LevelTwoVehicle) {
        Vehicle bandLevelTwoVehicle = null;
        CarLotMenuView showLevelTwoVehicle = new CarLotMenuView();
        int buyLevelTwoVehicle = 0;
        int a = 1;

        showLevelTwoVehicle.viewListOfLevelTwoVehicle(scene.getLevelTwoVehicle());
        do {
            try {
                buyLevelTwoVehicle = Integer.parseInt(getUserInput("Please enter a corresponding number to the Vehicle "
                        + "\nyou would like to purchase (1, 2, or 3): "));
                a = 2;

            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, or 3");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.vehicleAssets(buyLevelTwoVehicle);
            bandLevelTwoVehicle = LevelTwoVehicle[item];
            
            PrintWriter pw = new PrintWriter(console);
            
            pw.printf("You have purchased %s, ", bandLevelTwoVehicle.getType());
            pw.printf("%s, ", bandLevelTwoVehicle.getDescription());
            pw.printf("$%s%n", bandLevelTwoVehicle.getPrice());

        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandLevelTwoVehicle;
    }
    
    public Vehicle buyLevelThreeVehicle(Vehicle[] LevelThreeVehicle) {
        Vehicle bandLevelThreeVehicle = null;
        CarLotMenuView showLevelThreeVehicle = new CarLotMenuView();
        int buyLevelThreeVehicle = 0;
        int a = 1;

        showLevelThreeVehicle.viewListOfLevelThreeVehicle(scene.getLevelThreeVehicle());
        do {
            try {
                buyLevelThreeVehicle= Integer.parseInt(getUserInput("Please enter a corresponding number to the Vehicle "
                        + "\nyou would like to purchase (1, 2, or 3): "));
                a = 2;

            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, or 3");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.vehicleAssets(buyLevelThreeVehicle);
            bandLevelThreeVehicle = LevelThreeVehicle[item];
            
            PrintWriter pw = new PrintWriter(console);
            
            pw.printf("You have purchased %s, ", bandLevelThreeVehicle.getType());
            pw.printf("%s, ", bandLevelThreeVehicle.getDescription());
            pw.printf("$%s%n", bandLevelThreeVehicle.getPrice());


        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandLevelThreeVehicle;
    }
    
    public Vehicle buyLevelFourVehicle(Vehicle[] LevelFourVehicle) {
        Vehicle bandLevelFourVehicle = null;
        CarLotMenuView showLevelFourVehicle = new CarLotMenuView();
        int buyLevelFourVehicle = 0;
        int a = 1;

        showLevelFourVehicle.viewListOfLevelFourVehicle(scene.getLevelFourVehicle());
        do {
            try {
                buyLevelFourVehicle= Integer.parseInt(getUserInput("Please enter a corresponding number to the Vehicle "
                        + "\nyou would like to purchase (1, 2, or 3): "));
                a = 2;

            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, or 3");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.vehicleAssets(buyLevelFourVehicle);
            bandLevelFourVehicle = LevelFourVehicle[item];
            
            PrintWriter pw = new PrintWriter(console);
            
            pw.printf("You have purchased %s, ", bandLevelFourVehicle.getType());
            pw.printf("%s, ", bandLevelFourVehicle.getDescription());
            pw.printf("$%s%n", bandLevelFourVehicle.getPrice());


        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandLevelFourVehicle;
    }
    private void printList() {
        VehicleReportView printReport = new VehicleReportView();
        // assetMenu.setGame(game);
        printReport.display();
    }

    private void goToAssetMenu() {

        AssetMenuView assetMenu = new AssetMenuView();
        // assetMenu.setGame(game);
        assetMenu.display();
    }


}
    
    
   


