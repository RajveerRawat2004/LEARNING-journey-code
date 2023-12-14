interface camera {
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
interface Wifi{
    String [] getNetworks();
    void connectToNetworks(String network);

}
class myCellphone {
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}
class MySmartPhone extends myCellphone implements camera,Wifi{
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
}
public class CWH_57_defaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        String [] arr = ms.getNetworks();
        for (String item : arr){
            System.out.println(item);
        }
    }
}
