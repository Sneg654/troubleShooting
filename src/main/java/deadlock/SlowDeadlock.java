package deadlock;

import java.util.Date;

/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class SlowDeadlock {

    public synchronized void get() {

        try {
            System.out.format(new Date(System.currentTimeMillis()) + "  started slowDeadlock " + Thread.currentThread().getName() + "\n");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
