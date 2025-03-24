//int out = s1.compareTo(s2);
// If out < 0: s1 comes before s2
// If out = 0: s1 and s2 are equal
// If out > 0: s1 comes after s2

import java.util.*;
class alphabetOrder{
public static void main(String[] arg){
   Scanner scan = new Scanner(System.in);
   String[] arr = new String[10];
  
   
  
 System.out.println("Enter 10 names: ");
 for(int i = 0; i < 10; i++){
 arr[i]  = scan.nextLine().toLowerCase();

 }
   
   for(int i = 0; i < 9; i++){
     for(int j = 0; j < 9 - i; j++)     {
       if((arr[j].compareTo(arr[j+1])) > 0){
       String temp = arr[j];
       arr[j] = arr[j+1];
       arr[j+1] = temp;
       }
       }
      }
            
System.out.println("The alphabetical order is: ");
for(int i = 0; i < 10; i++){
 System.out.println(arr[i]);
 }
   }
   }
