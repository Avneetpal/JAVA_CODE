import java.util.*;
class power
{
    public int pow(int base,int exponent)
    {
        int result=1;
        for(int i=0;i<exponent;i++)
            result=result*base;
        return result;

    }
    public int count(int no)
    {
        int c=0;
        while(no!=0)
        {
            no/=10;
            c++;
        }
        return c;
    }

}
class armstrong extends power
{ 
    public void arm(int n)
    {
        int originalno=n;
        int sum=0;
        while(n>0)
        {
            int digit =n%10;
            sum +=pow(digit,n);
            n/=10;


        }
        if(sum==originalno)
        {
            System.out.println(n+"armstrg");
        }
        else
        System.out.println(n+"not armstrong");
    }  

}
class Main
{
    public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    armstrong obb=new armstrong();
    int n =a.nextInt();
    obb.arm(n);    
    }
}