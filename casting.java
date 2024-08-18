 class teacher
 {
     void run()
     {
      System.out.println("Teacher take care of shagrid");   
     }
 }
 class shagrid extends teacher
{
    void run()
    {
        System.out.println("Teacher is nice");
    }
}
class Baloch extends teacher
{
    void run()
    {
        System.out.println("Teacher is beautiful.....");
    }
    void sleep()
    {
        System.out.println("shagird is lofar....");
    }
}
public class casting
{
    public static void main(String []args)
    {
        //Upcasting
     teacher r=new shagrid();
     teacher r2=new Baloch();
     r.run();
     r2.run();
}
}