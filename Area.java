public class Area<T>
{
    private T t;
    public void add (T t)
    {
        this.t=t;
        
    }
    public T get()
    {
        return t;
    }
    public void getArea()
    {
        
    }
    
    public static void main(String []args)
    {
        
        Integer i= 10;
        
        Area<Integer> circle = new Area<Integer>();
        
        Area<Double> rectangle = new Area<Double>();
        
        circle.add(10);
        
        rectangle.add(2.5);
        
        System.out.println(circle.get());
        
        System.out.println(rectangle.get());
        
        Area<String> circlelestring = new Area<String>();
        
        circlelestring.add("Program Finished!!!!");
        
        System.out.println(circlelestring.get());
        
    }
    
}