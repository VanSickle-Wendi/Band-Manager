/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import byui.cit260.bandManager.model.Game;

/**
 *
 * @author Wendi
 */
public class MemberStatusMenuView extends MenuView {

    private String menu;
    private String promptMessage;
    private Game game;

    public MemberStatusMenuView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n| Band Members and Status Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nD -- Drummer"
                + "\nS -- Singer"                
                + "\nG -- Guitarist"
                + "\nB -- Bass Guitarist"
                + "\nK -- Keyboard Player"
                + "\nQ -- Quit the Game Menu"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nPlease choose a Band Member: ");

    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "D": // View Map
                this.drummerStatus();
                break;
            case "S": // Hold Auditions
                this.singerStatus();
                break;                
            case "G": // Bank Menu
                this.guitaristStatus();
                break;
            case "B": // Hold Auditions
                this.bassPlayerStatus();
                break;
            case "K": // Asset Menu
                this.keyboardPlayerStatus();
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

    private void drummerStatus() {
        try {
            console.println("\nDrummer: " + BandManager.getCurrentGame().getBand().getDrummer().getMusicianName()
                    + " Issue: "
                    + BandManager.getCurrentGame().getBand().getDrummer().getIssueDescription()
                    + "\nSkill Level: "
                    + BandManager.getCurrentGame().getBand().getDrummer().getSkillLevel()
                    + " Instrument Quality: "
                    + BandManager.getCurrentGame().getBand().getDrummer().getInstrumentQuality()
                    + " Issue Cost: "
                    + BandManager.getCurrentGame().getBand().getDrummer().getIssueCost());
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Go to the Audition Menu to audition a drummer." + e.getMessage());
        }
    }

    private void singerStatus() {
        try {
            console.println("\nSinger: " + BandManager.getCurrentGame().getBand().getSinger().getMusicianName()
                    + " Issue: "
                    + BandManager.getCurrentGame().getBand().getSinger().getIssueDescription()
                    + "\nSkill Level: "
                    + BandManager.getCurrentGame().getBand().getSinger().getSkillLevel()
                    + " Instrument Quality: "
                    + BandManager.getCurrentGame().getBand().getSinger().getInstrumentQuality()
                    + " Issue Cost: "
                    + BandManager.getCurrentGame().getBand().getSinger().getIssueCost());
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Go to the Audition Menu to audition a singer." + e.getMessage());
        }
    }

    private void guitaristStatus() {
        try {
            console.println("\nGuitar: " + BandManager.getCurrentGame().getBand().getGuitarPlayer().getMusicianName()
                    + " Issue: "
                    + BandManager.getCurrentGame().getBand().getGuitarPlayer().getIssueDescription()
                    + "\nSkill Level: "
                    + BandManager.getCurrentGame().getBand().getGuitarPlayer().getSkillLevel()
                    + " Instrument Quality: "
                    + BandManager.getCurrentGame().getBand().getGuitarPlayer().getInstrumentQuality()
                    + " Issue Cost: "
                    + BandManager.getCurrentGame().getBand().getGuitarPlayer().getIssueCost());
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Go to the Audition Menu to audition a guitar player." + e.getMessage());
        }
    }

    private void bassPlayerStatus() {
        try {
            console.println("\nBass: " + BandManager.getCurrentGame().getBand().getBassPlayer().getMusicianName()
                    + " Issue: "
                    + BandManager.getCurrentGame().getBand().getBassPlayer().getIssueDescription()
                    + "\nSkill Level: "
                    + BandManager.getCurrentGame().getBand().getBassPlayer().getSkillLevel()
                    + " Instrument Quality: "
                    + BandManager.getCurrentGame().getBand().getBassPlayer().getInstrumentQuality()
                    + " Issue Cost: "
                    + BandManager.getCurrentGame().getBand().getBassPlayer().getIssueCost());
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Go to the Audition Menu to audition a bass player." + e.getMessage());
        }
    }

    private void keyboardPlayerStatus() {
        try {
            console.println("\nKeyboards: " + BandManager.getCurrentGame().getBand().getKeyboardPlayer().getMusicianName()
                    + " Issue: "
                    + BandManager.getCurrentGame().getBand().getKeyboardPlayer().getIssueDescription()
                    + "\nSkill Level: "
                    + BandManager.getCurrentGame().getBand().getKeyboardPlayer().getSkillLevel()
                    + " Instrument Quality: "
                    + BandManager.getCurrentGame().getBand().getKeyboardPlayer().getInstrumentQuality()
                    + " Issue Cost: "
                    + BandManager.getCurrentGame().getBand().getKeyboardPlayer().getIssueCost());
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Go to the Audition Menu to audition a keyboard player." + e.getMessage());
        }
    }

}
