package com.javarush.test.level11.lesson06.task01;

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
Унаследовать пегаса от лошади.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Horse s = new Pegas();
    }

    public static class Horse
    {

    }

    public static class Pegas extends Horse
    {

    }
}
