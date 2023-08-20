package program_vmss;

public class ArithmaticOperations {
	public static void main(String[] args) {
		
		if(args.length>2)
		{
			System.err.println("please enter two Integer input only.");
			return;
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if (a<=0 || b<=0) 
		{
			System.err.println("Please enter valid positive integer only");
			return;
		}
		
		AddOperation addOperation = new AddOperation(a, b);
		SubstractionOperation substractionOperation = new SubstractionOperation(a, b);
		MultiplicationOperation multiplicationOperation = new MultiplicationOperation(a, b);
		DivisionOperation divisionOperation = new DivisionOperation(a, b);
		
		Thread addThread     = new Thread(addOperation);
		Thread subThread     = new Thread(substractionOperation);
		Thread multiThreaad  = new Thread(multiplicationOperation);
		Thread divThread     = new Thread(divisionOperation);
		
		addThread.start();
		subThread.start();
		multiThreaad.start();
		divThread.start();
		
		System.out.println("Addition of two input Integers is: " + addOperation.getResult() );
		System.out.println("substraction of two input Integers is: " + substractionOperation.getResult() );
		System.out.println("Multiplication of two input Integers is: " + multiplicationOperation.getResult() );
		System.out.println("Division of two input Integers is: " + divisionOperation.getResult()   );
		
	}
}
