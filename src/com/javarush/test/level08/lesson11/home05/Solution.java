package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String sPrev = "";
        //напишите тут ваш код
        String[] mass = new String[s.length()];

        for(int i = 0; i <s.length(); i++)
        {
            String symbol = s.substring(i, i + 1);
            if(i == 0 || (!symbol.equals(" ") && sPrev.equals(" ")))
                mass[i] = symbol.toUpperCase();
            else
            mass[i] = symbol;

            sPrev = symbol;
        }

        for(int i = 0; i< mass.length; i++)
            System.out.print(mass[i]);

    }


}
