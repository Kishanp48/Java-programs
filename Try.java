import java.util.Arrays;
public class Try
{
    
    
    /* public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of values you want to enter: ");
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("enter the values;\n");
        
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("your values are;\n");

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);

        }

    } */    

    /* public static void main(String[] args) {
        
        int arr[] = {1,3,3,5,534,34};

        Arrays.fill(arr,12423);
        System.out.println(Arrays.toString(arr));   

    } */

    public static void main(String args[])
    {
        int arr[] = {12,2,3,4,467,34,1,3};

        Arrays.sort(arr);
        
        System.out.println("--- "+Arrays.binarySearch(arr, 29));
    }
}
