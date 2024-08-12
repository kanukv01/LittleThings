public class ThreadStart implements Runnable{
    public static void main(String[] args) {
        ThreadStart r=new ThreadStart();
        Thread t=new Thread(r);
        t.run();
    }

    @Override
    public void run() {
        System.out.println("thread is running...");  
    }
}
