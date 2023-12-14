import java.util.Scanner;
class MyEmployee {
    private int id ;
    private String name ;
    public void setName ( String n){
       this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
class Circle1{
    private float radius;
    public void setRadius(float n){
        radius = n;
        System.out.println(n);
    }
    public void setArea (float n){
        float area ;
        if (n==3.14f*radius*radius){
            area = n;
            System.out.println(n);
        }else {
            System.out.println("unValid area for radius");
        }
    }
    public void setPerimeter (float n){
        float perimeter;
        if (n==2.0f*3.14f*radius){
            perimeter = n;
            System.out.println(n);
        }else {
            System.out.print("unValid perimeter for radius \n");
        }
    }
}
public class CWH_40_PrivateAccessModifier_Getter_Setter {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        MyEmployee harry = new MyEmployee();
//        harry.id = 42;
//        harry.name = "code with harry"

        // using getter and setter
//        harry.setName("codeWithHerry");
//        System.out.println(harry.getName());
//        harry.setId(45);
//        System.out.println(harry.getId());

        Circle1 drum = new Circle1();
        drum.setRadius(2.0f);
        drum.setArea(12.56f);
        drum.setPerimeter(12.56f);
    }
}
