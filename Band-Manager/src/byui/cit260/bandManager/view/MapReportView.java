/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import byui.cit260.bandManager.control.GameControl;
import byui.cit260.bandManager.model.Band;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Location;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Wendi
 */
public class MapReportView extends InteractiveView {

    public MapReportView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Print a map report                            |"
                + "\n-------------------------------------------------"
        );
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
                // prompt for and get the name of the file to save the report in
                this.console.println("\n\nEnter the file path for file where the report"
                        + " is to be saved.");

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

            mapReport(BandManager.getCurrentGame().getMap().getLocations(), value);
        } catch (Exception e) {
            ErrorView.display("MapReportView", e.getMessage());
        }

        return false;

    }
    public static void mapReport(Location[] locations, String filePath)  {

        try (PrintWriter mapReportFile = new PrintWriter(new FileWriter(filePath))) {

            //Print title and column headings
            mapReportFile.println("\n\n                          Map Report                      ");
            mapReportFile.printf("%n%-25s%-45s%-10s%n", "Scene", "Scene Description", "Location #");
            mapReportFile.printf("%n%-25s%-45s%-10s%n", "-----", "-----------------", "----------");
            for (int i = 0; i < locations.length; i++) {
                mapReportFile.printf("%n%-25s%-45s%-10s%n", locations[i].getName(),
                         locations[i].getScene().getSceneDescription(),
                         locations[i].getLocationNumber());
            }
            mapReportFile.close();
        } catch (Exception e) {
            ErrorView.display("MapReportView", e.getMessage());
        }
    }    
    
}
