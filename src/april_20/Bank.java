package april_20;

public class Bank {

    String accountInfo;
    int accountNumber;
    Franchise franchise;

    Bank(String accountInfo,int accountNumber){

        this.accountInfo=accountInfo;
        this.accountNumber=accountNumber;
    }
   public void printBankDetails(){

       System.out.println("accountInfo:"+accountInfo);
       System.out.println("accountNumber:"+accountNumber);

   }

}

