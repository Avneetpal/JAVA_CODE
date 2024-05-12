import java.util.*;
class em{
    private String ename,city;
    private int sale;
    public em(int x,String e,String c)
    {
        sale=x;
        ename=e;
        city=c;


    }
    public void print()
    {
        System.out.println("employe name\t"+this.ename);
        System.out.println("employe sale\t"+this.sale);
        System.out.println("employe city\t"+this.city);
    }
}


public class employe {
    public static void main(String args[]) 
    {
        String name,city;
        int sale;
        Scanner a=new Scanner(System.in);
        System.out.println("enter sales");
        sale=a.nextInt();
        System.out.println("enter name");
        name=a.next();
        System.out.println("enter city");
        city=a.next();
        

     em ob=new em(sale,name,city); 
     ob.print();


    }
    
}
