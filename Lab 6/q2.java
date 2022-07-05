import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int ctr_even = 0, ctr_odd = 0;
        System.out.println("Original Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ctr_even++;
            } else
                ctr_odd++;
        }
        System.out.printf("\nNumber of even elements in the array: %d", ctr_even);
        System.out.printf("\nNumber of odd elements in the array: %d", ctr_odd);
        System.out.printf("\n");
    }
}
