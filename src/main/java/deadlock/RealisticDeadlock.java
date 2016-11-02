package deadlock;

/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class RealisticDeadlock extends SimpleDeadlock {

    public RealisticDeadlock(String name) {
        super(name);
    }

    public synchronized void tryGetResource()   {
     try{
        Thread.currentThread().sleep(3000);
        System.out.format("%s try to get resource %n", Thread.currentThread().getName());
     }catch (Exception e){
         e.printStackTrace();
     }
    }

}
