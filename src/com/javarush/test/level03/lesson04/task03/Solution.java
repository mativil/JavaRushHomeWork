package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Зерг1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Зерг2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Зерг3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Зерг4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Зерг5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Зерг6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Зерг7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Зерг8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Зерг9";
        Zerg happyZerg = new Zerg();
        happyZerg.name = "Игорь";

        Protos protos1 = new Protos();
        protos1.name = "Протос1";
        Protos protos2 = new Protos();
        protos2.name = "Протос2";
        Protos protos3 = new Protos();
        protos3.name = "Протос3";
        Protos protos4 = new Protos();
        protos4.name = "Протос4";
        Protos protos5 = new Protos();
        protos5.name = "Протос5";

        Terran t1 = new Terran();
        t1.name = "Терран1";
        Terran t2 = new Terran();
        t2.name = "Терран2";
        Terran t3 = new Terran();
        t3.name = "Терран3";
        Terran t4 = new Terran();
        t4.name = "Терран4";
        Terran t5 = new Terran();
        t5.name = "Терран5";
        Terran t6 = new Terran();
        t6.name = "Терран6";
        Terran t7 = new Terran();
        t7.name = "Терран7";
        Terran t8 = new Terran();
        t8.name = "Терран8";
        Terran t9 = new Terran();
        t9.name = "Терран9";
        Terran t10 = new Terran();
        t10.name = "Терран10";
        Terran t11 = new Terran();
        t11.name = "Терран11";
        Terran t12 = new Terran();
        t12.name = "Терран12";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}