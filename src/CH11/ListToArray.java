package CH11;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by Nikhil on 1/16/2016.
 */
public class ListToArray {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }
        System.out.println(myList);

        //Lets try to convert List to array
        //Method 1: is direct conversion
        Object[] myArray1 = myList.toArray();

        //Method 2: Passing parameter to toArray() of List
        int [] myArray2 = new int[myList.size()];

        // See this int cant work because we are dealing with collections
        // and in collections item is considered as object and not primitive
        //XXXXXX  myArray2 = myList.toArray(myArray2); XXXXXXX  //Wont work!

        myArray2 = myList.stream().mapToInt(i->i).toArray();
        for(int a:myArray2)
            System.out.print(a+" ");


        //Another Solution: Use Boxing, Globle classes of primitives
        Integer [] myArray3 = new Integer[myList.size()];
        myArray3 = myList.toArray(myArray3);
        System.out.println();
        for(int a:myArray3)
            System.out.print(a+" ");

        System.out.println("\nPlaying with List Stream thing");
        System.out.println(myList.stream());
        System.out.println(myList.stream().mapToInt(i->i));
        System.out.println(myList.stream().mapToInt(i->i).toArray());

        for(int a:myList.stream().mapToInt(i->i).toArray())
            System.out.print(a +" ");


        //New Concept of Stream
        //Int Stream : Replace traditional for loops with IntStreams

        System.out.println("\nNew Concept of Stream");
        System.out.println(IntStream.range(1,3));

        IntStream.range(1,3);
        IntStream.rangeClosed(1,3);
        IntStream.iterate(0,i->i+2).limit(10);  //not upto 0-10, but 10 denoted total 10 items.. so it can be abouve 0-10


        IntStream.rangeClosed(1,10).forEach(i-> System.out.print(i + " "));

    }
}
