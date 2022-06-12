package singletonExamples;

public class ChoclateBoiler {

	private boolean empty; 
	private boolean boiled;
	
	public static ChoclateBoiler uniqueInstance; 

private ChoclateBoiler() { 
	empty  =  true; 
	boiled = false; 
   }

public static ChoclateBoiler getInstance() {
	
	if (uniqueInstance == null) { 
		uniqueInstance = new ChoclateBoiler();
	}
	return uniqueInstance; 
	
}
 public void fill() { 
	 if(isEmpty()) { 
	empty =  false; 
	boiled = false; 
	
	// fill the boiler with a milk/chocolate mixture
	 }
 }
 public void drain () { 
	 if(!isEmpty() && isBoiled() ) { 
		 // drain the boiled milk and chocolate
		 empty = true; 
	 }
 }
 public void boil() { 
	 if(! isEmpty() && !isBoiled()) {
		 // bring the content to a boil
		 boiled = true; 
	 }
 }
public boolean isBoiled() {
	
	return boiled;
}
public boolean isEmpty() {
	return  empty;
	}
}
