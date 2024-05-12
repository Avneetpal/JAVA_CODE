import java.util.*;
class gets{
    public String str;
    public void input(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        this.str=ob.nextLine();
        System.out.println(""+str.toLowerCase());




    }
    
}
class small{
    public static void main(String[] args) {
        gets a=new gets();
        a.input();
    }
}