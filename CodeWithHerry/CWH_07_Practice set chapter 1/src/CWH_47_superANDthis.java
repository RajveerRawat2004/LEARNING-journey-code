class EkClass {
    int a;
    EkClass (int a){
        this.a=a;
    }
    public int getA() {
        return a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    public DoClass(int c) {
        super(c);
        System.out.println("I am a constructor");
    }
}
public class CWH_47_superANDthis {
    public static void main(String[] args) {
        EkClass e = new EkClass(64);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());

    }
}
