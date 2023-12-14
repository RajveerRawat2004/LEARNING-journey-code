import java.util.*;
public class CWH_91_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(5);
        list2.add(45);
        list2.add(512);
        list2.add(56);
        list1.add(6);
        list1.add(7);
        list1.add(4);
        list1.add(6);
        list1.add(5);
        list1.add(0,5);
        list1.add(0,1);
        list1.addAll(0,list2);
//        list1.clear();
//        list1.ensureCapacity(446);
        list1.set(1,987965);
        System.out.println(list1.indexOf(56));
        System.out.println(list1.indexOf(45465));
        System.out.println(list1.indexOf(6));
        System.out.println(list1.lastIndexOf(6));
        System.out.println(list1.contains(455));
//        for(int i=0; i<list1.size(); i++){
//            System.out.println(i +" "+ list1.get(i));
//        }

    }
}