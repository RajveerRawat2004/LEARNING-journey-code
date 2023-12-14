class MyThr1 extends Thread{
    MyThr1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 34;
        System.out.println("thank you");
    }
}
class MyThr2 extends Thread{
    MyThr2(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        System.out.println("I am thread 2");
    }
}
public class CWH_73_constructor_in_threading {
    public static void main(String[] args) {
        // --> thread (String name)
//        MyThr1 t1 = new MyThr1("harry");
//        MyThr2 t2 = new MyThr2("ram candr");
//        t1.start();
//        t2.start();
//        System.out.println("the  id of this thread is "+t1.getId());
//        System.out.println("the name of this thread "+t1.getName());
//        System.out.println("the name of this thread "+t2.getId());
//        System.out.println("the  id of this thread is "+t2.getName());

        // --> thread (runnable r, String name)
    }
}