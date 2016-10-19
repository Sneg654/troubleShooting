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

    public synchronized void bow(SimpleDeadlock bower) {
        System.out.format("has bowed to me!%n", this.name, bower.getName());
        bower.bowBack(this);
    }

    public synchronized void bowBack(SimpleDeadlock bower) {
        System.out.format("has bowed back to me!%n", this.name, bower.getName());
    }
}
