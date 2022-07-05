import java.util.*;

class Account {
    int accNo, balance;

    void display() {
        System.out.println("Account no: " + accNo + "\nBalance: " + balance);
    }
}

class Person extends Account {
    int aadhar;
    String name;

    Person(String n, int ad, int acc, int bal) {
        name = n;
        aadhar = ad;
        accNo = acc;
        balance = bal;
    }

    @Override
    void display() {
        System.out.println("Name: " + name + "\nAadhar: " + aadhar);
        super.display();
    }
}

public class q1 {
    public static void main(String args[]) {
        Person p1, p2, p3, p4, p5;
        p1 = new Person("One", 1234567, 902092, 1000);
        p1.display();
        p2 = new Person("two", 1234567, 902092, 1000);
        p2.display();
        p3 = new Person("three", 1234567, 902092, 1000);
        p3.display();
        p4 = new Person("four", 1234567, 902092, 1000);
        p4.display();
        p5 = new Person("five", 1234567, 902092, 1000);
        p5.display();
    }
}
