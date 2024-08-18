 public class Student3
 {
     int id;
     String name;
     double cgpa;
     Student3()
     {
         name ="";
         id =0;
         cgpa=0.0;
     }
     public Student3(String stname, int stid, double stcgpa)
     {
         this.name=stname;
         this.id=stid;
         this.cgpa=stcgpa;
         
     }
     void display()
     {
         System.out.println("\nName :"+name);
         System.out.println("Id :"+id);
         System.out.println("CGPA :"+cgpa);
         
     }
     public static void main(String []args)
     {
         int id;
         String name;
         double cgpa;
         Student3 S1=new Student3();
         S1.name="Afeera ";
         S1.id =20;
         S1.cgpa=3.41;
         Student3 S2=new Student3();
         S2.name="Effa";
         S2.id=45;
         S2.cgpa=3.7;
         Student3 S3=new Student3(name= "Arooj", id=24 ,cgpa=3.3);
         Student3 S4=new Student3(name="Abdul bari Effa",id=18 , cgpa=3.4);
         S1.display();
         S2.display();
         S3.display();
         S4.display();
         
     }
 }