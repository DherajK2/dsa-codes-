package GreaterElementThanX;
import java.util.Scanner;

class GreaterElement {

    // function returns count of elements > X
    static int countGreater(int[] arr, int x) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        int result = countGreater(arr, x);

        System.out.println("Count of elements greater than " + x + " = " + result);
    }
}