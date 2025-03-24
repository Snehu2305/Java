import java.util.*;
class BankAccount{
 double initialAmount;
 double savingAmount;
 double TotalBalance;
 double withdrawAmount;
Scanner sc = new Scanner(System.in);

   BankAccount(){
 
 System.out.println("Enter your Initial amount: ");
  initialAmount = sc.nextDouble();
  
 }
 
 void deposit(){
 System.out.println("Enter the amount you want to deposit: ");
   savingAmount = sc.nextDouble();
   TotalBalance = initialAmount + savingAmount;
  System.out.println("Now your total balance is: " +TotalBalance);
  initialAmount = TotalBalance;
}

void withdraw(){
//TotalBalance = initialAmount;
   System.out.println("Enter the amount you want to withdraw: ");
   withdrawAmount = sc.nextDouble();
  
   
 if(withdrawAmount > initialAmount){
  System.out.println("You can't withdraw the amount");
  }

else{  
   TotalBalance = initialAmount - withdrawAmount;
   System.out.println("Now your total balance is: " +TotalBalance);
   initialAmount = TotalBalance;
   }

}

}

class SavingsAccount extends  BankAccount{
  void deposit(){
   super.deposit();}
  void withdraw(){
  
  if(initialAmount < 100){
   System.out.println("You can't withdraw the amount");
   }
   else{
   super.withdraw();
  }
   }
   }

class overriding{
 public static void main(String[] ar){
   Scanner scan = new Scanner (System.in);
   int choice;
   
   
  // BankAccount bank = new BankAccount();
   SavingsAccount save = new SavingsAccount();

   
   while(true){
   System.out.println("\n1.deposit\n2.withdraw");
   System.out.println("Enter the option: ");
   choice = scan.nextInt();
   
   switch(choice){
    case 1: 
     save.deposit();
      break;
    case 2: 
     // bank.withdraw();
      save.withdraw();
      break;
    case 0:
      System.exit(0);
    }
   }
  }
}
