import java.util.Arrays;

public class Arr_Equal
{
    public static void main(String[] args) {
        

        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }    
}
