package homeworkweek_9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program5
{
    public static void main(String[] args) {
                iterator();
    }


    public static void iterator()
    {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator itr = numbers.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
