public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<Integer> th = new ThreadLocal();
        int id = 865;
        int id2 = 9564;
        Thread th1 = new Thread(()->{
            System.out.println("Thread 1 is running");
            th.set(id);
            //Logic
            //Database connections
            System.out.println("Thread 1 is completeed for : "+th.get());
            th.remove();
        });
        Thread th2 = new Thread(()->{
            System.out.println("Thread 2 is running");
            th.set(id2);
            //Logic
            //Database connections
            System.out.println("Thread 2 is completeed for : "+th.get());
            th.remove();
        });
        th1.start();
        th2.start();
        InheritableThreadLocal<String> ith = new InheritableThreadLocal<>();
        Thread th3 = new Thread(()->{
            System.out.println("Thread 3 is running");
            ith.set("abcd");
            th.set(866);
            Thread th4 = new Thread(()->{
                System.out.println("Thread 4 is running");

                //Logic
                //Database connections
                System.out.println("Thread 3 ThreadLocal value : "+th.get());
                System.out.println("Thread 3 InheritableThreadLocal value : "+ith.get());
                System.out.println("Thread 4 is completed");
            });
            th4.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //Logic
            //Database connections
            System.out.println("Thread 3 is completeed for : "+ith.get());
            ith.remove();
        });

        th3.start();
    }
}
