import java.util.*;
class myprime{
     double x;
    public void prime( myprime ob){
        int y=2;
        boolean c=false;
        while(y<ob.x){
            if(ob.x%y==0){
           c=true;
        break;
    }
    ++x;
    
            
        
          
        }
        if(c=true)
         System.out.println(" not prime");
        else
        System.out.println("prime");
         return ob;
       
       


    }
        

    }
    class p{
        public static void main(String[] args) {   
        Scanner a=new Scanner(System.in);
        myprime ab=new myprime();
        System.out.println("enter no");
        ab.x=a.nextDouble();
       //ab=ab.prime(ab);


        
    
        }
        }
    
