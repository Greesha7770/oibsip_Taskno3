package Game1;
import java.util.Scanner;

class ATM {
    public static void main(String [] args ) {
        
        int Choice ,Balance =100000,Deposit ,Withdraw ;
        while(true){
        System.out.println(" \nEnter valid Choice to perform appropriate operation \n ");
System.out.println(" Enter 0 to Exit \n  Enter 1 to Deposit \n Enter 2 to Withdraw \n  Enter  3 to CheckBalance  ");
Scanner sc = new Scanner(System.in);   
Choice=sc.nextInt(); 

switch (Choice) {
    case 0:
    

        System.exit(0);

        break;

        case 1:
        System.out.println("\n Enter amt that to be deposited ");
        Deposit=sc.nextInt();
        Balance=Balance+Deposit;
        System.out.println(" Your Money has been Succesfully Deposited "+Balance);
        break;

        case 2:
        System.out.println("\n Enter money to be  withdrawn ");
        Withdraw=sc.nextInt();


        if(Balance>=Withdraw){
System.out.println("\n  Amount is successfully withdrawn ");
Balance =Balance-Withdraw;
System.out.println("\n Balance after Withdrawn "+Balance );
        }
        else{
            System.out.println("\n You dont have Sufficient Balance with You ");
        }
    
        break;
    case 3:
    System.out.println("\n Total Balance is "+Balance );
        break;
}
    
    }
}
}