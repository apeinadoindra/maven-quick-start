package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("Yo tengo cuatro palabras");
		System.out.println("Contador de palabras: "+count);
    }
	
	
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for (String salutacion : greetings) {
			System.out.println("Salutaciones: "+salutacion);
		}
	}
	
	public int countWords(String words) {
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
}