class MyThr extends Thread{
     MyThr(String name){
          super(name);
     }
     @Override
     public void run(){
          int i = 34;
          while (true){
             System.out.println("thank you"+this.getName());
          }
     }
}
public class CWH_74_priorities {
     public static void main(String[] args) {
         MyThr t1 = new MyThr("harry1");
         MyThr t2 = new MyThr("harry2");
         MyThr t3 = new MyThr("harry3");
         MyThr t4 = new MyThr("harry4");
         MyThr t5 = new MyThr("harry5( most important )");
         t5.setPriority(Thread.MAX_PRIORITY);
         t1.setPriority(Thread.MIN_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);
         t3.setPriority(Thread.MIN_PRIORITY);
         t4.setPriority(Thread.MIN_PRIORITY);
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
     }
}