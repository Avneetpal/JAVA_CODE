import java.util.*;
public class fabonacci {   
    public static void main(String[] args) {
        //Scanner a=new Scanner(System.in);
        //System.out.println("enter no");
        int num1=0;
        int num2=1,num3=0;
        while(num1<=100){
            System.out.println(""+num1);
            num3=num1+num2;
            num1=num2;
            num2=num3;

        }

        
    }
}
