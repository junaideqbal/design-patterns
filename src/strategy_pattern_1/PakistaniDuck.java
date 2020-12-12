package strategy_pattern_1;

public class PakistaniDuck extends Duck {
	
	public PakistaniDuck() {
		// TODO Auto-generated constructor stub
		fB = new FlyWithWings();
		qB = new Mute();
		
	}
}
