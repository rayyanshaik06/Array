import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency = " + count);
        sc.close();
    }
}
