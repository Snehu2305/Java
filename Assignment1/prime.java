import java.util.*;

class prime{
 public static void main(String args[]){
    int num;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    num = scan.nextInt();
    
    boolean ans = isPrime(num);
    System.out.println(ans);
    
    }
    
static boolean isPrime(int n){
    
     if(n<=1){
   return false;
      }
     int c = 2;
     while(c * c <= n){
      if(n % c == 0){
       return false;
        }
      c++;
    }
  return true;
   
  }
  }
