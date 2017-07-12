/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import byui.cit260.bandManager.control.EquipmentControl;
import byui.cit260.bandManager.control.GameControl;
import byui.cit260.bandManager.model.Instrument;
import java.text.DecimalFormat;

/**
 *
 * @author shaza
 */
public class InstrumentReportView extends InteractiveView {

    public InstrumentReportView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Print Report                                 |"
                + "\n-------------------------------------------------"
                + "\n  Print List of Instruments                      "
                + "\n                                                 "
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
            // save the report to the specified file TODO change to a map report
            GameControl.mapReport(BandManager.getCurrentGame().getMap().getLocations(), value);
        } catch (Exception e) {
            ErrorView.display("MapReportView", e.getMessage());
        }

        return false;

    }
    
   // public static void instrumentReport(Instrument[] purchasedInstruments, String filePath){
      //  try (PrintWriter out = new PrintWriter(filePath)) {
            
         //   out.println("\n\n           Inventory Report                             ");
        //    out.printf()
       // }
        
   // }
}