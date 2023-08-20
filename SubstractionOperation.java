package program_vmss;

public class SubstractionOperation extends Thread {
	
	int a,b;
	private int result;
	
	public SubstractionOperation(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	
	public void run()
	{
		result= a-b;
		
	}
	public int getResult()
	{
		return result;
	}
}
