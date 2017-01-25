package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    double top;
    double left;
    double width;
    double height;

    public Rectangle(double top, double left, double width, double height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(double top, double left)
    {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(double top, double left, double width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle(Rectangle rect)
    {
        this.top = rect.top;
        this. left = rect.left;
        this.width = rect.width;
        this.height = rect.height;
    }
}
