package CH11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nikhil on 1/16/2016.
 */
public class LearnArrayList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("B");
        myList.add("A");
        myList.add("D");
        myList.add("C");
        myList.add("G");
        myList.add("F");
        myList.add("E");
        System.out.println("Unsorted Arraylist = " + myList);
        Collections.sort(myList);

        System.out.println("Sorted ArrayList= "+ myList);

        String[] name = {"Vijay", "Saily","Vandana", "Nikhil"};
        Arrays.sort(name);
        for(String a :name)
        System.out.print(a+"\t");
    }
}
