package strategy_pattern_1;

public abstract class Duck {
	FlyBehaviour fB;
	QuackBehaviour qB;
	
	public void swim() {
	  System.out.println("I'm swimming.");
	}
	
	public void fly() {
		// TODO Auto-generated method stub
		fB.Fly();
	}
	
	public void quack() {
		qB.quack();
	}
	
}
