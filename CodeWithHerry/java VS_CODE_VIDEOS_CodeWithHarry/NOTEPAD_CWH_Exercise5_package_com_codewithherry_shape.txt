package com.codewithherry.shape;

class Square3{
    public int side;
    public void setSide (int b){
        side = b;
    }
    public int getSide (){
        return side;
    }
    public int squareArea (){
        return side*side;
    }
    public int perimeter (){
        return 4*side;
    }
}

class Rectangle3{
    public int length;
    public int breadth;
    public void setLength (int l){
        length = l;
    }
    public int getLength (){
        return length;
    }
    public void setBreadth (int b){
        breadth= b;
    }
    public int getBreadth (){
        return breadth;
    }
    public int rectangleArea (){
        return length*breadth;
    }
    public int perimeter (){
        return 2*(length+breadth);
    }
}
class Circle3{
    public double radius;
    public void setRadius (double r){
        radius= r;
    }
    public double getRadius (){
        return radius;
    }
    public double area (){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
}
class Cylinder3 extends Circle3{
    public double height;
    public void setHeight(double h){
        height = h;
    }
    public double getHeight (){
        return height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Sphere3 extends Circle3 {
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return 4*Math.PI*radius*radius*radius/3;
    }
}
public class CWH_68_Exercise5{
    public static void main (String [] args){
        Rectangle3 object = new Rectangle3();
        object.setLength(4);
        object.setBreadth(5);
        System.out.println(object.rectangleArea());
    }
}