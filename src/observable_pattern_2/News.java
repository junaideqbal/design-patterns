package observable_pattern_2;

import java.util.Observable;

public class News extends Observable{

	public void news() {
		// TODO Auto-generated method stub
		String[] news = {"News 1", "News 2", "News 3"};
        for(String s: news){
            //set change
            setChanged();
            //notify observers for change
            notifyObservers(s);
            
        }

	}
}
