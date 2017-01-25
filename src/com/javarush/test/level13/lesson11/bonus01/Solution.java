package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        String line;
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(inputReader.readLine()));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while ((line = reader.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for(Integer i : list)
            if(i%2 == 0)
                System.out.println(i);
    }
}
