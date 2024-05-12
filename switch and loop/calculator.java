import java.util.*;
class calculator{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num1,num2,oper;
        double ans;
        System.out.println("enter no1");
        num1=a.nextInt();
        System.out.println("enter no2");
        num2=a.nextInt();
        System.out.println("enter operation\n1=add\n2=substract\n3=multiply\n4=divide\n5=modlus");
        oper=a.nextInt();
        switch(oper){
        case(1):
         ans=num1+num2;
        System.out.println("addition\t"+ans);
        break;
        case(2):
        ans=num1-num2;
        System.out.println("substract\t"+ans);
        break;
        case(3):
        ans=num1*num2;
        System.out.println("multiply\t"+ans);
        break;
        case(4):
        ans=num1/num2;
        System.out.println("divide\t"+ans);
        break;
        case(5):
        ans=num1%num2;
        System.out.println("modulus\t"+ans);
        break;
        default:
        System.out.println("incorrect\t");

        }

    
}

}