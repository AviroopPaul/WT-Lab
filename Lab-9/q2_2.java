import java.util.*;

public class q2_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}