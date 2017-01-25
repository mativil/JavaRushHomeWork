package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());

        if(i1 > i2)
        {
            if(i3>i1)
            {
                System.out.println(i3);
                System.out.println(i1);
                System.out.println(i2);
            }
            else
            {
                if(i3>i2)
                {
                    System.out.println(i1);
                    System.out.println(i3);
                    System.out.println(i2);
                }
                else
                {
                    System.out.println(i1);
                    System.out.println(i2);
                    System.out.println(i3);
                }
            }

        }
        else
        {
            if(i3>i1)
            {
                System.out.println(i3);
                System.out.println(i2);
                System.out.println(i1);
            }
            else
            {
                if(i3>i2)
                {
                    System.out.println(i2);
                    System.out.println(i3);
                    System.out.println(i1);
                }
                else
                {
                    System.out.println(i2);
                    System.out.println(i1);
                    System.out.println(i3);
                }
            }
        }
    }
}
