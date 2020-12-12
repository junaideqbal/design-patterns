package strategy_pattern_1;

public class ChineseDuck extends Duck{
	
	public ChineseDuck() {
		// TODO Auto-generated constructor stub
		fB = new NoFLy();
		qB = new Quack();
	}
	
	public void setFlyBehaviour(FlyBehaviour fB) {
		this.fB = fB;
	}

}
