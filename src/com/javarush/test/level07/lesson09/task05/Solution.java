package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i < 10; i++)
            list.add(reader.readLine());

        ArrayList<String> result = doubleValues(list);
        for(String s: result)
        {
            System.out.println(s);
        }
        //Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        ArrayList<String> result = new ArrayList<String>();
        for(String s: list)
        {
            result.add(s);
            result.add(s);
        }
        //напишите тут ваш код
        return result;
    }
}
