import java.util.Scanner;

class in{
    public int a,b,c;
    public int inter(int x,int y,int z)
    {
        int i;
        i=(x*y*z)/100;
        return i;

    }
}
public class interest{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        in obj=new in();
        System.out.println("enter principal");
        obj.a=ob.nextInt();
        System.out.println("enter rate of interst");
        obj.b=ob.nextInt();
        System.out.println("enter time in year");
        obj.c=ob.nextInt();
        int d=obj.inter(obj.a,obj.b,obj.c);
        System.out.println("result"+d);

        

    }
}