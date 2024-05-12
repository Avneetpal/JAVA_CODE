import java.util.Scanner;
public class swap {
    public static void main(String args[]) {
        int num3;
        Scanner a=new Scanner(System.in);
        System.out.println("enter no 1");
        int num1=a.nextInt();
        System.out.println("enter no2");
        int num2=a.nextInt();
        num3=num1;
        num1= num2;
        num2= num3;
        System.out.println("swap num1\t"+num1);
        System.out.println("after swap num2\t"+num2);
        a.close();

        


        
    }
    
}
