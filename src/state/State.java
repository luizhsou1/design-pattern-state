package state;

public abstract class State {
    Automato automato;

    State(Automato automato) {
        this.automato = automato;
    }

    public abstract Boolean routeValid(char letter);
}
