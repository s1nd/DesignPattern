package Memento;

import java.util.ArrayList;

public class CareTack {
    private java.util.List<Memento> Mementos = new ArrayList<Memento>();

    public void add(Memento memento) {
        Mementos.add(memento);
    }

    public Memento get(int index) {
        return Mementos.get(index);
    }
}
