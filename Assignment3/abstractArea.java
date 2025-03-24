import java.util.*;

class shapes{
  double dim1;
  double dim2;
  
 shapes(double d1, double d2){
  dim1 = d1;
  dim2 = d2;
  abstract double area();
  }
}
  
  class rectangle extends shapes{
   rectangle(double l, double d){
    super (a, b);
  double area(){
   return dim1 * dim2;
   }
   }
  }
 class triangle extends shapes{
  triangle (double h, double w){
   super(h, w);
   double area(){
    return 0.5 * h * w;
  }
}
}
class abstractArea{
 public static void main(String[] ar){
  shapes s = new Shapes(4, 5);
  rectangle r = new rectangle(10, 2);
  triangle t = new triangle(4, 6);
  
  shape s1;
  s1 = r;
  System.out.println("Rectangle area: "+s1.area);
  
  s1 = t;
  System.out.println("triangle area: "+s1.area);
  }
}
  
