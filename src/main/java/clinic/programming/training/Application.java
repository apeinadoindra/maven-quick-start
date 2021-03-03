package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;


public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }
	
	
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for (String salutacion : greetings) {
			System.out.println("Salutaciones: "+salutacion);
		}
	}
}