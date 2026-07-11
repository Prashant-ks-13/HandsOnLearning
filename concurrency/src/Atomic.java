import java.util.concurrent.atomic.AtomicInteger;

class SharedResource{
    public AtomicInteger val = new AtomicInteger(0);

    void increment(){
        val.incrementAndGet();
    }
    void getval(){
        System.out.println(val.get());
    }
//    void increment(){
//        val++;
//    }
//    void getval(){
//        System.out.println(val);
//    }


}
public class Atomic {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sh = new SharedResource();
        Runnable th1 =  () -> {
            for (int i = 0; i < 50000; i++) {
                sh.increment();
            }

        };
        Runnable th2 =  () -> {
            for (int i = 0; i < 50000; i++) {
                sh.increment();
            }

        };

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        sh.getval();


    }
}
