import java.util.*;

class Rect {
    int length, breadth;

    int area() {
        return length * breadth;
    }

    int peri() {
        return length + breadth + length + breadth;
    }

    void read() {
        System.out.println("Enter length and breadth: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    void display() {
        System.out.println("Area:  " + area());
        System.out.println("Perimeter:  " + peri());
    }
}

public class q4 {
    public static void main(String arg[]) {
        Rect pt = new Rect();
        pt.read();
        pt.display();
    }
}
