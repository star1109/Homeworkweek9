package homeworkweek_9;

import java.util.ArrayList;

public class Program7
{
    public static void main(String[] args) {
            isempty();
    }

    public static void isempty()
    {
        ArrayList<String> list = new ArrayList<>();
//        list.add("Bakerloo");
//        list.add("Central");
//        list.add("Circle");
//        list.add("District");
//        list.add("Hammersmith & city");
//        list.add("jubilee");
//        list.add("Metropolitan");
//        list.add("Picadilly");
//        list.add("Waterloo & city");



        if(list.isEmpty())
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("List is not empty..values are: \n" + list );
        }


       // System.out.println(list.isEmpty());
    }

}
