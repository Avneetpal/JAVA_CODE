interface base
{
    public void one();
    public void two();
    public void three();
}

class xyz implements base
{
    public void one()
    {
        System.out.println("I am one Function of interface");
    }

    public void three()
    {
        System.out.println("I am three function interface ");
    }

    public void two()
    {
        System.out.println("I am two function member ");
    }
}

class example
{
    public static void main(String args[]) {
        xyz ob= new xyz();
        ob.two();
        ob.one();
    }
}