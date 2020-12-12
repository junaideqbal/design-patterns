package observable_pattern_2;

import java.util.Observable;
import java.util.Observer;

public class FirstNewsReader implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("FirstNewsReader got The news:"+(String)arg);
		
	}

}
