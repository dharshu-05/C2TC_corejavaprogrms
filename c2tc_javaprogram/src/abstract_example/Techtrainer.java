package abstract_example;

public class Techtrainer extends Trainer {
	@Override
	public void session()
	{
		System.out.println("Java session is going on");
	}
	@Override
	public void checks()
	{
		System.out.println("Assignments given from Inheritance");
	}

}
