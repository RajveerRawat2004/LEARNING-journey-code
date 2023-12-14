class Welcome extends Thread{
    public void run (){
        int i = 9 ;
        while (i<484){
            System.out.println("welcome");
//            try {
//                Thread.sleep(200);
//            }catch (InterruptedException e){
//                System.out.println(e);
//            }
            i++;
        }
    }
}
class Thank extends Thread{
    public void run (){
        int i = 0;
        while (i<342){
            System.out.println("thank you");
            i++;
        }
    }
}
public class CWH_76_practiceSet_Chapter13 {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        Thank t = new Thank();
        w.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());
        System.out.println(w.getPriority());
        System.out.println(w.getClass());
        w.start();
        t.start();
//        System.out.println(w.getState());
    }
}