package com.lambdaschool.part03InterfaceInjection;

public class MyApplication implements Processor
{
    // constructor injections
    private MessageService msgSrv;

    public MyApplication(MessageService msgSrv)
    {
        this.msgSrv = msgSrv;
    }

    @Override
    public void sendMessage(String msg,
                            String address)
    {
        // rules
        msg = msg + "\n*** FOR YOUR EYES ONLY ***";
        msgSrv.sendMessage(address, msg);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
