package april_20;

public class Rbc extends BankofCanada{
    int minimumDeposit;
    int fees;

    Rbc(String accountInfo, int accountNumber) {
        super(accountInfo, accountNumber);
    }

    public void printScotiaBankInfo(){
        System.out.println("fees"+fees);


    }
}
