package runnable;

public class MTService {

    public  void  doFirstThing() {
        synchronized (Runner.class) {
            System.out.println(Thread.currentThread().getName() + " in doFirstThing");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doSecondThing() {
        synchronized (Runner.class) {
            System.out.println(Thread.currentThread().getName() + " in doSecondThing");
        }

    }




}
