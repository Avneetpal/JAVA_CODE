import java.util.Scanner;
public class max3 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no1");
        int num1=a.nextInt();
        System.out.println("enter  no 2");
        int num2=a.nextInt();
        System.out.println("enter no 3");
        int num3=a.nextInt();
        if(num1>num2&&num1>num3)
        {
            System.out.println("number1 is greater"+num1);
        }
        else if(num2>num1&&num2>num3){
            System.out.println("number 2 is greater"+num2);
        }
        else
        System.out.println("no 3 is greater"+num3);


    }
    
}
