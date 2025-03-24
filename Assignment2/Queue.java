import java.util.*;

class Solution{
Scanner scan = new Scanner(System.in);
int element, front = 0, rear = -1, size;
int[] arr;
void solution(){ 
  System.out.println("Enter the size of an queue: ");
  size = scan.nextInt();
  arr = new int[size];
  }
    
  void push(){
  if(rear == size  -1){
   System.out.println("queue is full");
   }
  else{
   System.out.println("Enter element to push: ");
   element = scan.nextInt();
   rear ++;
   arr[rear] = element;
   }
  }

  void pop(){
  if(front > rear){
  System.out.println("queue is empty");
  }
  else{
  System.out.println("popped element is: " +arr[front]);
  rear--;
  }
   }
   
  void display(){
    if(front > rear){
  System.out.println("queue is empty");
  }
  else{
  System.out.println("The elements are: ");
  for(int i = front; i<=rear; i++){
   System.out.println(arr[i]);
   }
  }
}
}
  
class Queue{
 public static void main(String[] ar){
  Scanner sc = new Scanner(System.in);
  int choice;
  Solution solve = new Solution();
  solve.solution();
  
  while(true){
  System.out.println("\n1.Push\n2.Pop\n3.Display");
  
  System.out.println("Enter a option: ");
  choice = sc.nextInt();
  
  switch(choice){
  case 1:
  solve.push();
  break;
  case 2:
  solve.pop();
  break;
  case 3:
  solve.display();
  break;
  case 0:
  System.exit(0);
   }
  }
 }
}
    
  

