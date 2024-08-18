 class Student
 {
    final int a=4;
     void fun()
     {
        // a=5;
     }
 } 
 class Teachr extends Student
 {
    void fun()
    {
        System.out.println("Class Teacher");
    }
     
 }
public class Final
 {
     public  static void main(String []args)
     {
         Student r=new Student();
        System.out.println(r.a);
     }
 }