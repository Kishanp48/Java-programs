class CustomException extends Exception
{
    
    CustomException(String s)
    {
        super(s);
    }

}


class UserDefineException 
{
    public static void main(String args[])
    {
        try
        {
            int i=1, j=5;


            if(i<j)
            {
                throw new CustomException("i is less than j");
            }
            else
            {
                System.out.println(i-j);
            }

        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
