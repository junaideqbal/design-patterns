package strategy_pattern_java;

public class Mute implements QuackBehaviour{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I'm Silent.");
	}

	
}
