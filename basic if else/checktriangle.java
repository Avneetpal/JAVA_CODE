import java.util.*;
public class checktriangle {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter side1");
        int s1=a.nextInt();
        System.out.println("enter side 2");
        int s2=a.nextInt();
        System.out.println("enter side 3");
        int s3=a.nextInt();
        if(s1==s2&& s2==s3){
            System.out.println(" equilateral triangle");
        }
        else if(s1==s2||s1==s3||s2==s3){
        System.out.println("isosceles trinagle");}
        else
        System.out.println("scalen traingle");


    }
    
}
