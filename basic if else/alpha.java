import java.util.Scanner;
public class alpha {
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter character");
        char cha=a.next().charAt(0);
        if((cha>='a'&&cha<='z')||(cha>='A'&& cha<='Z'))
        System.out.println("is character");
        else
        System.out.println("not character");
    }
    
}
