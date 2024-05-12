import java.util.*;
public class factor {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no");  
        int num=a.nextInt();
        int i=1;
        while(i<=num){
            if(num%i==0){
                System.out.println(" factor\t"+i);
            }
            ++i;
        }
      }
    
}
