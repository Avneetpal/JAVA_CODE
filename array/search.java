import java.util.*;

class search

{
    public int[] num=new int[100];
    private int n,m;
    public search(int x)
    {
        n=x;
        

    }
    public void getno()
    {
        Scanner a=new Scanner(System.in);
        for(int i=0;i<this.n;i++)
        {
            System.out.println("enter elements of array");
            this.num[i]=a.nextInt();

        }
        System.out.println("enter digit to find");
        this.m=a.nextInt();
        a.close();
    }
    public void s()
    {
        for(int i=0;i<this.n;i++)
        {
            if(num[i]==this.m)
            {
                System.out.println("found at index\t"+i);
            }
            else{
                System.out.println("not found");
            }
        }
    }
}


 class output  {
    public static void main(String[] args)
     {
        Scanner d=new Scanner(System.in);
        System.out.println("enter no of elements");
        int num1=d.nextInt();
        //System.out.println("enter digit to find");
        //int num2=d.nextInt();
        search se=new search(num1);
        se.getno();
        se.s();
        d.close();
    }    
}
