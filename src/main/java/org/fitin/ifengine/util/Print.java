package org.fitin.ifengine.util;

public class Print {
    //todo add log to file
    public static void p(String s) {
        System.out.print(s);
    }

    public static void pl(String s) {
        System.out.println(s);
    }

    public static void pl(String... ss) {
        for (String s : ss) {
            System.out.println(s);
        }
    }
}
