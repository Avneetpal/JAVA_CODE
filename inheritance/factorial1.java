import java.util.*;
class in
{
    public int a;
    public void input()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter no");
        this.a=ob.nextInt(); 
    }
    public void show(long x)
    {
        System.out.println("result"+x);

    }
}
class fact extends in
{
    public long fac(int x)
    {
        long facte=1;
        int z=1;
        while(z<=x)
        {
            facte=facte*z;
            ++z;
        }
        return facte;
    }

}
class factorial
{
   public static void main(String args[]) {
    
    fact obb=new fact();
    obb.input();
    long r=obb.fac(obb.a);
    obb.show(r);
    

   }


}