package package1;

public class Student 
{
	int Smita;
	int age, rollno;
	public void display()
	{
		System.out.println("Welcome to you all");
	}
	public void display1()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) 
	{
		Student abc=new Student();
		abc.display();
		abc.display1();
		abc.age=22;
		abc.rollno=12;
		System.out.println("Age is "+abc.age);
		System.out.println("Roll No is "+abc.rollno);
		
	}
}
