interface camera1 {
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println(" recording in 4k...");
    }
}
interface Wifi1{
    String [] getNetworks();
    void connectToNetworks(String network);

}
class myCellphone1 {
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}
class MySmartPhone1 extends myCellphone1 implements camera1,Wifi1{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    //    public void record4kVideo(){
//        System.out.println("taking snap and recording in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Harry", "prashant", "Anjali5G"};
        return networkList;
    }
    public void connectToNetworks (String network){
        System.out.println("connecting to "+ network);
    }
    public void sampleMethod (){
        System.out.println("sample meth");
    }
}
public class CWH_59_polymorphism_In_interfaces {
    public static void main(String[] args) {
        MySmartPhone1 ms1 = new MySmartPhone1();
        ms1.sampleMethod();
        ms1.recordVideo();
        ms1.getNetworks();
        ms1.callNumber(1416546540);
        camera1 cam1 = new MySmartPhone1();     // this is a smartphone but, use it as a camera
//        cam1.getNetworks();       --> not Allowed
//        cam1.sampleMath();        --> not Allowed

        cam1.record4kVideo();
    }
}
