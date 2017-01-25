package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Иван on 29.12.2016.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Computer()
    {
        this.monitor = new Monitor();
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
    }
}
