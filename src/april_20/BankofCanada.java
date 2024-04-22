package april_20;

public class BankofCanada extends Bank {

    int mortgageRate;

    BankofCanada(String accountInfo, int accountNumber) {
        super(accountInfo, accountNumber);
    }


    public void printMortgageRate(){

        System.out.println("mortgage Rate"+ mortgageRate);



    }

}
