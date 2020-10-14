package state;

import java.util.ArrayList;

public class main {
	
	
	public static void main(String[] args) {
		Automato automato = new Automato();
		Boolean valid;
		
		ArrayList<String> strs = new ArrayList<String>();
		strs.add("aaacdb");
		strs.add("ababacdaaac");
		strs.add("abcdb");
		strs.add("acda");
		strs.add("acdbdb");
		
		
		for (String str: strs) {
			valid = true;
			automato.changeState(new State1(automato));
			for (char c: str.toCharArray()) {
				valid = automato.getState().routeValid(c);
				if (!valid) {
					System.out.println(str + ": inválida");
					break; 
				}
			}
			if (valid) {
				System.out.println(str + ": válida");
			}			
		}
	}

}
