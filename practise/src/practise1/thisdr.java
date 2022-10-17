package practise1;

public class thisdr
{
	public void print ()
	{
		System.out.println("\n parameterized method based assignment \n");
		this.student3();
	}
	public void student ()
	{
		
		System.out.println("default student");
		this.student1();
	}
	public void student1 ()
	{
		System.out.println("tis is student1 ");
		this.student2();
	}
	public void student2 ()
	{
		System.out.println("tis is student no.2 ");
		this.student4();
	}
	public void student3 ()
	{
		System.out.println("this is student no.3");
		this.student();
	}
	public void student4()
	{
		System.out.println("this is student no.4");
	}
	public static void main(String[] args)
	{
		thisdr vcb=new thisdr();
		vcb.print();
		
	}

}
