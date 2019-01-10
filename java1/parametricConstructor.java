class Student
{
String name;
int rollno;

Student(String n , int r)
	{
		name=n;
		rollno=r;	
	}

void display()
	{
	System.out.print("name of student :" + name + "\nrollo : " + rollno );
	}

}
class College
{
	public static void main(String arg[])
		{
			Student sd= new Student("parveen",111);
			sd.display();

		}
}