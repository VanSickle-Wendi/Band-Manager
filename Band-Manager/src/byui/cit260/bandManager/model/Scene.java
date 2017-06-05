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
public class Scene implements Serializable {

    // class instance variables
    private String sceneDescription;
    private char symbol;

    public Scene() {
    }

    public String getSceneDescription() {
        return sceneDescription;
    }

    public void setSceneDescription(String sceneDescription) {
        this.sceneDescription = sceneDescription;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.sceneDescription);
        hash = 31 * hash + this.symbol;
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneDescription=" + sceneDescription + ", symbol=" + symbol + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (this.symbol != other.symbol) {
            return false;
        }
        if (!Objects.equals(this.sceneDescription, other.sceneDescription)) {
            return false;
        }
        return true;
    }

}
