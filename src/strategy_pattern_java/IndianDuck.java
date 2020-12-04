package strategy_pattern_java;

public class IndianDuck extends Duck {
	
	public IndianDuck() {
		// TODO Auto-generated constructor stub
		fB = new FlyWithWings();
		qB = new Squeak();
		
	}
}
