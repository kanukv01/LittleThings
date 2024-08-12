public class ThreadSleepTest extends Thread {
    public void run(){
        System.out.println("Thread is running");
        for(int i=0;i<10;i++){
            try{
              Thread.sleep(500);;
              System.out.println(i);
            }catch(Exception e){
                System.out.println("Error Found");
            }
        }
    }
    public static void main(String[] args) {
        ThreadSleepTest t1=new ThreadSleepTest();
        ThreadSleepTest t2=new ThreadSleepTest();
        t1.start();
        t2.start();
    }
}
