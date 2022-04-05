/*Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
* */
package homeworkweek_9;

import java.util.ArrayList;

public class Program4
{
    public static void main(String[] args) {
        System.out.println("List of colors: ");
        arrayList();

    }

    public static void arrayList()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("blue");
        list.add("green");
        list.add("purple");
        list.add("orange");
        list.add("white");
        list.add("black");

        for( String l: list)
        {
            System.out.println(l);
        }

    }

}
