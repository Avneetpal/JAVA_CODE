import java.util.*;
public class factorial 
{public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("enter no");
    int num=a.nextInt();
    long fact=1;
    int i=1;
    while(i<=num){
        fact=fact*i;
        ++i;
    }
    System.out.println("factorial\t"+fact);
}
    
}
