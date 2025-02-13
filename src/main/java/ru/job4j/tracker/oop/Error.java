package ru.job4j.tracker.oop;

import java.net.SocketException;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Активна " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 10, "Constructs a new SocketException with no detail message.");
        Error error3 = new Error(false, 99, "Thrown when an exceptional arithmetic condition has occurred. For example, an integer"
               + " \"divide by zero\" throws an instance of this class. ArithmeticException objects may be constructed by the virtual machine as if suppression "
               + " were disabled and/or the stack trace was not writable.\n"
               + "Since:1.0");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
