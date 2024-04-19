interface A
{
    void show();
}
class Concrete implements A
{
    public void show()
    {
        System.out.println(true);
    }

}



public class Interf_Extend {

    public static void main(String[] args) {
        
        A c = new Concrete();

        c.show();


    }
    
}
