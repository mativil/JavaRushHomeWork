package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Иван on 29.12.2016.
 */
public class UkrainianHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 1;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - Ukraine. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";

    }
}
