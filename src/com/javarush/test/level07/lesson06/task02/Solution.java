package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxSize = 0;

        for(int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
            if(i == 0)
                maxSize = list.get(i).length();
            else
                if(list.get(i).length() > maxSize)
                    maxSize = list.get(i).length();
        }

        for(int i = 0; i < 5; i++)
        {
            if(list.get(i).length() == maxSize)
                System.out.println(list.get(i));
        }
    }
}
