import java.util.*;
class Student{
 String name;
 int roll;
 String department;
Scanner scan = new Scanner(System.in);
Student(){
 System.out.println("Enter the name: ");
 name = scan.nextLine();
 System.out.println("Enter the roll: ");
 roll = scan.nextInt();
 System.out.println("Enter the department: ");
 department = scan.nextLine();
 scan.nextLine();

}
}

class Test extends Student{
Scanner scan = new Scanner(System.in);
 int sub1, sub2;
 void test(){
 System.out.println("Enter the marks of sub 1(out of 100): ");
 sub1 = scan.nextInt();
 System.out.println("Enter the marks of sub 2(out of 100): ");
 sub2 = scan.nextInt();
 }
 }
 
class Result extends Test{
 float marks;
 void result(){
 int total = sub1 + sub2;
 marks = (float)(total/2);
 System.out.println("Percentage is: " +marks);
 }
 }
 
 class Multilevel{
  public static void main(String[] ar){
   result r = new result();
   r.test();
   r.res();
   }
   }
