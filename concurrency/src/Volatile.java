class SharedResource1{
    boolean  flag;

    void maketrue(){
        flag = true;
    }
    boolean getflag(){
        return flag;
    }
}
public class Volatile {

    public static void main(String[] args) {
        SharedResource1 sh = new SharedResource1();
        Runnable r1 = () -> {

            System.out.println("Thread1 started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sh.maketrue();
            System.out.println("Thread1 ended");

        };
        Runnable r2 = () -> {

            System.out.println("Thread2 started");
            while(!sh.getflag()){

            }
            System.out.println("Thread2 ended");
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}

