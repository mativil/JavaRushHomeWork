package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int cntPlus = 0;
        int cntMinus = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());
        if(i1 >0) cntPlus++; else if(i1 < 0) cntMinus++;
        if(i2 >0) cntPlus++; else if(i2 < 0) cntMinus++;
        if(i3 >0) cntPlus++; else if(i3 < 0) cntMinus++;
        System.out.println("количество отрицательных чисел: "+cntMinus);
        System.out.println("количество положительных чисел: "+cntPlus);

    }
}
