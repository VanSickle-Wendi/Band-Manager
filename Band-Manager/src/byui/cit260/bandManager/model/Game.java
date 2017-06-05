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
public class Game implements Serializable {

    // class instance variables
    private double totalMoney;
    private double totalPerformancePoints;

    public Game() {
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalPerformancePoints() {
        return totalPerformancePoints;
    }

    public void setTotalPerformancePoints(double totalPerformancePoints) {
        this.totalPerformancePoints = totalPerformancePoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalMoney) ^ (Double.doubleToLongBits(this.totalMoney) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalPerformancePoints) ^ (Double.doubleToLongBits(this.totalPerformancePoints) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalMoney=" + totalMoney + ", totalPerformancePoints=" + totalPerformancePoints + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalMoney) != Double.doubleToLongBits(other.totalMoney)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalPerformancePoints) != Double.doubleToLongBits(other.totalPerformancePoints)) {
            return false;
        }
        return true;
    }

}
