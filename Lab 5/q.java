public class q {

    int sub(int a, int b) {
        return (a - b);
    }

    float sub(float a, float b) {
        return a - b;
    }

    int sub(int a) {
        return a;
    }

    public static void main(String args[]) {
        q s = new q();
        System.out.println(s.sub(4, 5));
        System.out.println(s.sub(4.0f, 1.5f));
        System.out.println(s.sub(4));

    }

}
