package homeworkweek_9;

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args) {
    reverseArray();
    }

    public static void reverseArray() {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50};
        System.out.println("original array is: ");
        for(int i = 0; i < a.length ; i ++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("reversed array is: ");
        for(int j = a.length-1; j>=0 ; j --)
        {
            System.out.print(a[j] + " ");
        }




    }
}
