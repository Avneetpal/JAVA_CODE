import java.util.*;
class get{
    public String str;
    public void input(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        this.str=ob.nextLine();
        System.out.println(""+str.toUpperCase());




    }
    
}
class cap{
    public static void main(String[] args) {
        get a=new get();
        a.input();
    }
}