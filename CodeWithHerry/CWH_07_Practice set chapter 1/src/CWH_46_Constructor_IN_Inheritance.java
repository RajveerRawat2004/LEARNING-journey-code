class Base1{
    int x;

    public Base1() {
        System.out.println("i am Base1 constructor");
        this.x = x;
    } public Base1(int x) {
        System.out.println("i am overloaded Base1 constructor with the value of x as: "+x);
        this.x = x;
    }
}
class Derived1 extends Base1 {
    int y;
    public Derived1() {
        System.out.println("i am Derived1 constructor");
        this.y = y;
    }public Derived1(int x,int y) {
        super(y);
        System.out.println("i am overloaded Derived1 constructor with the value of y as: "+y);
        this.y = y;
    }
}
class childOFDerived extends Derived1 {
    int z;
    public childOFDerived() {
        System.out.println("i am child of Derived1 constructor");
        this.z = z;
    }
    public childOFDerived(int x,int y,int z) {
        super(x,y);
        System.out.println("i am overloaded child of Derived1 constructor with the value of z as: "+z);
        this.z = z;
    }
}
public class CWH_46_Constructor_IN_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Base1 b = new Base1(5);
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(5,6);
//        childOFDerived cd = new childOFDerived();
        childOFDerived cd = new childOFDerived(12,13,15);
    }
}