import java.util.*;
class array
{
    public int[] num=new int[100];
    private int n;

    public array(int x)
    {   
        n=x;

    }
    public void getnumber()
    {
        Scanner a=new Scanner(System.in);
        for (int i=0;i<this.n;i++)
        {
            System.out.println("enter values of array");
            this.num[i]=a.nextInt();

        }
        a.close();
      
    
    }
    public void check()
    
    {
        for (int i=0;i<this.n;i++)
        {
            if(num[i]%2==0)
            {
                System.out.println("even\t"+this.num[i]);
            }
            else{
                System.out.println("odd\t"+this.num[i]);
            }
        }
    }
}
class even
{
    public static void main(String arg[])
    {
        Scanner obb=new Scanner(System.in);
        System.out.println("enter no of elements for array");
        int nu=obb.nextInt();
        array a=new array(nu);
        a.getnumber();
        a.check();
        obb.close();
    }
}