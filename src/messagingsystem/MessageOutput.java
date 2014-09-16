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
public interface MessageOutput {

    public abstract String getMessage(  );
    
    public abstract String sendMessage( String getMessage );
    
}
