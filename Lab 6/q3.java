import java.util.*;

public class q3 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int k = 0; k < array.length; k++) {
            for (int j = k + 1; j < array.length; j++) {
                int tmp = 0;
                if (array[k] > array[j]) {
                    tmp = array[k];
                    array[k] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
