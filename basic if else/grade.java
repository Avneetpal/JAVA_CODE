import java.util.Scanner;
class grade {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter physics marks");
        double phy=a.nextDouble();
        System.out.println("enter chem marks");
        double chem=a.nextDouble();
        System.out.println("enter bio marks");
        double bio=a.nextDouble();
        System.out.println("enter math marks");
        double math=a.nextDouble();
        System.out.println("enter computer marks");
        double comp=a.nextDouble();
        double sum=phy+chem+bio+math+comp;
        double percentage=(sum/500)*100;
        System.out.println("percentage \t"+percentage);
        if(percentage>=90){
            System.out.println("GRADE A");
        }
        else if(percentage>=80){
            System.out.println("GRADE B");

        }
        else if(percentage>=70){
            System.out.println("GRADE C");
        }
        else if(percentage>=60){
            System.out.println("GRADE D");
        }
        else if(percentage>=40){
            System.out.println("GRADE E");
        }
        else{
            System.out.println("FAIL");
        }
        a.close();



    }
    
    
}
