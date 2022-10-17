package practise1;

public class octuber 
{
	public void sharib()
	{
	
		System.out.println("\nconstructor assingment\n" );
		}
	public octuber ()
	{this(45,34,23);
		
		System.out.println("default condtructor");
		
	}
	public octuber (int a)
	{
		System.out.println("one parameterized constructor");
		}
	public octuber (int a, int b)
	{
		System.out.println("two parametrized constructor");
	
	}
	public octuber (int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		
		
		octuber abc=new octuber(34,87,76);
		octuber abc1=new octuber();
		octuber abc2=new octuber(56,87);
		octuber abc5=new octuber(87);
	     abc.sharib();
		
	}

}



