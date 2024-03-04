/*6. Write a Java program to create a class called "Employee" with a name, job title,
and salary attributes, and methods to calculate and update salary.*/
package Java;

public class Employee {
	  String name;
	  String jobTitle;
	  double salary;
	  Employee(String n,String jt,double s)
	  {
		      name = n;
		      jobTitle = jt;
		      salary = s;
	  }
	  public String getName()
	  {
		  return name; 
	  }
	  public void  setName(String nam)
	  {
		    name = nam; 
	  }
	  public String getjobTitle()
	  {
		  return jobTitle; 
	  }
	  public void  setjobTitle(String jt)
	  {
		    jobTitle = jt; 
	  }
	  public double getsalary()
	  {
		  return salary; 
	  }
	  public void  setsalary(double s)
	  {
		    salary = s; 
	  }
	  public void update_salary(double per)
	  {
		   salary = salary + ((salary * per)/100); 
	  }
	  public void display_details()
	  {
		   System.out.println("Name : "+name);
		   System.out.println("Job Title : "+jobTitle);
		   System.out.println("Salary : "+salary);		   
	  }	  
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Bhushan","Devops Engg",56000);
		Employee e2 = new Employee("Pavan","Software Engg",66000);
		System.out.println("\n\nEmployee Details:\n\n");
		e1.display_details();
		System.out.println("-------------------------------------------------------------");
		e2.display_details();
		e1.update_salary(8);
		e2.update_salary(9);
		System.out.println("\nEmployee Details After Salary Updation:\n");
		System.out.println(e1.name+" Salary update by 8% is follows: \n");
		e1.display_details();
		System.out.println(e2.name+" Salary update by 9% is follows: \n");
		e2.display_details();		
	}

}


  
