package state;

public class Automato {
    private State state;

    public Automato() {
        this.state = new State1(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}