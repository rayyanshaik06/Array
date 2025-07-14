import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[5];
        int[] copy = new int[5];

        for(int i = 0; i < original.length; i++) {
            original[i] = sc.nextInt();
        }

        for(int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        sc.close();
    }
}
