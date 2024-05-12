import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int sum=0,num1;
        Scanner a=new Scanner(System.in);
        System.out.println("enter no");
        int num=a.nextInt();
         num1=num*num*num;
        while(num1!=0){
            int digit=num1%10;
            sum=sum+digit;
            num1=num1/10;
            ++num1;

        }
        if(num==sum)
        System.out.println("armstrong");
        else
        System.out.println("not armstrong");

    }
    
}
