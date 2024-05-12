import java.util.*;
class pow{
    public int a,b;
    public int po(int x,int y){
        int c=1;
        while(y!=0){
            c*=x;
            --y;
           
        }
         return c;

    }
}

public class power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        pow d=new pow();
        d.a=s.nextInt();
        d.b=s.nextInt();
        int r=d.po(d.a,d.b);
        System.out.println(""+r);

    }
    
}
