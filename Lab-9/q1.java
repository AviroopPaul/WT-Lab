interface Motor {
    int capacity = 10;

    void run();

    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.print("Runnning!\n");
    }

    public void consume() {
        System.out.print("Consuming:" + " " + capacity);
    }
}

public class q1 {
    public static void main(String args[]) {
        WashingMachine w1 = new WashingMachine();
        w1.run();
        w1.consume();
    }
}