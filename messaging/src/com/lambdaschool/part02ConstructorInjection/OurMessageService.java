package com.lambdaschool.part02ConstructorInjection;

public class OurMessageService extends MessageService
{
    @Override
    public void sendMessage(String address,
                            String message)
    {
        System.out.println("FOR " + address + ": " + message);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
