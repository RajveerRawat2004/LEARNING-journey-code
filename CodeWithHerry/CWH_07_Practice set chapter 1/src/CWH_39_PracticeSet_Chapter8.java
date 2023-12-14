import java.util.Scanner;
// Question 1
class Employee {
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        name = n;
        return name;
    }
}
class Cellphone {
    public void check_Speaker(){
            System.out.println("ringing");
    }
    public void check_Motor(){
            System.out.println("Vibrating");
    }
    public void check_Camera(){
            System.out.println("recording is on going");
    }
    public void call_friend(){
            System.out.println("Calling mukul");
    }
}
// Question 3
class Square {
    int side;
   public int calculating_Area(){
       return side*side;
   }
   public int perimeter (){
       return 4*side;
   }
}
// Question 4
class Rectangle {
    int length;
    int breadth;
   public int calculating_Area(){
       return length*breadth;
   }
   public int perimeter (){
       return 2*(length+breadth);
   }
}
//Question 5
class tommy{
    public void hitting(){
        System.out.println("hitting the enemy");
    }
    public void running(){
        System.out.println("running from enemy");
    }
    public void firing(){
        System.out.println("firing on enemy");
    }
}
//Question 6
class circle {
    int radius;
    public float calculating_Area(){
        return 3.14f*radius*radius;
    }
    public float perimeter_circumference (){
        return 2*3.14f*radius;
    }
}
public class CWH_39_PracticeSet_Chapter8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1
//        Employee harry = new Employee();
//        harry.salary = 45000;
//        harry.name = "codeWithHarry";
//        harry.setName("CWH");
//        System.out.println(harry.getName());
//        System.out.println(harry.getSalary());
//        System.out.println( harry.setName("CWH"));

        // Question 2
//        Cellphone asus = new Cellphone();
//        asus.check_Camera();
//        asus.call_friend();
//        asus.check_Motor();
//        asus.check_Speaker();

        // Question 3
//        Square floor_of_my_room = new Square();
//        floor_of_my_room.side=3;
//        System.out.println(floor_of_my_room.calculating_Area()+" m^2");
//        System.out.println(floor_of_my_room.perimeter()+" m");

        //Question 4
//        Rectangle My_Desk = new Rectangle();
//        My_Desk.length=3;
//        My_Desk.breadth=4;
//        System.out.println(My_Desk.calculating_Area()+" m^2");
//        System.out.println(My_Desk.perimeter()+" m");

        //Question 5
//        tommy player1 = new tommy();
//        player1.firing();
//        player1.hitting();
//        player1.running();

        //Question 6
        circle well = new circle();
        well.radius=3;
        System.out.println(well.calculating_Area()+" m^2");
        System.out.println(well.perimeter_circumference()+" m");
    }
}
