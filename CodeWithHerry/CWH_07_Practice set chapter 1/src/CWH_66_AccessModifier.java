class C1 {
    public int a = 54;
    protected int b = 74;
    int c= 6;
    private int d = 65;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class CWH_66_AccessModifier {
    public static void main(String[] args) {
        C1 c = new C1();
//        c.meth1();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
//        System.out.println(c.d);
    }
}
