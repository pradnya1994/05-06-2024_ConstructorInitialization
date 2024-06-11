package Assignment;

public class Employee 
{
	private int empId;
	private String empName;
	private String empRole;
	private String empDepartment;
	private double empSalary;

	public Employee() 
	{

		empId = 101;
		empName = "Pradnya";
		empRole = "Developer";
		empDepartment = "Development";
		empSalary = 1250000;
	}

	public void getEmployee()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empRole);
		System.out.println(empDepartment);
		System.out.println(empSalary);
	}
}
