 interface vehical
{
    String name="TVS";
    int num=123;
    void start();
    void stop();
}
public  class Customer implements vehical
{
    @Override
    public void start()
    {
        System.out.println("Company is running");
        
    }
    @Override
    public void stop()
    {
        System.out.println("Company is stop");
    }
       public static void main(String []args)
       {
           Customer c=new Customer();
           c.start();
           c.stop();
           
       }
}