 public class MyClasssssss
 {
      void display()
     {
          
         
     }
     public static void main(String []args)
     {
         Human obj=new Human();
         obj.display();
         
     }
 }
 class Boy extends MyClass
 {
     Boy(String name,int age)
     {
         name="Shoaib Baloch";
         age=18;
         
     }
     void play()
     {
         System.out.prinltn(name);
         System.out.prinltln(age);
         
     }
 }
 class Girl extends MyClass
 {
     Girl(String name ,int age )
     {
         
     }
     void cook()
     {
         
     }
 }
 class Human extends Boy
 {
     String name;
     int age;
     void move()
     {
         
     }
     void eat()
     {
         
     }
 }