import java.util.Scanner;
public class assignmet {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no1");
        int num1=a.nextInt();
        System.out.println("enter num 2");
        int num2=a.nextInt();
        num1+=num2;
        System.out.println("sum"+num1);
        num1-=num2;
        System.out.println("substract"+num1);
        num1*=num2;
        System.out.println("multiply"+num1);
        num1/=num2;
        System.out.println("divide\t"+num1);
        num1%=num2;
        System.out.println("moudulus"+num1);
        a.close();


    }
    
}
