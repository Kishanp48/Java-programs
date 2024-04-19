import java.util.Arrays;

public class Kth {

    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5};

        Kth obj = new Kth();

        System.out.println(obj.findKthSmallest(a,2));
        System.out.println(obj.findKthLargest(a,2));

    }

    public int findKthSmallest(int arr[], int k)
    {
        Arrays.sort(arr);

        return arr[k-1]; 
    }

    public int findKthLargest(int arr[], int k)
    {
        Arrays.sort(arr);

        return arr[arr.length - k]; 
    }
    
}
