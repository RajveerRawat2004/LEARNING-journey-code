class MyThr0 extends Thread{
    @Override
    public void run(){
        int i = 34;
        while (i<478){
            System.out.println("thank you");
            try {
                Thread.sleep(565);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
}
class MyThr3 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<959){
            System.out.println("I am thread 2");
            i++;
        }
    }
}
public class CWH_75_thread_methods {
    public static void main(String[]args) {
        MyThr0 m0 = new MyThr0();
        MyThr3 m3 = new MyThr3();
        m0.start();
//        try {
//            m0.join();
//        } catch (Exception e){
//            System.out.println(e);
//        }
        m3.start();
    }
}
