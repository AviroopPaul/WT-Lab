package general;

public class Employee {
    protected int empid;
    double e;

    public double earning(int basic) {
        e = basic + 0.8 * basic + 0.15 * basic;
        return e;
    }
}
