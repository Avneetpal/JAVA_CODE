import java.util.*;
public class trianglecheck {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter side 1");
        int s1=a.nextInt();
        int s2=a.nextInt();
        int s3=a.nextInt();
        if((s1+s2)>s3){
            if((s2+s3)>s1){
                if((s1+s3)>s2){
                    System.out.println("triangle is valid");
                }
            }
        }
        else
        System.out.println("traingle is invalid");
    }
    
}
