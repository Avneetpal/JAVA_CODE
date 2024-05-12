import java.util.*;
class myprime{
    public int num;
    public boolean c=false;
    public myprime pr(myprime ob){
        int x=2;
        
        while(x<ob.num){
            if(ob.num%x==0){
                c=true;
                break;
            }
            ++x;

        }
        if(c=true)
        System.out.println("not prime");
        else
        System.out.println("prime"); 

        return ob;
        }
    }
class p{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        myprime ob=new myprime();
        ob.num=a.nextInt();
        ob=ob.pr(ob);
        //System.out.println(""+ob);



    }
}
