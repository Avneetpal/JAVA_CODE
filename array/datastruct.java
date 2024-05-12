import java.util.*;
class stack
{
    private int top;
    public int[] stck= new int[5];
    public stack()
    {
        top=-1;

    }
    public void Menu()
    {
        System.out.println("=====================");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. show All");
        System.out.println("4. Selection  Sort ");
        System.out.println("5. Exit");
        System.out.println("=====================");
    }
    public void push()
    {
        if(this.top>=5)
            System.out.println("Stack Is Full ");
        else
        {
            this.top++;
            Scanner ob= new Scanner(System.in);
            System.out.println("Ente a Value ");
            this.stck[this.top]=ob.nextInt();
        }
    }   
        public int pop() {
            if (top == -1)
            {
            System.out.println("empty ");
            return (0);
            }
         return (stck[top--]);
 }
    public void selection_sort()
    {
      int m=stck.length;
      int i,j;
      int temp=0;
      for(i=0;i<m-1;i++)
      {
        int index=i;
        for(j=i+1;j<m;j++)
        {
            if(stck[j]<stck[index])
            {
                index=j;
            }

        }
        temp=stck[index];
        stck[index]=stck[i];
        stck[i]=temp;

      }
      for(i=0;i<stck.length;i++)
      System.out.println(""+stck[i]);
      



    }
    public void show()
    {
        int i;
        if(top<=-1)
        System.out.println("Stack Is Empty");
        else
        {
            for(i=0;i<this.top;i++)
                System.out.println("" + this.stck[i]);
        }
    }
}
class datastruct
{
    public static void main(String args[])
    {
        stack ob= new stack();
        Scanner obj= new Scanner(System.in);
        int choice;
        while(true)
        {
            ob.Menu();
            System.out.println("Enter a Choice ");
            choice= obj.nextInt();
            switch(choice)
                {
                case 1:
                    ob.push();
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.show();
                    break;
                case 4:
                    ob.selection_sort();
                    break;
                case 5:
                    System.exit(0);
            }       
        }
    }
}



