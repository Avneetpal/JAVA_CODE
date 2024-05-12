import java.util.*;

class myexample
{
    //default constructor
    public myexample()
    {
        System.out.println("I am Special Method Constructor");
    }


    public void fun()
    {
        System.out.println("Heello ! i am Normal Method");
    }
}

public class example
{
    public static void main(String args[])
    {
        myexample ob= new myexample();
        ob.fun();
    }
}