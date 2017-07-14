/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import byui.cit260.bandManager.control.EquipmentControl;
import byui.cit260.bandManager.control.GameControl;
import static byui.cit260.bandManager.control.GameControl.CarLotScene;
import byui.cit260.bandManager.exceptions.EquipmentControlException;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.CarLotScene;
import byui.cit260.bandManager.model.Vehicle;
import java.io.PrintWriter;
import java.text.DecimalFormat;
/**
 *
 * @author Crazian
 */

    
   public class VehicleReportView extends InteractiveView {

   private final CarLotScene scene = new CarLotScene();
   private Game game;
   
   public VehicleReportView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Print Report                                 |"
                + "\n-------------------------------------------------"
                + "\n  Print List of Vehicles                         "
                + "\n                                                 "
                + "\n-------------------------------------------------"
        );
    }
   
   public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        boolean valid = false;
        try {
            while (!valid) {

                // prompt for and get the name of the file to save the game in     
                this.console.println("\n\nEnter the file path for file where report"
                        + " is to be saved");

                value = keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                            "\nInvalid value: value can not be blank");
                    continue;
                }
                valid = true;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        
        try {
            
            vehicleReport(scene.getLevelOneVehicle(), scene.getLevelTwoVehicle(), scene.getLevelThreeVehicle(), scene.getLevelFourVehicle(), value);
            
        } catch (Exception e) {
            ErrorView.display("VehicletReportView", e.getMessage());
        }

        this.console.println("\nSuccess! Your report file was saved to: " + value);

        return false;
}
        
    public static void vehicleReport(Vehicle[] LevelOneVehicle, Vehicle[] LevelTwoVehicle, Vehicle[] LevelThreeVehicle,
            Vehicle[] LevelFourVehicle, String filePath) {
        PrintWriter out = null;

        try {
            out = new PrintWriter(filePath);

            out.println("\n\n                           Instrument Report                         ");
            out.printf("%n%-25s%-45s%-10s%n", "Type", "Description", "Price");
            out.printf("%n%-25s%-45s%-10s%n", "-----", "-----------------", "----------");
            for (int i = 0; i < LevelOneVehicle.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n", LevelOneVehicle[i].getType(),
                        LevelOneVehicle[i].getDescription(),
                        LevelOneVehicle[i].getPrice());

            }
            for (int i = 0; i < LevelTwoVehicle.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n", LevelTwoVehicle[i].getType(),
                        LevelTwoVehicle[i].getDescription(),
                        LevelTwoVehicle[i].getPrice());

            }
            for (int i = 0; i < LevelThreeVehicle.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n",LevelThreeVehicle[i].getType(),
                        LevelThreeVehicle[i].getDescription(),
                        LevelThreeVehicle[i].getPrice());

            }
            for (int i = 0; i < LevelFourVehicle.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n", LevelFourVehicle[i].getType(),
                        LevelFourVehicle[i].getDescription(),
                        LevelFourVehicle[i].getPrice());

            }

            out.flush();

        } catch (Exception d) {
            ErrorView.display("Error sending Instrument List to file", d.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e1) {

                    ErrorView.display("Error closing file", e1.getMessage());
                }
            }
        }
    }
}
 

    

