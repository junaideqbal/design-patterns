package strategy_pattern_3;

public class main {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(45, 35));

	}

}
