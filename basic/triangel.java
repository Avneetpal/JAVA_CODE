import java.util.Scanner;

public class triangel {
    public static void main(String[] args) {
    System.out.println("enter base");
    Scanner a=new Scanner(System.in);
    int base=a.nextInt();
    System.out.println("enter height");
    int height=a.nextInt();
    int area=base*height/2;
    System.out.println("area\t"+area);
    a.close();

    }
    
}
