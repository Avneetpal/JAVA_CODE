import java.util.*;

class power extends inout
{
    public int pow(int base , int expo)
    {
        int result=1;
        for(int i=0;i<expo;i++)
        {
            result*=base;
        }
        return result;
    }
    public int countd(int y)
    {
        int coun=0;
        while(y!=0)
        {
            y/=10;
            coun++;
        }
        return coun;
    }
}
class armstrong extends power
{
    public boolean isarm(int no)
    {
        int originalNum=no;
        int n=countd(no);
        int sum=0;
        while(no>0)
        {
            int digi=no%10;
            sum+=pow(digi,n);
            no/=10;
        }
        return sum==originalNum;
    }
}
class output
{
    public static void main(String[] args) {
        Scanner obb=new Scanner(System.in);
        int noo =obb.nextInt();
        armstrong ab=new armstrong();
        //ab.getn();
        if(ab.isarm(noo))
        {
            System.out.println(ab.a+"is aramstron");
        }
        else{
            System.out.println(ab.a+"is not armstron");

        }
    }
}