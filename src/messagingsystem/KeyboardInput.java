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

    private Scanner keyboardInput = new Scanner(System.in);
    private String input;

    @Override
    public void setMessageInput(String input) {
        this.input = keyboardInput.nextLine();
    }

    @Override
    public String getMessage() {
        return input;
    }

}
