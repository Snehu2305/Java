import java.util.*;

class Employee{
 String name;
 String add;
 double salary;
 String jobTitle;
 
 Scanner scan = new Scanner(System.in);
 
 Employee(){
 System.out.println("Enter the name: ");
 name = scan.nextLine();
 System.out.println("Enter the add: ");
 add = scan.nextLine();
 System.out.println("Enter the salary: ");
 salary = scan.nextDouble();
 scan.nextLine();
 System.out.println("Enter the jobTitle: ");
 jobTitle = scan.nextLine();
 }
 
 }
 
class Manager extends Employee{
 void bonuses(){
  double b = (salary * 20) / 100;
  double total = salary + b;
  System.out.println("The total salary is: " +total);
  }
  
  void performance(){
   System.out.println("Display the report");
  }

 void Project(){
  System.out.println("Manages all projects");
  }
  
}

class Developer extends Employee{
 void bonuses(){
  double b = (salary * 10) / 100;
  double total = salary + b;
  System.out.println("The total salary is: " +total);
  }
  
  void performance(){
   System.out.println("Display the report");
  }

 void Project(){
  System.out.println("Develops the projects");
  }
  
}

class Programmer extends Employee{
 void bonuses(){
  double b = (salary * 15) / 100;
  double total = salary + b;
  System.out.println("The total salary is: " +total);
  }
  
  void performance(){
   System.out.println("Display the report");
  }

 void Project(){
  System.out.println("code the project");
  }
  
}

class Company{
 public static void main(String[] ar){
 
  Manager m = new Manager();
  m.bonuses();
  m.performance();
  m.Project();
  
  Developer d = new Developer();
  d.bonuses();
  d.performance();
  d.Project();
  
  Programmer p = new Programmer();
  p.bonuses();
  p.performance();
  p.Project();
  }
  }
