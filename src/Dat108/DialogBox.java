package Dat108;

import javax.swing.*;
import java.util.Objects;

public class DialogBox extends Thread{

    public static String input = "Hello World";
    public static boolean flag = true;
    public static String stop = "quit";

    public void run(){

        while (!this.input.equals(stop)){
            this.input = JOptionPane.showInputDialog(null, "Please enter a new word");
            if (input.equals(stop)){
                flag = false;
            }
        }
    }
    
}
