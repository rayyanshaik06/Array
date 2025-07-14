import java.util.Scanner;

public class ReplaceNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
