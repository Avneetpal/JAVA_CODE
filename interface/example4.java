import java.util.*;
interface onee
{
    public void upp(String s);
    public void low(String s);
    public void space(String s);
}
class body implements onee
{
    public void upp(String s)
    {
        System.out.println(""+s.toUpperCase());
    }
    public void low(String s)
    {
        System.out.println(""+s.toLowerCase());
    }
    public void  space(String s)
    {
        int i=1;
        int count =0;
        for(i=1;i<=s.length()-1;i++)
        {
             char ch =s.charAt(i);
            if(ch==' ')
            {
                ++count;
            }
        }
        System.out.println(""+count);
       }
   
    
}
class out
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        body ob=new body();
        String s=a.nextLine();
        ob.low(s);
        ob.upp(s);
        ob.space(s);
        a.close();

    }
}
