import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter year");
        int y=a.nextInt();
        if(y%4==0){
            System.out.println("leap year");
            if(y%100==0){
                if(y%400==0){
                         System.out.println("year is leap");
                }
            }
        }
    
        else{
        System.out.println("non leap year");
        }

    }
    }



