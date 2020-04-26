package Memento;

public class Originator {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memento saveToMementos() {
        return new Memento(status);
    }

    public void getFromMementos(Memento memento) {
        this.status = memento.getStatus();
    }
}
