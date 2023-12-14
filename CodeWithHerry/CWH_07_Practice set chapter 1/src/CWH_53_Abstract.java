abstract class parent {
    public parent() {
        System.out.println("I am constructor of parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent{
    @Override
    public void greet() {
        System.out.println("good morning");
    }
    @Override
    public void greet2() {
        System.out.println("good afternoon");
    }
}
abstract class child1 extends parent{
    public void th (){
        System.out.println("I am good");
    }
}
public class CWH_53_Abstract {
    public static void main(String[] args) {
//        parent p = new parent();  // can't make object of abstract class
        child c = new child();
//        child1 c1 = new child1();    // can't make object of abstract class
    }
}
