package program_vmss;

public class DivisionOperation extends Thread {
	
	int a,b;
	private int result;
	
	public DivisionOperation(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	public void run()
	{
		if(b==0)
		{
			result= b/a;
		}
		else
		{
			result=a/b;
		}
	}
	public int getResult()
	{
		return result;
	}
}
