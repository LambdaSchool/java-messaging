package com.lambdaschool.part03InterfaceInjection;

public class Main
{
    public static void main(String[] args)
    {
        MessageServiceInjector injector;
        Processor app;

        // send message
        injector = new LambdaMessageInjector();
        app = injector.getProcess();
        app.sendMessage("Hello", "JRMMBA");

        System.out.println("\n\n\n");

        // send message
        injector = new EmailMessageInjector();
        app = injector.getProcess();
        app.sendMessage("Hello", "john@lambdaschool.com");

        System.out.println("\n\n\n");

        // send message
        injector = new TextMessageInjector();
        app = injector.getProcess();
        app.sendMessage("Good Bye", "555-555-5555");
    }
}
