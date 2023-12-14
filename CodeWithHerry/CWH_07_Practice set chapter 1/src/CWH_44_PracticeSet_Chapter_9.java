class cylinder {
    private int radius;
    private int height;
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea (){
        double sArea = 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
        return sArea;
    }
    public double volume (){
        double volume = Math.PI*radius*radius*height;
        return volume;
    }
}
class Rectangle1 {
    private int length;
    private int breadth;
    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
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
}
class Sphere {
    private int radius;
    public Sphere() {
        this.radius = 5;
    }
    public Sphere(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea (){
        double area1 = 4*Math.PI*radius*radius;
        return area1;
    }
    public double volume (){
        double volume1 = 4*Math.PI*radius*radius*radius/3;
        return volume1;
    }
}
public class CWH_44_PracticeSet_Chapter_9   {
    public static void main(String[] args) {
        cylinder c = new cylinder(9,12);
//        c.setHeight(12);
//        System.out.println(c.getHeight());
//        c.setRadius(9);
//        System.out.println(c.getRadius());
//        System.out.println(c.surfaceArea());
//        System.out.println(c.volume());
//        Rectangle1 rect = new Rectangle1(12,56);
////        rec.setLength(12);
//        System.out.println(rect.getLength());
////        rec.setBreadth(9);
//        System.out.println(rect.getBreadth());
        Sphere sphere = new Sphere(9);
//        sphere.setRadius(6);
        System.out.println(sphere.getRadius());
        System.out.println(sphere.surfaceArea());
        System.out.println(sphere.volume());
    }
}
