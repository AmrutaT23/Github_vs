// Write a java program to create a class known as person with methods called getFirstname() and getLastName(). ctrate a subclass called employee that adds a new method named  getEmployeeId() and overrides the getLastName() method to include the employee  job title.

class Person
{
	void getFirstname(String fname)
	{
		System.out.println("First Name is : "+fname);
	}
	void getLastName(String lname)
	{
		System.out.println("Last Name is : "+lname);
	}
}
class Employee extends Person
{
	void getEmployeeId(int id)
	{
		System.out.println("Employee ID  is : "+id);
	}
	void getLastName(String tit)
	{
		System.out.println("Employee Job Title is : "+tit);
	}
public static void main(String args[])
{
	Employee e =new Employee();
	Person p = new Person();
	e.getFirstname("John");
	p.getLastName("Smith");
	//e.getLastName("Smith");
	e.getEmployeeId(100);
	e.getLastName("Developer");

}
}

	