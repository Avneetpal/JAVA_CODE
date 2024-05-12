import java.util.*;
class getinput{
    String s;
    public void strget(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        this.s=ob.nextLine();

    }
    public void title(String st){
        int i;
        for(i=0;i<=s.length()-1;i++){
            char c=s.charAt(i);
            if(i==' '){
            c=st.toUpperCase(i);
            }
    }

    }
}
class ttle{
    public static void main(String[] args) {
        getinput a=new getinput();
        a.strget();
        a.title(a.s);
    }
}