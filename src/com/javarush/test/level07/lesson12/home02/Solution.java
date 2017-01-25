package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i = 0 ; i < n; i++)
            lst.add(Integer.parseInt(reader.readLine()));
        lst = switchList(lst,m);
        for(int i = 0 ; i < n; i++)
            System.out.println(lst.get(i));


    }

    public static ArrayList<Integer> switchList(ArrayList<Integer> list, int m)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = m; i< list.size();i++)
                result.add(list.get(i));
        for(int i = 0; i< m;i++)
                result.add(list.get(i));
        return result;
    }
}
