package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Иван on 29.12.2016.
 */
public class MoldovanHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 7;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - Moldova. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";

    }
}