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
public class Vehicle implements Serializable {

    // class instance variables
    private double vehicleLevel;

    public Vehicle() {
    }

    public double getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(double vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.vehicleLevel) ^ (Double.doubleToLongBits(this.vehicleLevel) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleLevel=" + vehicleLevel + '}';
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
        final Vehicle other = (Vehicle) obj;
        if (Double.doubleToLongBits(this.vehicleLevel) != Double.doubleToLongBits(other.vehicleLevel)) {
            return false;
        }
        return true;
    }

}
