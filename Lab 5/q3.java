import java.util.*;

public class q3 {
    int area(int a) {
        return a * a;
    }

    double area(double a) {
        return 3.14 * a * a;
    }

    double area(int b, int h) {
        return (0.5 * b * h);
    }

    public static void main(String args[]) {
        System.out.println("Enter your choice: ");
        System.out.println("1->Triangle");
        System.out.println("3->Circle");
        System.out.println("4->Square");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        q3 pt = new q3();
        switch (opt) {
            case 1:
                System.out.println("Enter base and height of triangle: ");
                Scanner tr = new Scanner(System.in);
                int b = tr.nextInt();
                int h = tr.nextInt();
                System.out.println("Area: " + pt.area(b, h));
                break;
            case 3:
                System.out.println("Enter radius of circle: ");
                Scanner cr = new Scanner(System.in);
                double r = cr.nextInt();
                System.out.println("Area: " + pt.area(r));
                break;
            case 4:
                System.out.println("Enter side of square: ");
                Scanner sq = new Scanner(System.in);
                int a = sq.nextInt();
                System.out.println("Area: " + pt.area(a));
                break;

        }
    }

}
