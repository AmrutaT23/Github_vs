//Write a java program to create a class called employee with methods called work() and getsalary().create a subclass called HRmanager that overrides the work() method and adds a new method called addEmployee().

 class Employee
{
	String Name;
	int salary;
	void work(String name)
	{
		Name =name;
		System.out.println(Name+" is in MNC company.");
	}
	void getsalary(int sal)
	{
		salary=sal;
		System.out.println("Salary is : "+salary);
	}
}
class I_HRmanager extends Employee
{
	void work()
	{
		System.out.println("Is also manager in this company .");
	}
	void addEmployee()
	{
		System.out.println("New employee is hired" );
	}
public static void main(String args[])
{
	
	Employee e =new Employee();
	e.work("Rakesh");
	I_HRmanager h =new I_HRmanager();
	h.work();
	h.getsalary(25000);
	h.addEmployee();
	
}
}
	
		
			
	
