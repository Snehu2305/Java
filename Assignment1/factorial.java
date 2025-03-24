import java.util.*;

class factorial{
  public static void main(String arg[]){
   int num;
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter a number: ");
    num = scan.nextInt();
    int fact = 1;
    for(int i = 1; i<=num; i++){
      fact *= i;
      }
      System.out.println("The factorial is: " + fact);
  }
}
