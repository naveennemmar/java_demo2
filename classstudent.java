class student
{
 int roll no;
 String name;
 int sem;
 int totalmarks;
 student()
{
 rollno=0;
 name='\0';
 sem=0;
 totalmarks=0;
}
 student(int r,String n,int s,int t)
 {
  rolllno=r;
  name=n;
  sem=s;
  totalmarks=t;
  }
   void display()
  {
   System.out.println("rollno is"+rollno)
   System.out.println("name is"+name)
   System.out.println("sem is"+sem)
   System.out.println("totalmark is"+totalmarks)
  }
}
class prgmtestconstruct
{
 public static void main(String args[])
  {
   students1=new student();
   students2=new student();
   s1 display();
   s2 display();
  }
}