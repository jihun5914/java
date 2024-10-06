package Javaproject;

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Main8 {
    public static void main(String[] args) {
        Account a = new Account(100);
        a.deposit(5000);
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int[] bulk = {100, 500, 200, 700};
        for (int deposit : bulk) {
            a.deposit(deposit);
        }
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int money = 1000;
        a.withdraw(money);
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");
    }
}
