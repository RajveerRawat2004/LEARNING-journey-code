class Circle2{
    int radius;

    Circle2() {
        System.out.println("i am non Circle parameterized constructor");
    }
    Circle2(int r) {
        this.radius = r;
        System.out.println("i am Circle parameterized constructor");
    }
    public double area( ){
       return Math.PI*this.radius*this.radius;
    }
}
class Cylinder2 extends Circle2{
    int height;
    public Cylinder2(int radius, int height) {
        super(radius);
        this.height = height;
        System.out.println("i am cylinder parameterized constructor");
    }
    public double volume (){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
// Question 2
class Rectangle2 {
    public int length;
    public int breadth;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public Rectangle2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return this.length * this.breadth;
    }
    public double parameter() {
        return 2 * (this.length + this.breadth);
    }
}
class Cuboid1 extends Rectangle2{
    public int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public Cuboid1(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    public double areaOfCuboid2 (){
        return  this.length*this.breadth*this.height;
    }
    public double volumeOfCuboid2 (){
        return 4 ;
    }
}
public class CWH_52_PracticeSet_Chapter10 {
    public static void main(String[] args) {
//      Circle2 c = new Circle2(4);
//      Cylinder2 c = new Cylinder2(4,5);
//      Rectangle2 r2 = new Rectangle2(4,5);
//      Cuboid1 c2 = new Cuboid1(8,7,6);
    }
}
