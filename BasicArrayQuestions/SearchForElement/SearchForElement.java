import java.util.Scanner;

public class SearchForElement {
    static int TraverseAndSearch(int[] arr, int target) {
        int index =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index =i;
                break;
            }
        }
        return index;
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

        System.out.print("Enter Target to be Searched: ");
        int x = sc.nextInt();

        int result = TraverseAndSearch(arr,x);
        System.out.println("The Index is :"+ result);
        sc.close();
    }
}
