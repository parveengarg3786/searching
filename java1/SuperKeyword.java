class Student
{
String name;
int rollno;

Student(String name , int rollno)
	{
		this.name=name;
		this.rollno=rollno;	
	}

void display()
	{
	System.out.print("name of student :" + name + "\nrollo : " + rollno );
	}

}
class College extends Student
{
	College(String name , int rollno)
	{
		super(name,rollno);
	}
	void display()
		{
			System.out.println("use of super keyword");
			super.display();
		}
}

class Main
{
	public static void main(String arg[])
		{
			College cg = new College("neeraj",111);
			cg.display();

		}

}