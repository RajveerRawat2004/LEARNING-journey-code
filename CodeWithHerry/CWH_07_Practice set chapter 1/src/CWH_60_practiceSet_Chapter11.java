abstract class pen {
    abstract void write ();
    abstract void refill ();
}
class FountainPen extends pen{
    @Override
    void write (){
        System.out.println("write");
    }
    @Override
    void refill (){
        System.out.println("refill");
    }
    void changeNib (){
        System.out.println("change the Nib");
    }
}
class Monkey {
    void jump (){
        System.out.println("jumping...");
    }
    void bite (){
        System.out.println("biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir !");
    }
    @Override
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping");
    }
}
abstract class Telephone {
    void changeTune (){
        System.out.println( "Enter your favourite tune that i can play");
    }
    abstract void ring ();
    abstract void lift ();
    abstract void disconnect ();
}
class SmartTelephone extends Telephone{
    @Override
    void ring (){
        System.out.println("ringing");
    }
    @Override
    void lift (){
        System.out.println("lifting call");
    }
    @Override
    void disconnect (){
        System.out.println("disconnect call");
    }
    void autoPick (){
        System.out.println("speak : please! pick the call auto pick in 10 sec ...");
    }
}
interface TvRemote{
    void channelButton();
    void onTheTv();
    void volumeButton();
}
interface SmartTvRemote extends TvRemote{
    void voiceCommandOn();
    void flashWhileONTv();
}
class Tv implements TvRemote{
    @Override
    public void channelButton(){
        System.out.println("change the channel forward OR backward");
    }
    @Override
    public void onTheTv(){
        System.out.println("Television is on");
    }
    @Override
    public void volumeButton(){
        System.out.println("change the volume forward + OR backward -");
    }
    void playingNews (){
        System.out.println("playing news |");
    }
}
public class CWH_60_practiceSet_Chapter11 {
    public static void main(String[] args) {
        // Question 1 and 2
//        FountainPen pen = new FountainPen();
//        pen.changeNib();

        // Question 3
//        Human harry = new Human();
//        harry.speak();
//        harry.eat();

        // Question 4
        Telephone obj2 = new SmartTelephone();
        obj2.lift();
        obj2.disconnect();
        obj2.ring();
        obj2.changeTune();
//        obj2.autoPick();      // cannot work because polymorphism property only reference related object can only run

        // Question 5
        Monkey obj = new Human();
//        obj.speak();  // cannot ues speak method because th reference is monkey which does not have speak method
        obj.bite();
        obj.jump();
        BasicAnimal obj1 = new Human();
//        obj1.speak(); // Error
        obj1.eat();
        obj1.sleep();

        // Question 6

        // Question 7
    }
}
