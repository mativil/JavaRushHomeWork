package com.javarush.test.level08.lesson08.task03;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Петр");
        map.put("Иванов2","Петр");
        map.put("Иванов3","Иван");
        map.put("Иванов4","5");
        map.put("Сидоров1","1");
        map.put("Сидоров2","Петр");
        map.put("Сидоров3","1");
        map.put("Сидоров4","3");
        map.put("Иванов5","2");
        map.put("Петрович1","1");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int i = 0;
        Collection<String> col = map.values();
        for(String s : col)
            if(s.equals(name))
                i++;
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int i = 0;
        Set<String> col = map.keySet();
        for(String s : col)
            if(s.equals(lastName))
                i++;
        return i;

    }
}
