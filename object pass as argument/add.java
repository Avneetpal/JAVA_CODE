import java.util.*;
class mymath{
    public int x,y,z;
    public mymath sum(mymath ob){
        ob.z=ob.x+ob.y;
        return ob;
    }
}
class myadd{
    public static void main(String[] args) {
        Scanner obb=new Scanner(System.in);
        mymath bb=new mymath();
        System.out.println("enter  no");
        bb.x=obb.nextInt();
        System.out.println("enter no2");
        bb.y=obb.nextInt();
        bb=bb.sum(bb);
        System.out.println("result\t"+bb.z);
               
    }
}