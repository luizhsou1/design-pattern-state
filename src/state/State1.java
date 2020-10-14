package state;

import java.util.ArrayList;

public class State1 extends State {
	
	State1(Automato automato) {
        super(automato);
    }
	
    @Override
    public Boolean routeValid(char letter) {
    	State nextState = null;
		if (letter == 'a') {
			nextState = new State2(automato);
		}
		
		if (nextState == null) {
			return false;
		} else {
			this.automato.changeState(nextState);
			return true;
		}
    }
}