package MultiThreading;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        // Multithreading =   Process of exicuting multiple threads simultaneously
        //                    Helps Maximum utilization of CPU
        //                    Threads are indimendent, they don't affect the execution of other threads.
        //                    An ecxeption in one thread will not interrupt other threads
        //                    usefull for serving multiple clients, multiplayer games, or other mutually indipendent tasks

        // Create a subclass of thread
        MyThread thread1 = new MyThread();

        // or

        // impliment Runnable interface and pass instance as an argument to Thread()
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        // thread1.setDaemon(true);
        // thread2.setDaemon(true);

        thread1.start();
        // thread1.join(3000); // calling thread (ex.main) wait untill the specified thread dies or x milliseconds
        thread2.start();

        System.out.println(1/0);


    }
}
