package marketting;

import java.util.Scanner;

import general.*;

public class sales extends Employee {

    // Employee e = new Employee();

    public void tallowance(int basic, int id) {
        empid = id;
        double ta = 0.05 * earning(basic);
        System.out.println("TA Allowance: " + ta);

        System.out.println("Employee ID: " + empid);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic: ");
        int bas = sc.nextInt();
        System.out.println("Enter employee ID: ");
        int eid = sc.nextInt();

        sales s1 = new sales();
        s1.tallowance(bas, eid);
        sc.close();
    }
}
