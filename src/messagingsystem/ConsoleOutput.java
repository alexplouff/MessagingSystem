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
public class ConsoleOutput implements MessageOutput{
 
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println( getMessage() );
    }
    
    
    
    
}
