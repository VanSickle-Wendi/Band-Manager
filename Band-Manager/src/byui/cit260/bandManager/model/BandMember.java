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
public class BandMember implements Serializable {

    private String memberName;
    private double currentSkillLevel;
    private String currentIssue;
    private double equipmentPoints;

    public BandMember() {
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public double getCurrentSkillLevel() {
        return currentSkillLevel;
    }

    public void setCurrentSkillLevel(double currentSkillLevel) {
        this.currentSkillLevel = currentSkillLevel;
    }

    public String getCurrentIssue() {
        return currentIssue;
    }

    public void setCurrentIssue(String currentIssue) {
        this.currentIssue = currentIssue;
    }

    public double getEquipmentPoints() {
        return equipmentPoints;
    }

    public void setEquipmentPoints(double equipmentPoints) {
        this.equipmentPoints = equipmentPoints;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.memberName);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.currentSkillLevel) ^ (Double.doubleToLongBits(this.currentSkillLevel) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.currentIssue);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.equipmentPoints) ^ (Double.doubleToLongBits(this.equipmentPoints) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "BandMember{" + "memberName=" + memberName + ", currentSkillLevel=" + currentSkillLevel + ", currentIssue=" + currentIssue + ", equipmentPoints=" + equipmentPoints + '}';
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
        final BandMember other = (BandMember) obj;
        if (Double.doubleToLongBits(this.currentSkillLevel) != Double.doubleToLongBits(other.currentSkillLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.equipmentPoints) != Double.doubleToLongBits(other.equipmentPoints)) {
            return false;
        }
        if (!Objects.equals(this.memberName, other.memberName)) {
            return false;
        }
        if (!Objects.equals(this.currentIssue, other.currentIssue)) {
            return false;
        }
        return true;
    }

}
