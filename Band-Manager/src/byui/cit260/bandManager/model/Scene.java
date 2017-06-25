/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author shaza
 */
public abstract class Scene {

    // class instance variables
    private String sceneDescription;
   // private char symbol;

    public Scene() {
    }

    public String getSceneDescription() {
        return sceneDescription;
    }

    public void setSceneDescription(String description) {
        this.sceneDescription = description;
    }

   /* public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }*/

}
