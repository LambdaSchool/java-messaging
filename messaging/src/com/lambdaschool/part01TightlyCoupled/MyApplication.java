package com.lambdaschool.part01TightlyCoupled;

// business rules
public class MyApplication
{
    private MessageService msgSrv = new MessageService();

    public void send(String addr, String msg)
    {
        // rules of messaging
        msg = msg + "\n*** FOR YOUR EYES ONLY ***";
        msgSrv.sendMessage(addr, msg);
    }
}
