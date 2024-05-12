import java.util.*;
class profit{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter buying price");
        double cp=a.nextDouble();
        System.out.println("enter selling price");
        double sp=a.nextDouble();
        if(cp<sp){
            System.out.println("profit");
        }
        else if(cp>sp){
            System.out.println("loss");
        }
        else{
            System.out.println("neutral");
        }
        
    }






}