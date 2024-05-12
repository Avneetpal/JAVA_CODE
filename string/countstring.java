import java.util.*;
class input{
    public String str;
    public String s;
    public void String(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        this.str=ob.nextLine();
        System.out.println("enter char to be searched");
       this.s=ob.nextLine();
    }

    public void func(String st, String a){
        int i,j;
        int count=0;
        for(i=0;i<=st.length()-1;i++){
            for(j=0;j<=a.length();j++){
            String f=st;
            String g=a;
            if(f==g){
                count++;
            }
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

