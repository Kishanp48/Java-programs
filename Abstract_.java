abstract class Abs
{
    abstract void show();
}

class Concrete extends Abs
{
    public void show()
    {
        System.out.println(true);
    }

}


public class Abstract_ {

    public static void main(String[] args) {
        
        Abs c = new Concrete();

        c.show();

    }
    
}
