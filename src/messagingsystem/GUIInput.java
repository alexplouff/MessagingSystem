/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class GUIInput implements MessageInput{

    private String message;
    
    @Override
    public void setMessageInput(  ) {
        
        message = JOptionPane.showInputDialog( "Enter Text: " );
        
    }

    @Override
    public String getMessage() {
        return message;
    }
    
    
    
    
}
