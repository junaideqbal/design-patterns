package observable_pattern;

public class main {

	public static void main(String[] args) {
		
		CaliforniaPizza branch = new CaliforniaPizza();
		branch.getSubscribersInfo(); // must be 0

		Person person1 = new Person(true);
		Person person2 = new Person(false);
		branch.attach(person1);
		branch.attach(person2);
		branch.attach(new Person(true));
		
		branch.getSubscribersInfo(); // must be 2
		
		branch.newDeal("Buy 1 Pizza get 1 Free");
		
		branch.detach(person1);
		branch.getSubscribersInfo(); // must be 1
	}

}
