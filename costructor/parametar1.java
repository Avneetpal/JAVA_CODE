import java.util.*;

class example 
{
    private int num;

    //parameterized constructor 
    public example(int x)
    {
        num=x;
    }

    public void prnt()
    {
        System.out.println("You Send Value " + this.num);
    }
}


class parametar1 {
    
    public static void main(String args[])
    {
        example ob= new example(5);
        ob.prnt();
    }
}
