import java.util.Scanner;

public class EvenIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
