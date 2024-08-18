class  Human
{
    protected String name;
    protected int age;
     void move()
     {
      System.out.println("Human is Moving..");   
     }
     void eat()
    {
        System.out.println("Human is eating..");
    }
} 
class Boy extends Human
{
    Boy(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void play()
    {
        System.out.println(name);
        System.out.println(age);
    }
    
}
class Girl extends Human
{
    Girl(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void cook()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Myclass6
{
     void display()
    {
        Boy obj1=new Boy("Shoaib",18);
        obj1.play();
        Girl obj2=new Girl("Khan saab",18);
        obj2.cook();
    }
    public static void main(String []args)
     {
         Myclass obj3=new Myclass();
         obj3.display();
        
      }

}