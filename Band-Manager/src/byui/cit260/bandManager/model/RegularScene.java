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
public class RegularScene implements Serializable {
    
    // class instance variables
    private String regularSceneDescription;
    private char symbol;

    public RegularScene() {
    }

    public String getRegularSceneDescription() {
        return regularSceneDescription;
    }

    public void setRegularSceneDescription(String regularSceneDescription) {
        this.regularSceneDescription = regularSceneDescription;
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
        hash = 31 * hash + Objects.hashCode(this.regularSceneDescription);
        hash = 31 * hash + this.symbol;
        return hash;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "regularSceneDescription=" + regularSceneDescription + ", symbol=" + symbol + '}';
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
        final RegularScene other = (RegularScene) obj;
        if (this.symbol != other.symbol) {
            return false;
        }
        if (!Objects.equals(this.regularSceneDescription, other.regularSceneDescription)) {
            return false;
        }
        return true;
    }
    
}
