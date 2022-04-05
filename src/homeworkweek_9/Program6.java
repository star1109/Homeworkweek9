package homeworkweek_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Program6
{
    public static void main(String[] args) {
            m1();
    }

    public static void m1()
    {
        ArrayList<Object> obj = new ArrayList<>();
        obj.add("Hi");
        obj.add(101);
        obj.add("Hello");
        obj.add(102);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter which index value you want :");
            int num = sc.nextInt();
            System.out.println(obj.get(num));
        } catch(Exception e)
        {
            System.out.println("please enter in array index range");
        }
    }
}
