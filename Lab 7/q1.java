class Shape {
    double area;

    void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(int r) {
        radius = r;
    }

    @Override
    void showArea() {
        area = 3.14 * radius * radius;
        super.showArea();
    }
}

class Rectangle extends Shape {
    double len, bre;

    Rectangle(int l, int b) {
        len = l;
        bre = b;
    }

    @Override
    void showArea() {
        area = len * bre;
        super.showArea();
    }
}

public class q1 {
    public static void main(String args[]) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(4, 5);
        c1.showArea();
        r1.showArea();
    }
}
