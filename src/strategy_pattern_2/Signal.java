package strategy_pattern_2;

// Context
public class Signal extends Light{
	
	public Signal() {
		// TODO Auto-generated constructor stub
		lb = new RedLight();
	}
	public void setSignal(LightBehavior lb) {
		this.lb = lb;
	}
}
