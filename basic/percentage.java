import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("ENTER SUBJECT 1");
        double sub1=a.nextDouble();
        System.out.println("ENTER SUBJECT 2");
        double sub2=a.nextDouble();
        System.out.println("ENTER SUBJECT 3");
        double sub3=a.nextDouble();
        System.out.println("ENTER SUBJECT 4");
        double sub4=a.nextDouble();
        System.out.println("ENTER SUBJECT 5");
        double sub5=a.nextDouble();
        double sum=sub1+sub2+sub3+sub4+sub5;
        double r=(sum/500)*100;
        System.out.println("result\t"+r);
        a.close();
    

    }
    
}
