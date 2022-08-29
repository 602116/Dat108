package Dat108;

import javax.swing.*;

public class Main extends Thread{

    public static void main(String[] args) {

        PrintThread thread = new PrintThread();
        DialogBox threadTwo = new DialogBox();

        thread.start();
        threadTwo.start();





    }
}
