package tighty_coupling_solution;

public class BankAccount {
    private double balance;

    public void withdraw(double amount){
        // validation
        balance -= amount;
    }

    // logging-code

}

/*
    class isn't encapsulated
    public member everyone can manipulate
    no way to add validation/logging/auditing  (hard too many copy-pasting)
    need to modify dependent classes
    
 */