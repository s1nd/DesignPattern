package Mediator;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User u, String s) {
        System.out.println(new Date()+"["+u.getName()+"]:"+s);
    }
    //用string代替image
    public static void showImage(User u, String img) {
        System.out.println(new Date()+"["+u.getName()+"]:"+img);
    }
}
