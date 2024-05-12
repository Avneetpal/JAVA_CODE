import java.util.Scanner;
public class simple_interest {
    public static void main(String args[]){
    System.out.println("enter principal amount");
    Scanner a=new Scanner(System.in);
    int p=a.nextInt();
    System.out.println("enter rate of interest");
    int r=a.nextInt();
    System.out.println("enter time in year");
    int t=a.nextInt();
    int i=(p*r*t)/100;
    System.out.println("interst"+i);
    a.close();





    }    
}
