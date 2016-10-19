/**
 * Created by Sergey_Stefoglo on 10/16/2016.
 */
public class FirstRunner {
    public static void main(String[] args) {
        final SimpleDeadlock firstThread = new SimpleDeadlock("firstThread");
        final SimpleDeadlock secondThread = new SimpleDeadlock("secondThread");

        new Thread(() -> {
            firstThread.bow(secondThread);
        }).start();

        new Thread(() -> {
            secondThread.bow(firstThread);
        }).start();
    }

}
