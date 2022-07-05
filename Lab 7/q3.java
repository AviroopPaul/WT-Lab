import java.util.Scanner;

class plate {
    int length, width;

    plate() {
        System.out.println("Plate Class Constructor.");
    }
}

class box extends plate {
    int height;

    box() {
        System.out.println("Box Class Constructor.");
    }
}

class wood_box extends box {
    int thick;

    wood_box(int l, int w, int h, int t) {
        System.out.println("Wood Box Class Constructor.");
        length = l;
        width = w;
        height = h;
        thick = t;
        System.out.println("Length: " + length + "\nbreadth: " + width + "\nheight: " + height + "\nThick: " + thick);

    }
}

public class q3 {
    public static void main(String[] args) {
        wood_box obj = new wood_box(3, 4, 5, 6);
    }
}
