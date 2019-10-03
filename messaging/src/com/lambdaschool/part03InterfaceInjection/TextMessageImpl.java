package com.lambdaschool.part03InterfaceInjection;

public class TextMessageImpl implements MessageService
{
    @Override
    public void sendMessage(String address,
                            String msg)
    {
        System.out.println(msg + "---" + address);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
