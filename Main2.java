 class shampo
 
 {
     void  majid()
     {
         System.out.println("majid is fined today");
     }
 }
 class saban extends shampo
 {
     void majid()
     {
         System.out.println("Majid using vital");
     }
 }
 class careem extends shampo
 {
     void majid()
     {
         System.out.println("majid using careem sundar");
     }
     void sanwal()
     {
         System.out.println("Sanwal is using carecareem");
     }
 }
  public class Main2
 {
 public static void main(String[]args)
 {
     //Downcasting
     careem r=(careem)new shampo();
     r.sanwal();
     //((careem)r).sanwal();
 }
}