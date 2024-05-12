import java.util.Scanner;
public class negative {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println(" enter no");
        int num1=a.nextInt();
        if(num1<0){
            System.out.println("no is negative");
        }
        else if(num1==0){
            System.out.println("no is zero");
        }
        else{
            System.out.println("no is positive");
        }
    }
    
}
