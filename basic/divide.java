
import java.util.Scanner;
public class divide {
    public static void main(String args[]){
        System.out.println(" enter no1");
        Scanner a =new Scanner(System.in);
        float num1 =a.nextFloat();
        System.out.println(" enter no2");
        float num2=a.nextFloat();
       float num3 = num1/num2;
        System.out.println("RESULT\t"+num3);
        a.close();


    }
    
}
