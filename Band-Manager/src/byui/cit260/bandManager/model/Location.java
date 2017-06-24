/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author Wendi
 */
public class Location implements Serializable {

    // class instance variables
    private String name;
    private double locationNumber;
    private double timesVisited;
    private Scene scene;
    private Band band;

    public Location() {
    }

    public Location(String locationName) {
        // convenience constructor
        name = locationName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public double getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(double locationNumber) {
        this.locationNumber = locationNumber;
    }

    public double getTimesVisited() {
        return timesVisited;
    }

    public void setTimesVisited(double timesVisited) {
        this.timesVisited = timesVisited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene locationScene) {
        this.scene = locationScene;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.locationNumber) ^ (Double.doubleToLongBits(this.locationNumber) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.timesVisited) ^ (Double.doubleToLongBits(this.timesVisited) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "locationNumber=" + locationNumber + ", timesVisited=" + timesVisited + '}';
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.locationNumber) != Double.doubleToLongBits(other.locationNumber)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timesVisited) != Double.doubleToLongBits(other.timesVisited)) {
            return false;
        }
        return true;
    }

}
