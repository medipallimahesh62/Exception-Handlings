package example1;

public abstract class Employee 
{
	abstract void setSalary(int salary);
	abstract int getSalary();
	abstract void setGrade(String grade);
	abstract String getGrade();
	void label()
	{
		System.out.println("emp");
	}

}
class Engineer extends Employee
{
	private int salary;
	private String grade;
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	public int getSalary()
	{
		return this.salary;
	}
	public String getGrade()
	{
		return this.grade;
	}
}
abstract class Manager extends Employee
{
	private int salary;
	private String grade;
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	int setSalary()
		{
			return this.salary;
		}
	 String setGrade()
	 {
		return this.grade;
	 }
}
