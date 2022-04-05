package homeworkweek_9;

import java.util.HashSet;
import java.util.Set;

public class Program8
{
    public static void main(String[] args) {
            findNumbers();
    }

    public static void findNumbers()
    {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(7);

        System.out.println(set);

        for (int i = 1;i <= 10; i ++)
        {
            if(set.contains(i))
            {
                System.out.println(i + " number found in list");
            }
            else
                System.out.println(i + " number not found in list");
        }

    }
}
