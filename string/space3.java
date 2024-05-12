import java.util.*;
class spce2{
     String stre;
    public void input(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        this.stre=ob.nextLine();

    }
    public void space( String s){
          int i=1;
        int count=0;
     
        for(i=1;i<=stre.length()-1;i++){
            char ch=stre.charAt(i);
            if(ch==' '){

                ++count; }
                


    }
    System.out.println(""+count);
}
}
 public class space3{
    public static void main(String args[]) {
        
        spce2 obb=new spce2();
        obb.input();
        obb.space(obb.stre);
    }


}