package CH11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Nikhil on 1/16/2016.
 */
public class LearnIterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Nikhil");
        myList.add("Vandana");
        myList.add("Vijay");
        myList.add("Saily");
        myList.add("Javed");
        myList.add("Aai");

        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
