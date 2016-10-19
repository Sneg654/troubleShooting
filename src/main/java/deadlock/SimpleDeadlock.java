package deadlock;

/**
 * Created by Sergey_Stefoglo on 10/16/2016.
 */
public class SimpleDeadlock {
    private final String name;

    public SimpleDeadlock(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void connect(SimpleDeadlock bower) {
        System.out.format("%s: %s" + "  has connect to me!%n", this.name, bower.getName());
        bower.reConnect(this);
    }

    public synchronized void reConnect(SimpleDeadlock bower) {
        System.out.format("%s: %s" + " has reconnect to me!%n", this.name, bower.getName());
    }
}