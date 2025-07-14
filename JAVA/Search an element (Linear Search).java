import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
