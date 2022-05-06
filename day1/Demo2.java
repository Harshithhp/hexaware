import java.util.Scanner;
class A
{
        A()
        {
           	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter ID");
		int id=sc.nextInt();

		System.out.println("Enter Name");
		String name= sc.next();

 
		System.out.println("Enter Age");
		int age= sc.nextInt();

 
		System.out.println("Enter Salary");
		float salary= sc.nextFloat();


		System.out.println("Enter Designation");
		String designation= sc.next();

 
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+designation);
        }

}

class Demo2
{
        public static void main(String args[])
        {

              A a=new A();
              
        }
}