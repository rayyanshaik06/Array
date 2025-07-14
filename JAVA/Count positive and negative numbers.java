import java.util.Scanner;

public class CountPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int positive = 0, negative = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] >= 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        sc.close();
    }
}
