package state;

import java.util.ArrayList;

public class State4 extends State {
	
	State4(Automato automato) {
        super(automato);
    }
	
	@Override
    public Boolean routeValid(char letter) {
		State nextState = null;
		if (letter == 'd') {
			nextState = new State3(automato);
		}
		
		if (nextState == null) {
			return false;
		} else {
			this.automato.changeState(nextState);
			return true;
		}
    }
}