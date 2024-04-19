public class SumOfPos {

    public static void main(String[] args) {
        
        int arr[]= {-3,-56,45,3,-45};
        
        int sum=0;
        for(int a : arr)
        {
            if(a>0)
            {
                sum+=a;
            }
        }

        System.out.println("sum of posative: "+sum);

    }
    
}
