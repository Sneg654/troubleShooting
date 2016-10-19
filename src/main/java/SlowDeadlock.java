/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class SlowDeadlock {

    public synchronized void get() {
        try {
            System.out.format("start slowDeadlock " + Thread.currentThread().getName());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
