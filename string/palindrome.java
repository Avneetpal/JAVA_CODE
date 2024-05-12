 import java.util.*;
 class  string {
    public String str;
    public void getstring(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        this.str=ob.nextLine();


    }

    public void palindro(String st)
    {
        int i,j;
        for(i=0,j=st.length()-1;i<=j&&str.charAt(i)==str.charAt(j);i++,j--);
            if(j<=i)
            System.out.println("palindrome");
            else
            System.out.println("not palindrome");

        
    }
}
    class palindrome{
        public static void main(String[] args) {
            string obb=new string();
            obb.getstring();
            obb.palindro(obb.str);
        }
    }


    

