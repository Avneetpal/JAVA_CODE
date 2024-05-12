import java.util.*;
class area {
    
    public area(int x, int y){
       
        int z=x*y;
        System.out.println("area of rectangle\t"+z);
    }
    public area(int x)
    {
        double z;
        z=3.14*x*x;
        System.out.println("area of circle\t"+z);
    }
    public area(int x, double  s){
        double z;
        z=(x*s)/2;
        System.out.println("area of triangle\t"+z);
    }


    
}
class out{
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        int x=b.nextInt();
        int y=b.nextInt();
        double z=b.nextDouble();

        area a=new area(x);
        area d=new area(x,y);
        area c=new area(x,z);

    }
}

