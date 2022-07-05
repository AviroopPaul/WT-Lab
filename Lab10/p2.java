package Lab10;

class LessBalanceException extends Exception {
    public LessBalanceException(String str) {
        super(str);
    }
}

class Account {
    int balance = 1000;

    void check(int withdraw) {
        try {
            if ((balance - withdraw) < 500) {
                throw new LessBalanceException("Withdraw amount is invalid");
            } else {
                balance = balance - withdraw;
                System.out.println("Successful, remaining balance = " + balance);
            }
        } catch (Exception e) {
            System.out.println("Caught Exception! Insufficient balance.");
        }
    }
}

public class p2 {
    public static void main(String args[]) {
        Account a1 = new Account();
        a1.check(600);
    }
}
