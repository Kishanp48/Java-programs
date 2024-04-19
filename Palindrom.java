public class Palindrom {

    public static void main(String[] args) {
        
        String str = "kayak";

        char chr[] = str.toCharArray();

        String rev = "";

        for(char c : chr)
        {
            rev = c+rev;
        }
        
        if(str.equals(rev))
        {
            System.out.println("Is Palindrom");
        }
        else
        {
            System.out.println("not palindorm");
        }
        

    }
    
}
