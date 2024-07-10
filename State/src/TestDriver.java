
public class TestDriver {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine.toString());
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		//You inserted a quarter    (HAS_QUARTER)
		//You turned... 			(SOLD)
		//A gumball comes rolling out the slot   (count = 4, NO_QUARTER)
		System.out.println(gumballMachine.toString());		
	}

}
