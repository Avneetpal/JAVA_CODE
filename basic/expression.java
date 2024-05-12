import java.util.Scanner;
public class expression {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter x");
        int x=a.nextInt();
        System.out.println("enter y");
        int y=a.nextInt();
        System.out.println("enter z");
        int z=a.nextInt();
        double exp1=(x+y+z)/(x-y-z);
        double exp2=(x+y+z)*3;
        double exp3=(x+y)*(x-y)*(y-z);
        System.out.println("expression 1\t"+exp1);
        System.out.println("expression2\t"+exp2);
        System.out.println("expression3\t"+exp3);
        a.close();
    }
    
}
