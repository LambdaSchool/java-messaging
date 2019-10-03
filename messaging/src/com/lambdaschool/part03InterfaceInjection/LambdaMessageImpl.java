package com.lambdaschool.part03InterfaceInjection;

public class LambdaMessageImpl implements MessageService
{
    @Override
    public void sendMessage(String address,
                            String msg)
    {
        System.out.println("For " + address + ": " + msg);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
