package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification("EMAIL");
        email.send("Hello via Email!");

        Notification sms = NotificationFactory.createNotification("SMS");
        sms.send("Hello via SMS!");
    }
}