/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author Crazian
 */
public class Instrument implements Serializable{
    
    // class instance variables
    private double instrumentLevel; 

    public Instrument() {
    }
   
    public double getInstrumentLevel() {
        return instrumentLevel;
    }

    public void setInstrumentLevel(double instrumentLevel) {
        this.instrumentLevel = instrumentLevel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.instrumentLevel) ^ (Double.doubleToLongBits(this.instrumentLevel) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Instrument{" + "instrumentLevel=" + instrumentLevel + '}';
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
        final Instrument other = (Instrument) obj;
        if (Double.doubleToLongBits(this.instrumentLevel) != Double.doubleToLongBits(other.instrumentLevel)) {
            return false;
        }
        return true;
    }
    
    
}
