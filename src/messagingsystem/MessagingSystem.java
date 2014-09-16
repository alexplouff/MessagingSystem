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
public class MessagingSystem {

    public MessageInput input;
    public MessageOutput output;
    
    public MessagingSystem( MessageInput input , MessageOutput output){
        this.input = input;
        this.output = output;
    }
    
    
    public void processMessage(  ){
      
      input.setMessageInput(output.toString());
        System.out.println(output.getMessage());
    }
    
 
}
