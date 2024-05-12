import java.util.*;
public class upper  {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter ");
        char alp=a.next().charAt(0);
        if(alp>='a'&&alp<='z')
        {
            System.out.println("lowe case");}
        
        else if(alp>='A'&& alp<='Z'){
        
            System.out.println("upper cae");
        }
        a.close();
        
    }
    
}
    

