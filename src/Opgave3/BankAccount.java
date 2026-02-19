package Opgave3;

import java.util.ArrayList;

class BankAccount {
    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    public BankAccount(String owner, double startBalance){
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
    }

   public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Indsæt" + amount);

        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("withdraw", amount));
            System.out.println("Hæv" + amount);
        }
    }

    public void printTransactionHistory(){
        System.out.println("Transaktionshistorik" + owner);
        for(Transaction t : transactions){
            System.out.println(t);
        }
    }

    public double getBalance(){
        return balance;
    }
}
