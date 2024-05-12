import java.util.*;
class math{
public math()
{
    System.out.println("welcome");

}
public math(int x)
{
 System.out.println("value"+x);
}
public   math(int x ,int y){
    int z;
    z=x+y;
    //return z;
   System.out.println(""+z);
}
public   math(int x, int y,int z)
{
    int c;
    c=x+y+z;
    //return z;
    
   System.out.println(""+z);
}

}
class output{
    public static void main(String[] args) {
    math a=new math();
    math b=new math(2);
    math c=new math(3,4);
    math d=new math(3,4,5);

}
}