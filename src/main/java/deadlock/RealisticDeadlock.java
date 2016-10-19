package deadlock;

/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class RealisticDeadlock extends SimpleDeadlock {

    public RealisticDeadlock(String name) {
        super(name);
    }

    public synchronized void tryGetResource() {
        System.out.format("try to get resource", Thread.currentThread().getName());
    }

}
