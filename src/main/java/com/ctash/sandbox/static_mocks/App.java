/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ctash.sandbox.static_mocks;

public class App {
    public static final String TEST_STRING = "321";

    public String getGreeting() {
        return "Hello world.";
    }

    public static String getStaticTestString() {
        return TEST_STRING;
    }

    public String getTestString() {
        return App.getStaticTestString();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
