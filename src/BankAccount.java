import java.util.Scanner;

public class BankAccount {
    /*Create a BankAccount class with properties accountNumber, accountHolderName, balance, accountType. Write a constructor to initialize these properties when creating a BankAccount object. Include
    methods to deposit and withdraw money, and a method to display the account details.*/
    int accountNumber;
    String accountHolderName;
    double balance;
    public BankAccount(int accountNumber,String accountHolderName,double balance ){
        this.accountNumber= accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public void show(){
        System.out.println("****************");
        System.out.println("welcome to your bank account");
        System.out.println("Account Number :"+accountNumber);
        System.out.println("AccountHolder Name :"+accountHolderName);
        System.out.println("Balance : "+"$"+balance);
        System.out.println("*****************");
    }
    public void deposit(int deposit_amount){
        double new_balance = this.balance + deposit_amount;
        System.out.println(">>>> Your new account balance is ="+ "$"+new_balance);

    }
    public void withdrawal(int withdrawal_amount){
        double new_balance = this.balance - withdrawal_amount;
        System.out.println(">>>> Your new account balance is ="+ "$"+new_balance);

    }
    public static void main(String[] args) {


        BankAccount bank = new BankAccount(24567,"Jugraj",5000);
        bank.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money you want to deposit in your bank account");
        int deposit_amount= scanner.nextInt();
        bank.deposit(deposit_amount);
        System.out.println("------------------");
        System.out.println("Enter the amount of money you want to withdrawal from your bank account");
        int withdrawal_amount= scanner.nextInt();
        bank.withdrawal(withdrawal_amount);


    }
}
