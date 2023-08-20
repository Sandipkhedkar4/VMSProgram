package program_vmss;

public class AddOperation extends Thread {
		
		int a,b;
		private int result;
		
		public AddOperation(int a, int b) {
			
			this.a = a;
			this.b = b;
		}
		public void run()
		{
			result= a+b;
		}
		public int getResult() 
		{
			return result;
		}
		
}
