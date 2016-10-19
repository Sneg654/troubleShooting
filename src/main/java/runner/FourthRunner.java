package runner;

import deadlock.SlowDeadlock;

/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class FourthRunner {
    public static void main(String[] args) {
        SlowDeadlock slowThread = new SlowDeadlock();

        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
        new Thread(slowThread::get).start();
    }
}
