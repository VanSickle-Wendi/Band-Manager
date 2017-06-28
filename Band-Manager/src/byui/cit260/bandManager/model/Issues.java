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
 * @author Wendi
 */
public class Issues implements Serializable {
    
    // class instance variables
    private String issueDescription;
    private Issues[] issueList; 
    
    public Issues() {
    }

    public Issues(String issueDescription) {
        setIssueDescription(issueDescription);
    }
    
    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public Issues[] getIssueList() {
        return issueList;
    }

    public void setIssueList(Issues[] issueList) {
        this.issueList = issueList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.issueDescription);
        return hash;
    }

    @Override
    public String toString() {
        return "Issues{" + "issueDescription=" + issueDescription + '}';
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
        final Issues other = (Issues) obj;
        if (!Objects.equals(this.issueDescription, other.issueDescription)) {
            return false;
        }
        return true;
    }
    
}
