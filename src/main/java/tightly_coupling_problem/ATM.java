package tightly_coupling_problem;

public class ATM {
    public void withdraw(BankAccount bankAccount,double amount){
        bankAccount.balance -= amount;
    }
}
