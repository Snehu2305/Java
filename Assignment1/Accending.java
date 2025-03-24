import java.util.*; 

class Accending{
   public static void main(String arg[]){
     Scanner scan = new Scanner (System.in);
      int arr[] = new int[10];
      
     System.out.println("Enter  10 numbers: ");
      for(int i = 0; i< 10; i++){
        arr[i] = scan.nextInt();
        }
       for(int i = 0; i< 10; i++){
         for(int j = i +1; j < 10; j++){
           if(arr[i] > arr[j]){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             }
            }
          }
        for(int i = 0; i< 10; i++){
         System.out.print(arr[i]+ " ");
         }
        }
          
        } 
    
