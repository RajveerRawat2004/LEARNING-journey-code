class myThread1 extends Thread {
    @Override
    public void run (){
        int i = 0;
       while (i<40000){
           System.out.println("My cocking thread1 is running");
           System.out.println("I am happy");
           i++;
       }
    }
}class myThread2 extends Thread {
    @Override
    public void run (){
        int i = 0;
        while (i<40000){
           System.out.println("thread2 for chatting with her");
           System.out.println("I am sad!");
           i++;
       }
    }
}
public class CWH_70_Thread_Extends_threadClass {
    public static void main(String[] args) {
        myThread1 m1 = new myThread1();
        myThread2 m2 = new myThread2();
        m1.start();
        m2.start();
    }
}
