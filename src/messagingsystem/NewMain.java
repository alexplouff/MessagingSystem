/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingsystem;

/**
 *
 * @author Alex
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       MessagingSystem ms = new MessagingSystem(
                new GUIInput() , new ConsoleOutput() );
       
       ms.startMessagingService();
        
    }
    
}
