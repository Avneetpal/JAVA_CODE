import java.util.*;
class ad{
    private int num1,num2,num3;
    
    public  ad(int a,int b)
    {
        num1=a;
        num2=b;
        num3=num1+num2;

    }
    public void p(){
        
        System.out.println("result\t"+this.num3);

    }
}
public class add{
    public static void main(String[] args) 
    {
        int a,b;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter no 1");
        a=ob.nextInt();
        System.out.println("enter no 2");
        b=ob.nextInt();
        ad obb=new ad(a,b);
    
        obb.p();

        
    }
}