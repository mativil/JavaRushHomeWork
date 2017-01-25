package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Иван on 29.12.2016.
 */
public class BelarusianHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 5;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - Belarus. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";

    }
}