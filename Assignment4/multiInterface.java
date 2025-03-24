/*3.​ Student Exam Results Using Inheritance and Interface in: Implement the following
hierarchy:
a.​ Create a class Student with a variable rollNo and methods getRollNo() and
setRollNo().
b.​ Create a class Test that inherits Student and has variables sub1 and sub2 with
methods getMarks() and setMarks().
c.​ Create an interface Sports with a variable sMarks and a method set().
d.​ Create a class Result that inherits Test and implements the Sports interface. It
should display the marks.
e.​ Demonstrate the functionality of these classes in a test application.*/
 import java.util.*;
class Student{
Scanner scan = new Scanner(System.in);
 int rollNo;
 
 void getRollNo(){
 System.out.println("Enter roll number: ");
 rollNo = scan.nextInt();
 }
 
 void setRollNo(){
 System.out.println("roll number is: " +rollNo);
 }
 }
 
 class Test extends Student{
Scanner scan = new Scanner(System.in);
int sub1, sub2;
 
 void getMarks(){
 System.out.println("Enter marks of subject 1(out of 100): ");
 sub1 = scan.nextInt();
 System.out.println("Enter marks of subject 2(out of 100): ");
 sub2 = scan.nextInt();
 }
 
 void setMarks(){
 System.out.println("marks of subject 1: "+sub1);
 System.out.println("marks of subject 2: "+sub2);
 }
 
 }

interface Sports{
  int sMarks = 10;
  }
  

class Result extends Test implements Sports{

 int Total;

void res(){
 Total = sub1 + sub2 + sMarks;
 System.out.println("Your total marks are: "+Total);
 }
 }
 
class multiInterface{
 public static void main(String[] ar){
  Result r = new  Result();
  Student s = new Student();
  //Test t = new Test();
  s.getRollNo();
  r.getMarks();
  s.setRollNo();
  r.setMarks();
  r.res();
  
  }
}
