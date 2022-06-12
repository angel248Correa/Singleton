package singletonExamples;

public class Singleton {

	public volatile static Singleton uniqueInstance; 
	
	// other useful instance variable here
	
	public Singleton() { 
		
	}
	public static Singleton getInstance() {
		if(uniqueInstance == null ) { 
			synchronized (Singleton.class) {
			
		if(uniqueInstance == null) { 
			uniqueInstance = new Singleton(); 
		}
	}
}
		return uniqueInstance; 
	}
	
	// other useful methods
}
