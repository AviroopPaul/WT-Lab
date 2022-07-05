import java.util.*;

abstract class student {
    int roll, regNo;

    abstract void course();
}

class kiitian extends student {
    void course() {
        Scanner s1 = new Scanner(System.in);
        roll = s1.nextInt();
        regNo = s1.nextInt();
        System.out.println("Roll: " + roll + "\nRegistration no: " + regNo);
    }
}

public class q2 {
    public static void main(String args[]) {
        student s1 = new kiitian();
        s1.course();
    }
}
