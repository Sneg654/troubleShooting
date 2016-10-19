/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class SecondRunner {


    public static void main(String[] args) {
        final RealisticDeadlock firstThread = new RealisticDeadlock("FirstThread");
        final RealisticDeadlock secondThread = new RealisticDeadlock("SecondThread");

        // Lock
        new Thread(() -> {
            firstThread.bow(secondThread);
        }).start();

        // Lock
        new Thread(() -> {
            secondThread.bow(firstThread);
        }).start();

        // Additional first object lock
        new Thread(firstThread::tryGetResource).start();
        new Thread(firstThread::tryGetResource).start();
        new Thread(firstThread::tryGetResource).start();

        //Additional second object lock
        new Thread(secondThread::tryGetResource).start();
        new Thread(secondThread::tryGetResource).start();
        new Thread(secondThread::tryGetResource).start();
    }

}
