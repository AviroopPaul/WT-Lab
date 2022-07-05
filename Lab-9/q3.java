import java.util.*;

interface Salary {
    void earnings();

    void deductions();

    void bonus();

}

abstract class Manager implements Salary {
    int basic;
    double earn;
    double ded;

    public void input() {
        System.out.println("Enter Basic: ");
        Scanner sc = new Scanner(System.in);
        basic = sc.nextInt();
    }

    public void earnings() {
        earn = basic + 0.8 * basic + 0.15 * basic;
        System.out.println("Earnings: " + earn);
    }

    public void deductions() {
        ded = 0.12 * basic;
        System.out.println("Deductions: " + ded);
    }

}

class sub extends Manager
        implements Salary {

    double bonus;

    public void bonus() {
        bonus = 0.5 * basic;
        System.out.println("Bonus: " + bonus);
    }
}

public class q3 {
    public static void main(String args[]) {
        sub s1 = new sub();
        s1.input();
        s1.earnings();
        s1.deductions();
        s1.bonus();
    }
}
