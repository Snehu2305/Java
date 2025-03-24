import java.util.*;
class Merge{
  public static void main(String[] ar){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the size of an array 1: ");
   int size1 = scan.nextInt();
   System.out.println("Enter the size of an array 2: ");
   int size2 = scan.nextInt();
   
   System.out.println("Enter the elements of an array 1: ");
   int[] arr1 = new int[size1];
   for(int i = 0; i < size1; i++){
   arr1[i] = scan.nextInt();
   }
   
    System.out.println("Enter the elements of an array 2: ");
   int[] arr2 = new int[size2];
   for(int i = 0; i < size2; i++){
   arr2[i] = scan.nextInt();
   }
   
   int size3 = size1 + size2;
   int[] arr3 = new int[size3];
   
   mergeSort(arr1, arr2, arr3, size1, size2, size3);
   
  }
 static void mergeSort(int[] arr1, int[] arr2, int[] arr3, int size1, int size2, int size3){
   for(int i = 0; i < size1; i++){
     for(int j = 0; j < size2; j++){
       for(int k = 0; k < size3; k++){
       if(arr1[i] < arr2[j]){
         arr3[k] = arr1[i];
         k++;
         }
        else{
         arr3[k] = arr2[j];
         k++;
        }
        }
      }
      }
      for(int l = 0; l < size3; l++){
       System.out.print(arr3[l] + " ");
       }
 
  }
  }
