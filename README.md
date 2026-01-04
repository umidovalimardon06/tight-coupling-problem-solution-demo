# Encapsulation & Tight Coupling Example (Java)

This project demonstrates a **tight coupling problem** caused by poor encapsulation and shows how to solve it using **proper object-oriented design principles**, specifically **encapsulation**.

---

## 📌 Problem: Tight Coupling Due to Public Fields

### Package

```
tightly_coupling_problem
```

### Code Example

```java
public class BankAccount {
    public double balance;
}
```

### Issues

* ❌ **No encapsulation**: The `balance` field is public.
* ❌ **Uncontrolled access**: Any class can modify the balance directly.
* ❌ **No validation**: Invalid operations (negative withdrawal, overdraft) are possible.
* ❌ **No logging or auditing**: Balance changes cannot be tracked centrally.
* ❌ **Tight coupling**:

    * Business logic is duplicated across dependent classes.
    * Adding rules requires modifying many places.
    * Changes break or force updates in dependent code.

This design leads to fragile, hard-to-maintain, and error-prone systems.

---

## ✅ Solution: Encapsulation to Reduce Coupling

### Package

```
tighty_coupling_solution
```

### Code Example

```java
public class BankAccount {
    private double balance;

    public void withdraw(double amount) {
        // validation
        balance -= amount;
    }

    // logging-code
}
```

### Improvements

* ✅ **Encapsulation**: `balance` is private and protected from direct access.
* ✅ **Controlled modification**: Balance changes only through methods.
* ✅ **Centralized validation**: Business rules are enforced in one place.
* ✅ **Easy logging & auditing**: Can be added without touching other classes.
* ✅ **Loose coupling**:

    * Dependent classes rely on behavior, not internal data.
    * Internal changes do not affect external code.

---

## 🧠 Key Takeaway

> **Encapsulation reduces tight coupling and increases maintainability.**

By hiding internal state and exposing behavior through methods, we:

* Improve code safety
* Reduce duplication
* Make systems easier to extend and refactor

---

## 📚 Principle Demonstrated

* Object-Oriented Programming (OOP)
* Encapsulation
* Low Coupling / High Cohesion

---

### ✅ Recommendation

Always **avoid public fields** in domain models. Use private fields with public methods to protect invariants and keep your system flexible.
