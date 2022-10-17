package practise1;

public class day2
{
	public int sum(int a, int b)
	{
		int c;
	c=a+b;
	
		System.out.println("result is "+c);
		return c;
	}
	public int sub(int d, int e)
	{
		int f;
		f=d-e;
		System.out.println("result is"+f);
		return f;
	}
	public int sum1(int g, int h)
	{
		int i;
		i=g+h;
		System.out.println("result is"+i);
		return i;
	}
	public int multi(int j, int k)
	{
		int l;
		l=j*k;
		System.out.println("result is"+l);
		return l;
	}
	public void div(int m, int n)
	{
		int o;
		o=m/n;
		System.out.println("result is"+o);
	}
	public static void main(String[] args)
	{
		System.out.println("\n assingment1 \n result1");
		day2 xyz=new day2();
		int sumresult=xyz.sum(10,2);
		int subresult=xyz.sub(sumresult,2);
		int sum1result=xyz.sum1(subresult,2);
		int multiresult=xyz.multi(sum1result,2);
		xyz.div(multiresult,2);
		
	System.out.println("\nassingment2\n result2");	

		day2  abc=new day2();
		int multiresult1=abc.multi(10,2);
		int subresult2=abc.sub(multiresult1, 2);
		int sumresult3=abc.sum(subresult2,2);
		int subresult4=abc.sub(sumresult3,2);
		abc.div(subresult4,2);
	

	}
	
	

}
