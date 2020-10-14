package state;

import java.util.ArrayList;

public class State3 extends State {
	
	State3(Automato automato) {
        super(automato);
    }
	
	@Override
    public Boolean routeValid(char letter) {
		State nextState = null;
		if (letter == 'a') {
			nextState = new State1(automato);
		} else if (letter == 'b') {
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