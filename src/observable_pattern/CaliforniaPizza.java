 package observable_pattern;

public class CaliforniaPizza extends ObservableCustom {
	
	public CaliforniaPizza() {
		
	}
	public void newDeal(String deal) {
		notifyPerson(deal);
	}

}
