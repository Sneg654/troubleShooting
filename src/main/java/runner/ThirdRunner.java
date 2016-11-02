package runner;

import deadlock.SharedResourceDeadlock;

/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class ThirdRunner {
    public static void main(String[] args) {
        final SharedResourceDeadlock firstTread = new SharedResourceDeadlock("1");
        final SharedResourceDeadlock secondTread = new SharedResourceDeadlock("2");
        final SharedResourceDeadlock thirdTread = new SharedResourceDeadlock("3");
        final SharedResourceDeadlock fourthThread = new SharedResourceDeadlock("4");

     new Thread(() -> {
         firstTread.get(secondTread);
     }).start();

     new Thread(() -> {
         secondTread.get(thirdTread);
     }).start();

     new Thread(() -> {
         thirdTread.get(fourthThread);
     }).start();

     new Thread(() -> {
         fourthThread.get(firstTread);
     }).start();
    }
}
