package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileName = new FileInputStream(reader.readLine());

            int bytes = 0;
            int count = 0;
            while (fileName.available() > 0)
            {
                bytes = fileName.read();
                if (bytes == 44)
                {
                    count++;
                }
            }

            System.out.println(count);
            fileName.close();
            reader.close();

        }catch (Exception fail){
        }
    }
}
