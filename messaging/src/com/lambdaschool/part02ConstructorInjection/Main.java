package com.lambdaschool.part02ConstructorInjection;

public class Main
{

    // psvm
    public static void main(String[] args)
    {
        MyApplication messaging = new MyApplication(new OurMessageService());
        messaging.send("JRMMBA", "Hello");

        messaging = new MyApplication(new YourMessageService());
        messaging.send("JRMMBA", "Hello");
    }
}
