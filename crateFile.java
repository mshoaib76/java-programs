   import java.io.*;
 public class crateFile 
 {
     public static void main(String []args)
     {
         File a=new File("C:\\users\\Shoaib Baloch\\Desktop\\as.txt");
         try
         {
             if(a.createNewFile())
             {
                 System.out.println("File created successfully");
             }
             else
             {
                 System.out.println("File already exist");
             }
         }
          catch(IOException s)
             {
                 System.out.println("can't create file");
             }
     }
 }