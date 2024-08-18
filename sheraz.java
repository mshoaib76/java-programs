interface ahmad
{
    void move();
    
}
interface hamid
{
     void run();
}
public class sheraz implements ahmad,hamid
{
    public void move()
    {
        System.out.println("This is a car");
    }
    public void run()
    {
        System.out.println("this is a bike");
    }
    public static void main(String []args)
    {
        sheraz obj=new sheraz();
        obj.move();
        obj.run();
        
    }
}
