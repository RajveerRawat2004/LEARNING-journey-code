class MyRunnable1 implements Runnable{
    @Override
    public void run (){
        for (int i = 1; i<100;i++) {
            System.out.println(" I am a thread not a threat 1");
        }
    }
}class MyRunnable2 implements Runnable{
    @Override
    public void run(){
    for (int i = 1; i<100;i++) {
        System.out.println(" I am a thread not a threat 2");
        }
    }
}
public class CWH_71_thread_implements_runnableInterface {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread (bullet1);
        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread (bullet2);
        gun1.start();
        gun2.start();
    }
}
