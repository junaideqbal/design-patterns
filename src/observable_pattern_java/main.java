package observable_pattern_java;

public class main {

	public static void main(String[] args) {
		News observedNews = new News();
		
        FirstNewsReader reader1 = new FirstNewsReader();
        SecondNewsReader reader2 = new SecondNewsReader();
        
        observedNews.addObserver(reader1);
        observedNews.addObserver(reader2);
        
        observedNews.news();
		
	}

}
