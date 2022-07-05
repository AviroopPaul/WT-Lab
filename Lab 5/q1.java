import java.util.*;

class box {
    int length, width, height;

    box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return (length * height * width);
    }
}

public class q1 {
    public static void main(String args[]) {
        box b1 = new box(10, 15, 30);
        int vol;
        vol = b1.volume();
        System.out.println("Volume: " + vol + " cubic units");
    }
}
