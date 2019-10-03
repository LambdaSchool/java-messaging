package com.lambdaschool.part03InterfaceInjection;

public interface MessageService
{
    void sendMessage(String address, String msg);
    String readMessage();
}
