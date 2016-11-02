package runner;

import deadlock.RealisticDeadlock;

/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class SecondRunner {


    public static void main(String[] args) {
        final RealisticDeadlock firstThread = new RealisticDeadlock("FirstThread");
        final RealisticDeadlock secondThread = new RealisticDeadlock("SecondThread");


        new Thread(() -> {
            firstThread.connect(secondThread);
        }).start();


        new Thread(() -> {
            secondThread.connect(firstThread);
        }).start();


        new Thread(firstThread::tryGetResource).start();
        new Thread(firstThread::tryGetResource).start();
        new Thread(firstThread::tryGetResource).start();


        new Thread(secondThread::tryGetResource).start();
        new Thread(secondThread::tryGetResource).start();
        new Thread(secondThread::tryGetResource).start();

    }

}
