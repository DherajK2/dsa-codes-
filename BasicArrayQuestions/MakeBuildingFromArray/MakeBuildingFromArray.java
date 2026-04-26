

import java.util.Scanner;

public class MakeBuildingFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        makeBuilds(arr, n);
    }

    public static void makeBuilds(int[] arr, int n) {

        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val>max){
                max=val;
            }
        }
        for(int floor=max;floor>0;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                System.out.print("* ");//2characters
                }
                else{
                    System.out.print("  ");//2character space
                }
            }
            System.out.println();

        }
        }
    }
