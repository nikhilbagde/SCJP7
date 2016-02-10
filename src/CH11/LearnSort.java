package CH11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Nikhil on 1/16/2016.
 */
public class LearnSort {
    public static void main(String[] args) {
        String [] mySortArray = {"one","two", "three", "four"};
        Arrays.sort(mySortArray);

        for (String a:mySortArray)
            System.out.print(a + " ");

        System.out.print("\n one= " + Arrays.binarySearch(mySortArray,"one")); //returns index of one and likewise
        System.out.print("\n two= " + Arrays.binarySearch(mySortArray,"two"));
        System.out.print("\n three= " + Arrays.binarySearch(mySortArray,"three"));
        System.out.print("\n four= " + Arrays.binarySearch(mySortArray,"four"));

        // Reverse Compare
        System.out.println("\nReverse Compare");
        ReSortComparator rs = new ReSortComparator();
        Arrays.sort(mySortArray,rs);

        for (String a:mySortArray)
            System.out.print(a + " ");

        System.out.print("\n one= " + Arrays.binarySearch(mySortArray,"one"));
        System.out.print("\n two= " + Arrays.binarySearch(mySortArray,"two"));
        System.out.print("\n three= " + Arrays.binarySearch(mySortArray,"three"));
        System.out.print("\n four= " + Arrays.binarySearch(mySortArray,"four"));

        //with reverse
        System.out.print("\n one= " + Arrays.binarySearch(mySortArray,"one",rs));
        System.out.print("\n two= " + Arrays.binarySearch(mySortArray,"two",rs));
        System.out.print("\n three= " + Arrays.binarySearch(mySortArray,"three",rs));
        System.out.print("\n four= " + Arrays.binarySearch(mySortArray,"four",rs));

    }
    static class ReSortComparator implements Comparator<String>{

        @Override
        public int compare(String a, String b) {
            return b.compareTo(a); // here reverse is happening
        }
    }
}
