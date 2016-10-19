/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class SharedResourceDeadlock {


    private final String name;

    public SharedResourceDeadlock(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void get(SharedResourceDeadlock thread) {
        System.out.format("%s: %s" + "  has got to me!%n", this.name, thread.getName());
        thread.call(this);
    }

    public synchronized void call(SharedResourceDeadlock thread) {
        System.out.format("%s: %s" + " has got back to me!%n", this.name, thread.getName());
    }
}
