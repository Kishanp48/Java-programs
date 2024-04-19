public class Prime_toN {

    public static void main(String[] args) {
        

        int no=10;

        for(int n = 1;n<=no;n++)
        {
            int count = 0;
            for(int i = 2;i<n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(n);
            }

        }
    }
    
}
