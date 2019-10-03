package com.lambdaschool.part02ConstructorInjection;

public class YourMessageService extends MessageService
{
    @Override
    public void sendMessage(String address,
                            String message)
    {
        System.out.println(address + ":" + message);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
