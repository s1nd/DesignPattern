package Mediator;

public class Main {
    public static void main(String[] args){
        User ben = new User("ben");
        User jerry = new User("jerry");
        ben.sendImage("1.png");
        ben.sendMessage("hi,this is self-portrait");
        jerry.sendMessage("oh,nice");
    }
}
