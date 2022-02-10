package demopack1;

public class Stuudent 
{
	private String sName;
	private double cgpa;
	public Stuudent(String sName,double cgpa)
	{
		this.sName=sName;
		this.cgpa=cgpa;
	}
	public String toString()
	{
		return this.sName;
	}
	public boolean equals(Object o)
	{
		 Stuudent student=(Stuudent)o;
		 return this.cgpa==student.cgpa;
		 
	}

}
