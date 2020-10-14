package state;

import java.util.ArrayList;

public class State2 extends State {
	
	State2(Automato automato) {
        super(automato);
    }
	
	@Override
    public Boolean routeValid(char letter) {
		State nextState = null;
		if (letter == 'a') {
			nextState = new State2(automato);
		} else if (letter == 'b') {
			nextState = new State1(automato);
		} else if (letter == 'c') {
			nextState = new State4(automato);
		}
		
		if (nextState == null) {
			return false;
		} else {
			this.automato.changeState(nextState);
			return true;
		}
    }
}