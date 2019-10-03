package com.lambdaschool.part03InterfaceInjection;

public class EmailMessageInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new EmailMessageImpl());
    }
}
