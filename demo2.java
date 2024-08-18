 class teacher
 {
     int a;
     final void demo()
     {
         System.out.println("Demo");
         System.out.println("Demo is working.....");
     }
 }
 class student extends teacher
 {
    void demo()
     {
         System.out.println("Demo is not working.....");
     }
    }
 public class demo2
 {
     public static void main(String[] args)
     {
         student s=new student();
         s.demo();
         
     }
 }