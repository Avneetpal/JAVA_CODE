import java.util.*;
public class salary {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter salary");
        int sal=a.nextInt();
        if(sal<=10000){
            double salar=sal+sal*0.2+sal*0.8;
            System.out.println("gross"+salar);
        }
        else if(sal<=2000){
            double salar=sal+sal*0.25+sal*0.9;
              System.out.println("gross"+salar);
        }
        else if(sal>=2000){
            double salar =sal+sal*0.3+sal*0.95;
              System.out.println("gross"+salar);
        }

    }
    
}
