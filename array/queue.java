import java.util.*;
class queue
{
    private int rear,front, count;
    public int[] q= new int[5];
    public queue()
    {
        this.rear=-1;
        this.front=-1;
        count=0;
    }   
    public void Menu()
    {
        System.out.println("1. Push ");
        System.out.println("2. Pop ");
        System.out.println("3. show ");
        System.out.println("4. sort ");
        System.out.println("5. reverse ");
        System.out.println("6. Exit ");
        System.out.println("========================");
    }

    public void push()
    {
        int num;
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter a Numberr ");
        num=ob.nextInt();
        if(count>=4)
            System.out.println("Que is Full No new Allow in Queue");
        else if(rear==-1)
        {
            count++;
            rear=front=0;
            this.q[rear]=num;
        }
        else
        {
            rear++;
            count++;
            this.q[rear]=num;
        }
    }
    public int pop()
    {
        if(rear==front)
        {
            System.out.println("empty");
            return(0);
        }
        return(q[front++]);
    }
    public void bubble_sort()
    {
        int n=q.length;
        int i,j;
        int temp=0;
        for(i=0;i<n;i++)
        {
            for(j=1;j<(n-i);j++)
            {
                if(this.q[j-1]>this.q[j])
                {
                    temp=q[j-1];
                    q[j-1]=q[j];
                    q[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(""+q[i]);
        }

    }
    public void rev()
    {
        int i,r;
        for(i=q.length;i>0;i--)
        {
             System.out.println(""+q[i]);
        }
        
            
        
       
    }
    public void show()
    {

    
    {
        if(count==0)
            System.out.println("Que is Empty");
        else
        {
            for(int i=front;i<=rear;i++)
                System.out.println(""+ this.q[i]);
        }

    }
}

}
class ds
{
    public static void main(String arg[])
    {
        int choice;
        queue ob= new queue();
        while(true)
        {
                ob.Menu();
                Scanner obj= new Scanner(System.in);
                System.out.println("Enter a Choice :");
                choice=obj.nextInt();

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
                        ob.bubble_sort();
                        break;
                    case 5:
                        continue;
                    case 6:
                        System.exit(0);
                }
            }
    }
}
