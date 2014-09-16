/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingsystem;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class KeyboardInput implements MessageInput {

    private Scanner keyboardInput = 
                    new Scanner(System.in);
    

    @Override
    public void setMessageInput( String input ) {
        System.out.println("Enter text: ");
        input = keyboardInput.nextLine();
    }

}
