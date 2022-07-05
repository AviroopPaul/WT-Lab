
class twoD {
    int l, b, prtwoD;

    twoD(int len, int bre) {
        l = len;
        b = bre;
    }

    twoD() {

    }

}

class threeD extends twoD {
    int h, price;

    threeD(int len, int bre, int height) {
        super.l = len;
        super.b = bre;
        h = height;
    }

    void price() {
        price = l * b * 40 + l * b * h * 60;
        System.out.println("Total price is: " + price);
    }
}

public class q1 {
    public static void main(String args[]) {
        threeD ob1 = new threeD(6, 7, 8);
        ob1.price();
    }
}
