import java.util.Scanner;
public class substract3 {
    public static void main(String[] args) {
    System.out.println("enter int 1");
    Scanner a=new Scanner(System.in);
    int num1=a.nextInt();
    System.out.println("enter int 2");
    int num2=a.nextInt();
    System.out.println("enter float 1");
    float num3=a.nextFloat() ;
    float num4=num3-num2-num1;
    System.out.println("result"+num4);  
    a.close(); 
    }

    
}
