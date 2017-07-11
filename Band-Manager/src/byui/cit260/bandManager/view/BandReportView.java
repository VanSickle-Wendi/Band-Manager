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
import java.io.PrintWriter;

/**
 *
 * @author Wendi
 */
public class BandReportView extends InteractiveView {

    public BandReportView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Print a band report                            |"
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
            // save the report to the specified file
            GameControl.bandReport(BandManager.getCurrentGame().getBand(), value);
        } catch (Exception e) {
            ErrorView.display("BandReportView", e.getMessage());
        }

        return false;

    }
}
