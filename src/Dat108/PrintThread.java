package Dat108;

public class PrintThread extends Thread{
    public void run () {

        try {
            while (DialogBox.flag) {
                System.out.println(DialogBox.input);
                Thread.sleep(3000);
            }
        } catch (InterruptedException ex) {
            //SomeFishCatching
        }
    }

}
