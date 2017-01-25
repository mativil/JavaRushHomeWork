package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        /*
        Iterator<Map.Entry<String, String>> e = map.entrySet().iterator();
        while(e.hasNext())
        {
            int cnt = 0;
            Map.Entry<String, String> pair = e.next();
            for (Map.Entry<String, String> pair2: map.entrySet())
            {
                if(pair2.getValue().equals(pair.getValue()))
                    cnt++;
            }
            System.out.println(cnt);
            if(cnt > 1)
                removeItemFromMapByValue(map, pair.getValue());
        }
        */
        HashMap<String, String> copy = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> e = copy.entrySet().iterator();
        while(e.hasNext())
        {
            int cnt = 0;
            Map.Entry<String, String> pair = e.next();
            for (Map.Entry<String, String> pair2: copy.entrySet())
            {
                if(pair2.getValue().equals(pair.getValue()))
                    cnt++;
            }
            //System.out.println(cnt);
            if(cnt > 1)
                removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
        /*

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while(iter.hasNext())
        {
            Map.Entry<String, String> s = iter.next();
            if(s.getValue().equals(value))
                map.remove(s.getKey());
        }
        */
    }
}
