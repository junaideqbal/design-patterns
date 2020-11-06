package observable_pattern;

public class Person implements ObserverCustom {
	private boolean moody;
	public String newMessage;
	
	public Person(boolean moody) {
		this.moody = moody;
	}

	public void update(Person p) {
		action(p);
	}

	public void action(Person p) {
			
		System.out.println("Person: ");
		if(p.moody) {
			
			System.out.println("I dont care about this deal.");
			System.out.println("Her is a moody person");
		} else {
			
			System.out.println("Love the deal, Lets go for it.");
			System.out.println("Her is a lovely person");
		}
		System.out.println();
		System.out.println();
		
	}

}
