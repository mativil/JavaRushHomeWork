package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        while(inputStream.available() > 0)
        {
            int nextByte = inputStream.read();
            if(map.containsKey(nextByte))
            {
                map.put(nextByte, map.get(nextByte) + 1);
            }
            else
                map.put(nextByte, 1);
        }
        inputStream.close();
        reader.close();
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.print(entry.getKey()+" ");     // Print the key with max value
            }
        }


    }
}
