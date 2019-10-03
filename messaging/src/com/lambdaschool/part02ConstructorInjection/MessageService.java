package com.lambdaschool.part02ConstructorInjection;

public abstract class MessageService
{
    public abstract void sendMessage(String address, String message);
    public abstract String readMessage();
}
