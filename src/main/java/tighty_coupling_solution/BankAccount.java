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
    now!
    class is encapsulated
    public member not everyone can manipulate
    able add validation/logging/auditing  (hard too many copy-pasting)
    no-need to modify dependent classes

 */