package strategy_pattern_java;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PakistaniDuck pD = new PakistaniDuck();
		pD.swim();
		pD.fly();
		pD.quack();
		
		IndianDuck iD = new IndianDuck();
		iD.swim();
		iD.fly();
		iD.quack();
		
		ChineseDuck cD = new ChineseDuck();
		cD.swim();
		cD.quack();
		cD.fly();
		cD.setFlyBehaviour(new FLyWithEngine()); //set dynamic behavior
		cD.fly();
	}
	
	

}
