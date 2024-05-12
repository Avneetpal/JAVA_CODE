import java.util.Scanner;
class max{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter num 1");
        int num1=a.nextInt();
        System.out.println("enter no. 2");
        int num2=a.nextInt();
        if(num1>num2)
        System.out.println("no 1 is greater");
        else
        System.out.println("no2 is greater");
        a.close();        
    }
}