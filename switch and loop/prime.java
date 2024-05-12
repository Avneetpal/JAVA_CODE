import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        boolean c=false;
        int num=a.nextInt();
        int x=2;
        while(x<num){
            if(num%x==0){
           c=true;
        break;
    }
            ++x;
        
          
        }
        if(c)
        System.out.println(" not prime");
        else
        System.out.println("prime");
        
       
       


    }
    
}
