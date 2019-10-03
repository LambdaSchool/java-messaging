package com.lambdaschool.part02ConstructorInjection;

// business rules
public class MyApplication
{
    private MessageService msgSrv;

    public MyApplication(MessageService msgSrv)
    {
        this.msgSrv = msgSrv;
    }

    public void send(String addr, String msg)
    {
        // rules of messaging
        msg = msg + "\n*** FOR YOUR EYES ONLY ***";
        msgSrv.sendMessage(addr, msg);
    }
}
