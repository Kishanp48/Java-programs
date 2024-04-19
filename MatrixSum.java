public class MatrixSum
{

    public static void main(String args[])
    {


        int i,j;

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int total[][] = new int[2][2];

        a[0][0] = 2;
        a[0][1] = 2;
        a[1][0] = 2;
        a[1][1] = 2;


        b[0][0] = 3;
        b[0][1] = 3;
        b[1][0] = 3;
        b[1][1] = 3;


        for(i = 0; i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }


        System.out.println("\n\n+\n\n");


        for(i = 0; i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        
        


        for(i = 0; i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                total[i][j] = a[i][j] + b[i][j];
            }
        }


        System.out.println("\n\n=\n\n");


        for(i = 0; i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(total[i][j]);
            }
            System.out.println();
        }



      


    }

}
