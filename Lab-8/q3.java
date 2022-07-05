class base {
    int a, b;

    base(int a1, int b1) {
        a = a1;
        b = b1;
        System.out.println(a + " " + b);
    }
}

class der extends base {
    der(int a, int b) {
        super(a, b);
    }
}

public class q3 {
    public static void main(String args[]) {
        der d1 = new der(5, 6);
    }
}
