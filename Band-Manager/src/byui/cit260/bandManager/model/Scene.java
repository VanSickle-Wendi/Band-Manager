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
    private String description;
   // private char symbol;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setSceneDescription(String description) {
        this.description = description;
    }

   /* public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }*/

}
