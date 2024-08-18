 abstract class khan
 
 {
     public abstract void move();
     //public abstract void speed();
     
 }
 public class car extends khan
 {
     public void move()
     {
         System.out.println("This is a car");
     }
    
     public static void main(String []args)
     {
         car obj=new car();
        // motercycle obj2=new motercycle();
        // obj2.speed();
         obj.move();
     }
    }