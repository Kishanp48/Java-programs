interface A
{
    public void show();
}
interface B
{
    public void display();
}



class Demo implements A,B
{
    public void show()
    {
        System.out.println("is show");
    }

    public void display()
    {
        System.out.println("is display");
    }
}

class MultyInherit
{
    public static void main(String args[])
    {

        Demo d = new Demo();

        d.show();
        d.display();

    }
}