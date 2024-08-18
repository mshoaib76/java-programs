  class Abstract 
    abstract class khan
    {
        public abstract void eating();
        
    }
    public class majid extends khan
    {
        public void eating()
        {
            System.out.println("both are enjoying hikala hikala");
        }
    }
}
public class Khan
{
    public static void main(String[] args) {
        majid s=new majid();
        s.eating();
    }
}

