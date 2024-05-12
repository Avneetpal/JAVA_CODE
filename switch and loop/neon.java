import java.util.*;
public class neon {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no");
        int sum=0,prod=1;
        int num=a.nextInt();
        int square=num*num;
        while(square!=0){
            int digit=square%10;
             sum=sum+digit;
            
             square=square/10;

        }
       
        if(num==sum){
            System.out.println("neon no");
      
        }
        else
        System.out.println("not neon no");
         while(num>0){
            int new1=num%10;
            prod=prod*new1;
            num=num/10;
        }
        if(sum==prod)
        System.out.println("spy no");
         else
        System.out.println("not spy  no");
        
       


    }
    
}
