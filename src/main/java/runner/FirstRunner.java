package runner;

/**
 * Created by Sergey_Stefoglo on 10/16/2016.
 */

import deadlock.SimpleDeadlock;

public class FirstRunner {
    public static void main(String[] args) {
        final SimpleDeadlock firstThread = new SimpleDeadlock("firstThread");
        final SimpleDeadlock secondThread = new SimpleDeadlock("secondThread");

        new Thread(() -> {
            firstThread.connect(secondThread);
        }).start();

        new Thread(() -> {
            secondThread.connect(firstThread);
        }).start();
    }

}
