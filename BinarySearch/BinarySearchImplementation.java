package BinarySearch;

public class BinarySearchImplementation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
       int left =0;
       int right = arr.length-1;
        while(left<=right){
            int mid = left +(right -left)/2;
            if(arr[mid]==target){
                //Element found at index mid -> This line will be executed when the element is found in the array and the mid index is returned
                return mid;
            } else if(arr[mid]<target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //Either this line will be executed when the element is not found in the array or when the left pointer crosses the right pointer
        return -1;
    }
}
