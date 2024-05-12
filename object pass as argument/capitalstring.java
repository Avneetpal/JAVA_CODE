import java.util.*;
class cap{

    public String str;
    public cap strin(cap ob)
    {
        String y=ob.str;
        System.out.println(""+y.toUpperCase());
        return ob;
    }

}
class s{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter string");
        cap c=new cap();
        c.str=a.nextLine();
        c=c.strin(c);
        //System.out.println();
    }
}