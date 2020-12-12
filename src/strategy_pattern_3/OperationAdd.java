package strategy_pattern_3;

// Different Contexts
public class OperationAdd implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
