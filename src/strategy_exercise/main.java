package strategy_exercise;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signal signal = new Signal();
		signal.glow();
		signal.setSignal(new GreenLight());
		signal.glow();
	}

}
