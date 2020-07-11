package runnable;

class ThreadRunner implements   Runnable{

    MTService service;

    ThreadRunner() {
        service = new MTService();
    }

    @Override
    public void run() {

        service.doFirstThing();
        service.doSecondThing();

    }



}

public class Runner {

    public static void main(String[] args) {

        ThreadRunner runner = new ThreadRunner();

        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);

        t1.start();
        t2.start();


    }


}
