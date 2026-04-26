

import java.util.Scanner;

public class AddArrayElementsOfDifferentSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array: ");
        int n1 = sc.nextInt();
        System.out.print("Enter size of 2nd array: ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter arr1 elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter arr2 elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int arr[]=AddArrays(arr1,arr2);
        for(int val: arr){
            System.out.print(val + ",");
        }
    }
    public static int[] AddArrays(int[] arr1, int[] arr2) {
        int n1= arr1.length;
        int n2= arr2.length;
        int max = Math.max(n1, n2) + 1;

        int result[]= new int[max];
        int i=n1-1;
        int j=n2-1;
        int k =result.length-1;
        int carry =0;

        while(k>=0){
            int csum =0;
            if(i>=0){
                csum+=arr1[i];

            }
            if(j>=0){
                csum+=arr2[j];
            }
            csum+=carry;
            if(csum>9){
                csum=csum % 10;
                carry=1;
            }
            else{
                carry=0;
            }
            result[k]=csum;
            i--;
            j--;
            k--;
        }
        return result;
        
}
}