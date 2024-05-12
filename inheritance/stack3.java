import java.util.*;
class one 
{   
    public int[] stck = new int[5];
    public void menu()
    {
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3. show");
        System.out.println("4.exit");
    }
}
class fun extends one
{   public int top;
    public void  push()
    {
         this.top=-1;
        if(this.top==-1)
        {    top++;
            Scanner ob=new Scanner(System.in);
            System.out.println("enter value");
            this.stck[this.top]=ob.nextInt();
           
        }
        else
        {
            System.out.println("stack is full");
        }
      


    }
    public int pop()
    {

        if(this.top==-1)
        {
            System.out.println("empty");
            return 0;
        }
        return(stck[top--]);
    }
    public void exit()
    {
       System.exit(0); 
    }
}
class show extends fun
{
    public void sho()
    {
        int i;
        if(this.top<=-1)
        {
            System.out.println("empty");
        }
        else
        {
            for(i=0;i<this.top;i++)
            {
                System.out.println(""+this.stck[i]);
            }
        }
    }
}
class choice extends show
{
    public void choic()

    {  
           menu();
        Scanner ab=new Scanner(System.in);
        System.out.println("enter choice");
        int ch=ab.nextInt();
        
        switch(ch)
        {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                sho();
                break;
            case 4:
                exit();
                break;
            default:
            System.out.println("wrong choice");
        }
    }
}

class outpu
{
    public static void main(String[] args) {
        choice c=new choice();
        while(true)
        c.choic();
    }

}

