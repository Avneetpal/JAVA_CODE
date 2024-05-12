import java.util.*;

class myfact{
     int x, res;
        public myfact factorial(myfact ob )
        {
            int i=1;
            while (i<=ob.x);{
                ob.res=ob.res*i;
                i++;
            }
            return ob;
        }
}
class factorial {
    public static void main(String args[]) 
    {
        Scanner obb=new Scanner(System.in);
        myfact fa=new myfact();
        System.out.println("enter no");
        fa.x=obb.nextInt();
        fa=fa.factorial(fa);
        System.out.println("hello");
        System.out.println(""+fa.res);
    }
    
}


