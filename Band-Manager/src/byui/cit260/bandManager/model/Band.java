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
 * @author Crazian
 */
public class Band implements Serializable {
    
    // class instance variables
    private String drummer;
    private String singer;
    private String guitarPlayer;
    private String bassPlayer;
    private String keyboardPlayer;
    private double vehiclePoints;
    private String bandName;

    public Band() {
    }
    
    
    
    public String getDrummer() {
        return drummer;
    }

    public void setDrummer(String drummer) {
        this.drummer = drummer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGuitarPlayer() {
        return guitarPlayer;
    }

    public void setGuitarPlayer(String guitarPlayer) {
        this.guitarPlayer = guitarPlayer;
    }

    public String getBassPlayer() {
        return bassPlayer;
    }

    public void setBassPlayer(String bassPlayer) {
        this.bassPlayer = bassPlayer;
    }

    public String getKeyboardPlayer() {
        return keyboardPlayer;
    }

    public void setKeyboardPlayer(String keyboardPlayer) {
        this.keyboardPlayer = keyboardPlayer;
    }

    public double getVehiclePoints() {
        return vehiclePoints;
    }

    public void setVehiclePoints(double vehiclePoints) {
        this.vehiclePoints = vehiclePoints;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.drummer);
        hash = 67 * hash + Objects.hashCode(this.singer);
        hash = 67 * hash + Objects.hashCode(this.guitarPlayer);
        hash = 67 * hash + Objects.hashCode(this.bassPlayer);
        hash = 67 * hash + Objects.hashCode(this.keyboardPlayer);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.vehiclePoints) ^ (Double.doubleToLongBits(this.vehiclePoints) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.bandName);
        return hash;
    }

    @Override
    public String toString() {
        return "Band{" + "drummer=" + drummer + ", singer=" + singer + ", guitarPlayer=" + guitarPlayer + ", bassPlayer=" + bassPlayer + ", keyboardPlayer=" + keyboardPlayer + ", vehiclePoints=" + vehiclePoints + ", bandName=" + bandName + '}';
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
        final Band other = (Band) obj;
        if (Double.doubleToLongBits(this.vehiclePoints) != Double.doubleToLongBits(other.vehiclePoints)) {
            return false;
        }
        if (!Objects.equals(this.drummer, other.drummer)) {
            return false;
        }
        if (!Objects.equals(this.singer, other.singer)) {
            return false;
        }
        if (!Objects.equals(this.guitarPlayer, other.guitarPlayer)) {
            return false;
        }
        if (!Objects.equals(this.bassPlayer, other.bassPlayer)) {
            return false;
        }
        if (!Objects.equals(this.keyboardPlayer, other.keyboardPlayer)) {
            return false;
        }
        if (!Objects.equals(this.bandName, other.bandName)) {
            return false;
        }
        return true;
    }
    
    
    
}
