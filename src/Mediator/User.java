package Mediator;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String s) {
        ChatRoom.showMessage(this, s);
    }

    public void sendImage(String img) {
        ChatRoom.showImage(this,img);
    }
}
