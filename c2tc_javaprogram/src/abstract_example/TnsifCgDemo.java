package abstract_example;

public class TnsifCgDemo {

	public static void main(String[] args) 
	{
		Trainer t=new Techtrainer();
		
		t.session();
		t.checks();
		
		t=new SoftSkillTrainer();
		
		t.session();
		t.checks();
	}
}
