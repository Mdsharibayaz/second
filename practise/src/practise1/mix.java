package practise1;

public class mix
{
	int a;
	int b;
	int c;
	public void result ()
	{
		
		System.out.println("finel result");
		this.student(65,89);
		}
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("\nresult is\n"+c);
		return c;
	}
	public void student (int a, int b)
	{
		System.out.println("printed mix result here");
		
	}
	public static void main(String[] args) 
	{
		mix obj=new mix();
		obj.result();
		int sumresult = obj.sum(23,43);
		
		
	}

}
