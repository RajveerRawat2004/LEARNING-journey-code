interface bicycle {
    int speed = 45;
    public void applyBreak (int decrement);
    public void speedup (int increment);
}
interface hornBicycle {
    public void blowHornk3g();
    public void blowHornMhn();
}
class avonCycle implements bicycle,hornBicycle{
    public void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void blowHornk3g(){
        System.out.println("kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornMhn(){
        System.out.println("Main hoon naa po po po po");
    }
    public void applyBreak (int decrement){
        System.out.println("applying Break");
    }
    public void speedup (int increment){
        System.out.println("applying speedUp");
    }
    public void playMusic(){
        System.out.println("playing Music");
    }
}
public class CWH_55_interfaces_VS_abstract {
    public static void main(String[] args) {
        avonCycle harryCycle = new avonCycle();
        harryCycle.applyBreak(1);
        harryCycle.speedup(12);
        System.out.println(harryCycle.speed);
        //you can create properties in interfaces
//        harryCycle.speed = 452;
//        System.out.println(harryCycle.speed);
        // you cannot modify the properties in Interfaces as they are final
        harryCycle.blowHorn();
        harryCycle.blowHornMhn();
        harryCycle.blowHornk3g();
    }
}
