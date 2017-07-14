/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import byui.cit260.bandManager.control.EquipmentControl;
import byui.cit260.bandManager.control.GameControl;
import static byui.cit260.bandManager.control.GameControl.MusicStoreScene;
import byui.cit260.bandManager.exceptions.EquipmentControlException;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Instrument;
import byui.cit260.bandManager.model.MusicStoreScene;
import java.io.PrintWriter;
import java.text.DecimalFormat;

/**
 *
 * @author shaza
 */
public class InstrumentReportView extends InteractiveView {

    private final MusicStoreScene scene = new MusicStoreScene();
    private Game game;

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
            // save the report to the specified file TODO change to a map report
            instrumentReport(scene.getDrums(), scene.getGuitar(), scene.getBass(), scene.getKeyboard(), scene.getMic(), value);
        } catch (Exception e) {
            ErrorView.display("InstrumentReportView", e.getMessage());
        }

        this.console.println("\nSuccess! Your report file was saved to: " + value);

        return false;

    }

    public static void instrumentReport(Instrument[] drums, Instrument[] guitar, Instrument[] bass,
            Instrument[] keyboard, Instrument[] mic, String filePath) {
        PrintWriter out = null;

        try {
            out = new PrintWriter(filePath);

            out.println("\n\n                           Instrument Report                         ");
            out.printf("%n%-25s%-45s%-10s%n", "Type", "Description", "Price");
            out.printf("%n%-25s%-45s%-10s%n", "-----", "-----------------", "----------");
            for (int i = 0; i < drums.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n", drums[i].getType(),
                        drums[i].getDescription(),
                        drums[i].getPrice());

            }
            for (int i = 0; i < guitar.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n", guitar[i].getType(),
                        guitar[i].getDescription(),
                        guitar[i].getPrice());

            }
            for (int i = 0; i < bass.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n", bass[i].getType(),
                        bass[i].getDescription(),
                        bass[i].getPrice());

            }
            for (int i = 0; i < keyboard.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n", keyboard[i].getType(),
                        keyboard[i].getDescription(),
                        keyboard[i].getPrice());

            }
            for (int i = 0; i < mic.length; i++) {
                out.printf("%n%-25s%-45s%-10s%n", mic[i].getType(),
                        mic[i].getDescription(),
                        mic[i].getPrice());

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
