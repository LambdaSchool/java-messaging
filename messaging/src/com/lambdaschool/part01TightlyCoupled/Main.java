package com.lambdaschool.part01TightlyCoupled;

public class Main
{

    // psvm
    public static void main(String[] args)
    {
        MyApplication messaging = new MyApplication();
        messaging.send("JRMMBA", "Hello");
    }
}
