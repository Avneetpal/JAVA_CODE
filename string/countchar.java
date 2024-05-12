import java.util.*;
class input{
    public String str;
    public char s;
    public void String(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        this.str=ob.nextLine();
        System.out.println("enter char to be searched");
       s=ob.next().charAt(0);
    }

    public void func(String st, char a){
        int i=1;
        int count=0;
        for(i=0;i<=st.length()-1;i++){
            char c=st.charAt(i);
            if(a==c){
                count++;
            }
        }
        System.out.println(""+count);

    }
}
class Main{
    public static void main(String[] args) {
        input obb=new input();
        obb.String();
        obb.func(obb.str, obb.s);

    }
}

