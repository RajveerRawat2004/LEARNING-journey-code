class Base{
    public int x ;

    public void printMe() {
        System.out.println("I am a Constructor");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in BASE class and setting X now");
        this.x = x;
    }
}
class Derived extends Base {
    int y;
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
}
// Quick Quiz
class Animals{
    String voice ;
    int legs;
    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
}
class Dogs extends Animals{
   String dogsVoice ;
    public String getDogsVoice() {
        return dogsVoice;
    }
    public void setDogsVoice(String dogsVoice) {
        this.dogsVoice = dogsVoice;
    }
}
public class CWH_45_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();        // creating an object of Base class
        Derived d = new Derived();  // creating an object of Derived class
//        b.setX(5);
//        System.out.println(b.getX());
//        d.setX(5);
//        System.out.println(d.getX());
//        d.setY(9);
//        System.out.println(d.getY());

        // Quick Quiz
        Animals a = new Animals();
        Dogs dO = new Dogs();
        a.setLegs(4);
        a.setVoice("meow,roar");
        System.out.println(a.getLegs());
        System.out.println(a.getVoice());
        dO.setLegs(6);
        dO.setVoice("meow,roar,bark");
        System.out.println(dO.getLegs());
        System.out.println(dO.getVoice());
        dO.setDogsVoice("bark");
        System.out.println(dO.getDogsVoice());
    }
}