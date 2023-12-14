class Phone {
    public void showtime(){
        System.out.println("it is 8AM");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class Smartphone extends Phone {
    public void music() {
        System.out.println("playing music");
    }
    @Override
    public void on() {
        System.out.println("Turning on Smartphone...");
    }
}
public class CWH_49_DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();// Allowed
//        Smartphone SmObj = new Smartphone();// Allowed
//        obj.name();

        Phone obj = new Smartphone();
//        Smartphone obj2 = new Phone(); // NOT allowed
        obj.showtime();
        obj.on();
//        obj.music();// NOT allowed
    }
}
