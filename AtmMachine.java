import java.util.Scanner;

class Atm{
    float Balance;
    int PIN=4567;
    
    public void checkpin(){
        System.out.println("Enter your pin");
        Scanner ad = new Scanner(System.in);
        int Enterpin=ad.nextInt();
        if(Enterpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter the valid pin");
        }
        
    }

    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner ad = new Scanner(System.in);
        int opt = ad.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if (opt==2) {
            withdrawMoney();
        }
        else if (opt == 3) {
            depositMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter the valid choice");
            menu(); 
        }
    }

    public void checkBalance(){
        System.out.println("Balance:"+ Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw:");
        Scanner ad = new Scanner(System.in);
        float amount = ad.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money Withdrawl Successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount:");
        Scanner ad = new Scanner(System.in);
        float amount=ad.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited successfully");
        menu();

    }

}

public class AtmMachine {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.checkpin();
        
    }
    
}