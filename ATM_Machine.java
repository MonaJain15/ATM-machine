
import java.util.*;


 class ATM {
                float Balance ;
                int PIN = 5764;
                
                public void checkpin(){
                        System.out.print("Enter your pin: ");
                        Scanner sc = new Scanner(System.in);
                        int enteredpin = sc.nextInt();
                        if(enteredpin == PIN){
                                menu();
                        }
                        else{
                                System.out.println("Enter a valid pin");
                        }
                }


                public void menu(){
                        System.out.println("Enter your choice");
                        System.out.println("1. check a/c balance ");
                        System.out.println("2. withdraw money");
                        System.out.println("3.Deposit money");
                        System.out.println("4.EXIT");


                        Scanner sc = new Scanner(System.in);
                        int opt = sc.nextInt();
                          
                        if (opt == 1){
                                checkBalance();
                        }
                        else if(opt == 2){
                                withdrawMoney();
                        }
                        else if (opt == 3){
                                depositMoney();
                        }
                        else if(opt == 4){
                                System.out.println("Exit");
                                return;
                        }
                        else {
                                System.out.println("Enter a valid choice");
                        }
                }

                public void checkBalance(){
                        System.out.println("Balance: " +Balance);
                         menu();
                }

                public void withdrawMoney(){
                        System.out.println("Enter amout to withdraw: ");
                        Scanner sc = new Scanner(System.in);
                        float amount = sc .nextFloat();
                        if (amount > Balance){
                                System.out.println("Insufficient Balance");
                        }
                        else{
                                Balance = Balance - amount;
                                System.out.println("Money withdrawal successfully");
                        }
                        menu();
                }
                public void depositMoney(){
                        System.out.println("Enter the amount:");
                        Scanner sc = new Scanner(System.in);
                        float amount = sc.nextFloat();
                        Balance = Balance + amount;
                        System.out.println("Money deposit successfully");

                        menu();
                }
}
public class ATM_Machine {

         public static void main(String[] args) {


        ATM obj = new ATM();
        obj.checkpin();
                
         }
}