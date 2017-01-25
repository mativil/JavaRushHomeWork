package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
            Human h1 = new Human();
            Human h2 = new Human("Vasya");
            Human h3 = new Human("Ilya",23);
            Human h4 = new Human("Ilya",23, true);
            Human h5 = new Human("Ilya",true);
            Human h6 = new Human("Ilya", 23, true, "Green");
            Human h7 = new Human("Ilya", 23, true, "Green", 178);
            Human[] fr = new Human[]{h1,h2,h3};
            Human h8 = new Human("Ilya", 23, true, "Green", 178, new ArrayList(Arrays.asList(fr)));
            Human h9 = new Human("Ilya", true,new ArrayList(Arrays.asList(fr)));
            Human h10 = new Human("Ilya", new ArrayList(Arrays.asList(fr)));
    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторыъ
        String name;
        int age;
        boolean sex;
        String hairColor;
        int height;
        ArrayList<Human> friends = new ArrayList<Human>();

        public Human()
        {

        }

        public Human(String name)
        {
            this.name = name;
        }
        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name,boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, int age, boolean sex, String hairColor)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hairColor = hairColor;
        }
        public Human(String name, int age, boolean sex, String hairColor, int height)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hairColor = hairColor;
            this.height = height;
        }
        public Human(String name, int age, boolean sex, String hairColor, int height, ArrayList<Human> friends)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hairColor = hairColor;
            this.height = height;
            this.friends = friends;
        }
        public Human(String name, boolean sex, ArrayList<Human> friends)
        {
            this.name = name;
            this.sex = sex;
            this.friends = friends;
        }
        public Human(String name,ArrayList<Human> friends)
        {
            this.name = name;
            this.friends = friends;
        }
    }

}
