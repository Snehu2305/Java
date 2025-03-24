/*2.​ Shape Interface with Rectangle and Triangle: Implement the following:
a.​ Create an interface Shape with an abstract method area().
b.​ Create two classes, Rectangle and Triangle, that implement the Shape interface.
c.​ Calculate and display the area of both Rectangle and Triangle.*/

import java.util.*;

interface shape{
 public void area();
 
 }

class Rectangle implements shape{
 Scanner sc = new Scanner(System.in);
 
  public void area(){
 System.out.println("Enter the length and width of a rectangle: ");
 double len = sc.nextDouble();
 double wid = sc.nextDouble();
double a = len * wid;
 System.out.println("Area of rectangle is: " +a);
 }

}

class Triangle implements shape{
 Scanner sc = new Scanner(System.in);
 
  public void area(){
 System.out.println("Enter the length and height of a Triangle: ");
 double len = sc.nextDouble();
 double h = sc.nextDouble();
 double a = 0.5 * len * h;
 System.out.println("Area of Triangle is: " +a);
 }
 }
 
class shapeInterface{
 public static void main(String[] ar){
   Rectangle r = new Rectangle();
   Triangle t = new Triangle();
   
   r.area();
   t.area();
   
}
}
 
 
