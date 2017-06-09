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
public class Game implements Serializable {

    // class instance variables
    private Band theBand;
    private double totalMoney;
    private double totalPerformancePoints;

    public Game() {
        theBand = new Band();
    }

    public Band getTheBand() {
        return theBand;
    }

    public void setTheBand(Band theBand) {
        this.theBand = theBand;
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
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.theBand);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.totalMoney) ^ (Double.doubleToLongBits(this.totalMoney) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.totalPerformancePoints) ^ (Double.doubleToLongBits(this.totalPerformancePoints) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "theBand=" + theBand + ", totalMoney=" + totalMoney + ", totalPerformancePoints=" + totalPerformancePoints + '}';
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
        if (!Objects.equals(this.theBand, other.theBand)) {
            return false;
        }
        return true;
    }

}
