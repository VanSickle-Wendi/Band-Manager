/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

/**
 *
 * @author Wendi
 */
public interface ViewInterface {
    
    public void display();
    public String getInput();
    public boolean doAction(String value);
    public String getInput(String prompt);
}
