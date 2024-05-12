import java.util.*;
class inout
{
    public int a,b;
    public void getnum()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter no 1");
        this.a=ob.nextInt();
        System.out.println("enter no 2");
        this.b=ob.nextInt();

    }
    public void show(int x)
    {
    System.out.println("result"+x);
    }
}
class add extends inout
{
    public int ad(int x,int y)
    {
        int z;
        z=x+y;
        return z;
    }
}
class myadd
{
    public static void main(String[] args) {
        add obj =new add();
        obj.getnum();
        int r=obj.ad(obj.a, obj.b);
        obj.show(r);
    }
}