import java.util.*;
import java.io.IOException;

class NegException extends Exception {
    public NegException(String str) {
        System.out.println(str);
    }
}

public class question4 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");

        try {
            int num = sc.nextInt();
            sc.close();
            if (num < 0)
                throw new NegException("Number is negative");
            else
                System.out.println(+num * 2);
        } catch (NegException m) {
            System.out.println(m);
        }
    }

}