package com.lambdaschool.part01TightlyCoupled;

public class MessageService
{
    public void sendMessage(String address, String message)
    {
        //sout
        System.out.println("For " + address + ": " + message);
    }

    public String readMessage()
    {
        return("Not Implemented");
    }
}
