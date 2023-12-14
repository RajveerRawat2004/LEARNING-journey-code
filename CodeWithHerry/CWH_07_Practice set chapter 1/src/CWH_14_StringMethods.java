import java.util.Scanner;
public class CWH_14_StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1.Method ---> .length
        String name = "Raerjverer";
//        int value = name.length();
//        System.out.println(value);  //System.out.println(name.length); // direct method
//        2.Method ---> .toLowerCase
//        System.out.println(name.toLowerCase());
//        3.method ---> .toUpperCase
//        System.out.println(name.toUpperCase());
//        4.Method ---> .trim
        String modifiedName = "    rajveer    ";
//        System.out.println(modifiedName.trim());
//        5.Method ---> .subString(start index)
//        System.out.println(name.substring(3));
//        6.Method .subString(start index, end index)
//        System.out.println(name.substring(3,7));
//        7.Method ---> .replace(old,new)
//        System.out.println(name.replace('e','r'));
//        System.out.println(name.replace("eer","or"));
//        8.Method ---> .startsWith()
//        System.out.println(name.startsWith("Raj"));
//        System.out.println(name.startsWith("har"));
//        System.out.println(name.endsWith("er"));
//        9.Method ---> .charAt()
//        System.out.println(name.charAt(3));
//        10.Method ---> .indexOf()
//        System.out.println(name.indexOf("er"));
//        11.Method ---> .indexOf(startindex)
//        System.out.println(name.indexOf("er",3));
//        System.out.println(name.lastIndexOf("er",3));
        //if wrong input then return -1
//        12.Method ---> .equals()
//        System.out.println(name.equals("rajveer"));
//        13.Method ---> .equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("RaeRjveReR"));
//        ****Escape Sequence characters***
//        System.out.println("rajveer is learning \b string method");// backSpace
//        System.out.println("rajveer is learning \n string method");// nextLine
//        System.out.println("rajveer is learning \t string method");// tab
//        System.out.println("rajveer is learning \\ string method");// backSlash
//        System.out.println("rajveer is learning \" string method");// doubleQuote
//        System.out.println("rajveer is learning \' string method");// singleQuote
    }
}
