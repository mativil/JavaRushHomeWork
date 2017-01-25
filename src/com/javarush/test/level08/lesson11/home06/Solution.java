package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human c1 = new Human("c1", true, 10, new ArrayList<Human>());
        Human c2 = new Human("c2", true, 11, new ArrayList<Human>());
        Human c3 = new Human("c3", false, 9, new ArrayList<Human>());
        Human m = new Human("m", false, 27, new ArrayList(Arrays.asList(new Human[]{c1,c2,c3})));
        Human f = new Human("f", true, 34, new ArrayList(Arrays.asList(new Human[]{c1,c2,c3})));
        Human gm1 = new Human("gm1", false, 55, new ArrayList(Arrays.asList(new Human[]{m})));
        Human gf1 = new Human("gf1", true, 55, new ArrayList(Arrays.asList(new Human[]{m})));
        Human gm2 = new Human("gm2", false, 55, new ArrayList(Arrays.asList(new Human[]{f})));
        Human gf2 = new Human("gf2", true, 55, new ArrayList(Arrays.asList(new Human[]{f})));

        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
