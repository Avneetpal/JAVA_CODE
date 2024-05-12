import java.util.*;

class myArray
{
        public int[]  num= new int[100];
        private int n;
        public myArray(int x)
        {
            n=x;
        } 

        public void getNumber()
        {
            Scanner ob=new Scanner(System.in);
            for(int i=0;i< this.n;i++)
            {
                System.out.println("Enter a Values :");
                this.num[i]= ob.nextInt();
            }
            ob.close();
        }

        public void show()
        {
            for(int i=0;i<this.n;i++)
            System.out.println("" + this.num[i]);
        }
}

class example
{
    public static void main(String arg[])
    {
        Scanner obb=new Scanner(System.in);
        int nu=obb.nextInt();
        myArray a=new myArray(nu);
        a.getNumber();
        a.show();
        obb.close();
    }
}