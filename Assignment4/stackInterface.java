/*1.​ Stack Operations using Interface: Create an interface Stack with a variable size and
abstract methods push(), pop(), display(), overflow(), and underflow(). Implement a
subclass IntegerStack that implements the Stack interface. Create a test class to check the
working of all methods in the IntegerStack class.*/


import java.util.*;

interface operation{ 
 int size = 5;
 
 public void push();
 public void pop();
 public void display();
 public void overflow();
 public void underflow();
 
 }
 
 class stackInterface implements operation{
 Scanner scan = new Scanner(System.in);
 int[] stack = new int[size];
 int i, element, top = -1;
    
    
public void push(){
 if(top == size - 1){
     System.out.println("Stack is full");
     }
  else{
    System.out.println("Enter the element: ");
    element = scan.nextInt();
    top++;
    stack[top] = element;
  }
}

public void pop(){
 if(top == -1){
  System.out.println("The stack is empty");
  }
else{
 element = stack[top];
 top--;
 System.out.println("The popped element is: "+element);
 }
 }

public void display(){
if(top == -1){
 System.out.println("The stack is empty");
 }
else{
 System.out.println("The elements are: ");
 for(int i = top; i>=0; i--){
  System.out.println(stack[i]+ " ");
  }
}

}
public void overflow(){
 if(top == size - 1){
  System.out.println("stack is overflow");
  }
 else{
  System.out.println("false");
  }
  
 }
public void underflow(){
 if(top == -1){
  System.out.println("stack is underflow");
 }
 else{
  System.out.println("false");
  }
}
 
public static void main(String[] ar){

 Scanner sc = new Scanner(System.in);
 stackInterface obj = new stackInterface();   
    int choice;
     while(true){
     System.out.println("1.Push");
     System.out.println("2.pop");
     System.out.println("3.display");
     System.out.println("4.overflow");
     System.out.println("5.underflow");
     System.out.println("6.exit");
      
      
     
     System.out.println("Enter the option");
     choice = sc.nextInt();
     
     switch(choice){
     case 1:
      obj.push();
      break;
     case 2:
     obj.pop();
      break;
     case 3:
     obj.display();
     break;
    case 4:
     obj.overflow();
     break;
    case 5: 
     obj.underflow();
     break;
     case 6:
      System.exit(0);
    }
    }

 }
 }
 
 
