package tightly_coupling_problem;

public class BankAccount {
    public double balance;
}

/*
    class isn't encapsulated
    public member everyone can manipulate
    no way to add validation/logging/auditing  (hard too many copy-pasting)
    need to modify dependent classes

 */