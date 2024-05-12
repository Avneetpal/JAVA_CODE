import java.util.*;

class search

{
    public int[] num=new int[100];
    private int n,m;
    public search(int x)
    {
        n=x;
        

    }
    public void push()
    {
        Scanner a=new Scanner(System.in);
        for(int i=0;i<this.n;i++)
        {
            System.out.println("enter elements of array");
            System.out.println("do you want to add no");
            String s=a.next();
                if(s=="yes")
                {
                    this.num[i]=a.nextInt();
                }
                else
                break;
             }
      
        a.close();
    }
    public void se()
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


 class out  {
    public static void main(String[] args)
     {
        Scanner d=new Scanner(System.in);
        System.out.println("enter no of elements");
        int num1=d.nextInt();
        //System.out.println("enter digit to find");
        //int num2=d.nextInt();
        search se=new search(num1);
        se.push();
        //se.s();
        d.close();
    }    
}
