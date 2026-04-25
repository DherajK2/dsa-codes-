package SpanOfArray;
public class SpanOfArray {
    public static void main(String[] args) {
        int arr[]={5,3,4,11,9,2};

        int max=arr[0];
        int min=arr[0];
        int span=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)max=arr[i];
            if(arr[i]<min)min=arr[i];
        }
            span = max - min;
            System.out.println("Max : "+max);
            System.out.println("Min : "+min);
            System.out.println("Span Of Array :"+span);
        }
    }

