package com.lambdaschool.part03InterfaceInjection;

public class EmailMessageImpl implements MessageService
{
    @Override
    public void sendMessage(String address,
                            String msg)
    {
        System.out.println("For: " + address + "\n" + "msg: " + msg);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
