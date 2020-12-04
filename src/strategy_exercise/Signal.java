package strategy_exercise;

public class Signal extends Light{
	
	public Signal() {
		// TODO Auto-generated constructor stub
		lb = new RedLight();
	}
	public void setSignal(LightBehavior lb) {
		this.lb = lb;
	}
}
