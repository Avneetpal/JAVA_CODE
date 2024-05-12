import java.util.*;
class mypower{
    public int b,e;
    double r=1;
   
    public mypower power(mypower ob){
    
        while(e!=0){
           r*=ob.b;
            --ob.e;

        }
        return ob ;
    }

}
class result{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        mypower ab=new mypower();
        System.out.println("enter no ");
        ab.b=a.nextInt();
        System.out.println("enter exponent");
        ab.e=a.nextInt();
        ab=ab.power(ab);
        System.out.println("result"+ab.r);
    }
}