//import java.util.*;

abstract class base
{
    public void fun()
    {
        System.out.println("I am Function");
    }

    abstract void one();
    abstract void two();
}

class drive extends base
{
    public void one()
    {
        System.out.println(" I am Base class Member ");
    }

    public void two()
    {
        System.out.println("I am Base class Member second");
    }
}

class example
{
    public static void main(String[] args) 
    {
        drive ob=new drive();
        ob.two();   
        ob.one();
    }
}