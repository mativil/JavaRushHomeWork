package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(isDateOdd(s));
    }

    public static boolean isDateOdd(String date)
    {
        Date yearDate = new Date();
        yearDate.setHours(0);
        yearDate.setMinutes(0);
        yearDate.setSeconds(0);

        yearDate.setDate(0);
        yearDate.setMonth(0);

        Date currentDate = new Date(date);

        long yearDistanse = currentDate.getTime() - yearDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (yearDistanse/msDay);

        //System.out.println(dayCount);

        if (dayCount%2==0) {
            return true;
        } else {
            return false;
        }
    }
}
