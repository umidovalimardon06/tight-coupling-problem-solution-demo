package tighty_coupling_solution;

public class ATM {
    public void withdraw(BankAccount bankAccount, double amount){
        bankAccount.withdraw(amount);
    }
}
