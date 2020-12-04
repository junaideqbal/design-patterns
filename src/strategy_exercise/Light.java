package strategy_exercise;

public abstract class Light {
	LightBehavior lb;
	
	public void glow() {
		lb.glow();
	}

}
