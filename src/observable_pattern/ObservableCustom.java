package observable_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class ObservableCustom {
	
	List<Person> persons = new ArrayList<Person>();
	
	public void attach(Person e) {
		
		persons.add(e);
		
	}
	
	public void detach(Person e) {
		persons.remove(e);
	}
	
	public void getSubscribersInfo() {
		System.out.println("Our total subscribers are "+persons.size());
	}
	
	public void notifyPerson(String message) {
		for (Person person : persons) {
			person.newMessage = message;
			person.update(person);
		}
	}
	
	
}
