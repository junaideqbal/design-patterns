package strategy_pattern_1;

public class Mute implements QuackBehaviour{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I'm Silent.");
	}

	
}
