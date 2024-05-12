import java.util.Scanner;
public class swap_without {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("ENTER X");
        int x=a.nextInt();
        System.out.println("enter y");
        int y=a.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x swap"+x);
        System.out.println(("y swap"+y));
        a.close();


    }
    
}
