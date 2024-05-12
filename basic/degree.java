import java.util.Scanner;
public class degree {
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("enter celcius");
    float c=a.nextFloat();
    float f=(c*9/5)+32;
    System.out.println("dgree to ferenite"+f);
    a.close();
}
    
}
