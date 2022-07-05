import java.lang.Exception;
import java.util.Scanner;
import java.io.*;

class CheckArguments extends Exception {
    CheckArguments(String message) {
        super(message);
    }
}

public class q6 {
    public static void main(String args[]) {

        int a, count = 0, sum = 0;
        System.out.println("enter numbers");
        for (int i = 0; i < args.length; i++) {
            a = Integer.parseInt(args[i]);
            count = count + 1;
            sum = sum + a * a;
        }
        try {
            if (count < 4) {
                throw new CheckArguments("Arguments are greater than 5");
            } else {
                System.out.println(sum);
            }
        } catch (CheckArguments e) {
            System.out.println("Caught the exception");
        }
    }
}
