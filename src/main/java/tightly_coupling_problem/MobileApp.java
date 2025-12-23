package tightly_coupling_problem;

public class MobileApp {
    public void withdraw(BankAccount bankAccount,double amount){
        bankAccount.balance -= amount;
    }
}
