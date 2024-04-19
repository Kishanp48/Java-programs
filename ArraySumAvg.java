public class ArraySumAvg {
    public static void main(String[] args) {
        

        int arr[] = {1,2,3,4,5};

        int sum = 0;

        for(int a : arr)
        {
            sum +=a;
        }

        float avg = sum/arr.length;
        System.out.println("sum "+sum);
        System.out.println("average "+avg);
    }
    
}
