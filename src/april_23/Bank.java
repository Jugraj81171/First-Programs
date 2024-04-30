package april_23;

public abstract class Bank {
    public abstract void rateOfInterest();

}
class Rbc extends Bank{
    public void rateOfInterest(){
        System.out.println("Rate of Interest is :");


    }

}
class BankMain {
    public static void main(String[] args) {
        Bank bank = new Rbc();
        bank.rateOfInterest();

    }
}
