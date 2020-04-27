package Prototype;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
