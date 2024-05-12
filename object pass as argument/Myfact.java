import java.util.*;

class myfactorial
{
    public int res,num;
    public myfactorial fact(myfactorial ob)
    {
        ob.res=1;
        int i=1;
        while(i<=ob.num)
        {
            res*=i;
            i++;
        }
        return ob;

    }
}

class Myfact {
    
    public static void main(String args[])
    {
        Scanner obb=new Scanner(System.in);
        myfactorial fobj= new myfactorial();
        System.out.println("Enter a Number :");
        fobj.num=obb.nextInt();
        fobj=fobj.fact(fobj);
        System.out.println("Result :" + fobj.res);

        
    }
}
