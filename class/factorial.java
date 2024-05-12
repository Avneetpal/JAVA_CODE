import java.util.*;
class fact{
    public double a;
    public double fac(double x){
        int fact=1;
        int i=1;
        while(i<=x){
             
            fact=fact*i;
            ++i;
            
          
        }
        return fact;
          
          
      

    }

}
public class factorial {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter no");
        fact f=new fact();
        f.a=s.nextDouble();
        double b=f.fac(f.a);
        System.out.println("factrrial\n"+b);
        


    }
    
}
