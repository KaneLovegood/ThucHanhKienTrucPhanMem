package org.example;

import java.util.*;
import java.util.function.Supplier;

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String msg) { System.out.println("Sending Email: " + msg); }
}

class SMSNotification implements Notification {
    public void send(String msg) { System.out.println("Sending SMS: " + msg); }
}

class NotificationFactory {
    private static final Map<String, Supplier<Notification>> registeredTypes = new HashMap<>();

    // Đăng ký loại thông báo mới tại đây (hoặc dùng Static Block)
    static {
        registeredTypes.put("EMAIL", EmailNotification::new);
        registeredTypes.put("SMS", SMSNotification::new);
    }

    public static Notification createNotification(String type) {
        Supplier<Notification> notification = registeredTypes.get(type.toUpperCase());
        if (notification == null) throw new IllegalArgumentException("Loại này chưa đăng ký!");
        return notification.get();
    }


}