package strategy_pattern_2;

public abstract class Light {
	LightBehavior lb;
	
	public void glow() {
		lb.glow();
	}

}
