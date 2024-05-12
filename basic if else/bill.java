import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter unit");
        int un=a.nextInt();
        if(un<=50){
            double first=un*0.5;
            double bill=first+(first*20)/100;
            System.out.println("bill    "+bill);
            
        }
        else if(un<=150){
            double first=(50*0.50)+((un-50)*0.75);
            double bill=first+(first*20)/100;
             System.out.println("bill   "+bill);

        }
        else if(un<=250){
            double first=(50*0.50)+(100*0.75)+(un-150)*1.20;
            double bill=first+(first*20)/100;
             System.out.println("bill    "+bill);
        }
        else if(un>250){
            double first=(50*0.50)+(100*0.75)+(100*1.20)+(un-250)*1.50;
             double bill=first+(first*20)/100;
             System.out.println("bill     "+bill);

        }
        a.close();
    }
    
}
