import java.util.Scanner;
class divisible {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no");
        int num1=a.nextInt();
        if(num1%5==0&&num1%11==0)
        System.out.println("num is divisble by 5 and 11");
        else
        System.out.println("no is not divisible by 5 and 11");


    }
    
}
