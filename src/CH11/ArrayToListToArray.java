package CH11;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nikhil on 1/16/2016.
 */
public class ArrayToListToArray {
    public static void main(String[] args) {
        String [] myArray = {"Vijay", "Javed", "Vandana", "Aai", "Saily", "Nikhil"};
        System.out.println(myArray);

        System.out.print("Array ->");
        for(String s:myArray) System.out.print(s+" ");
        System.out.println("\nSize of Array = "+myArray.length);

        List myList = Arrays.asList(myArray);
        System.out.println("\nList ->"+myList);
        System.out.println("Size of List = "+myList.size());

        //Concept is when we create a array and then convert it to list
        //List and array are in heap, and List just points to same array
        //No new thing is getting created but only references are pointed.
        //So when we try to change Array then it should reflect in list as well. Lets try that

        myArray[0]="My dad Vijay";
        System.out.println("\nAfter Changing the Array [0]th Item, " +
                "\nit gets reflected in List as well! WOW!:" +
                "\nList ->"+myList);

        //NOw lets try to change list and see if array is getting changed or now.
        myList.set(2,"My Mom Vandana");
        System.out.print("\nArray ->");
        for(String s:myArray) System.out.print(s+" ");
        System.out.println("\nAnd List ->");

    }
}
