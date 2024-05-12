import java.util.*;
class inp{
     String stre,nstr;
    public void input(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        this.stre=ob.nextLine();

    }
    public void rev(String s){
        int i;
        
        for(i=0;i<=stre.length()-1;i++){
          char  ch= stre.charAt(i);
          nstr=ch+nstr;



        }
        System.out.println(" reversed string \n"+nstr);

    }
}
class reverse{
    public static void main(String[] args) {
        inp s=new inp();
        s.input();
        s.rev(s.stre);
        
    }
}
