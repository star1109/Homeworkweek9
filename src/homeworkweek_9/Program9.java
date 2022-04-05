package homeworkweek_9;

import java.util.HashMap;
import java.util.Map;

public class Program9
{
    public static void main(String[] args) {

    Map<String,Integer> list = new HashMap<>();
    list.put("a" , 1);
    list.put("z" , 2);
    list.put("c" , 3);

    for(Map.Entry<String,Integer> value : list.entrySet())
    {
        System.out.println(value);
    }

    }


}
