package _16_Class.BankAccount;

public class BankAccount {
    private int balance;

    public int getBalance() {
        return balance;
    }

    BankAccount (int balance) {
        this.balance = balance;
        System.out.println("잔액은 "+balance);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("입금금액은 "+amount+"입니다.");
        }
    }

    public void withdraw(int amount){
        if(amount <= 0) {
            System.out.println("출금액은 0월 초과 필요");
        } else if (amount > balance) {
            System.out.println("잔액이 부족합니다. 현재잔액은 "+balance+"입니다.");
        }
    }



}
