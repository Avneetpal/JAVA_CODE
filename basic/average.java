import java.util.Scanner;
public class average {
    
    public static void main(String args[]){
    Scanner a=new Scanner(System.in);
    System.out.println("enter no 1");
    int num1=a.nextInt();
    System.out.println("enter no 2");
    int num2=a.nextInt();
    int sum=num1+num2;
    int avg=sum/2;
    System.out.println("sum\t"+sum);
    System.out.println("average\t"+avg);
    a.close();




    }
}
