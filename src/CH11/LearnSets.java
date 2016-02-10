package CH11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Nikhil on 1/17/2016.
 */
public class LearnSets {
    public static void main(String[] args) {
        boolean [] ba = new boolean[5];
        Set s = new HashSet<>();

        //s.add function returns a boolean value to us to know that whether added element was duplicate or not
        // This is excellent to know that,
        // So When I will try to add something to set and I want to check whether it was added or not,
        // I will just return result of add function of set to boolean
        ba[0] = s.add("a");
        ba[1] = s.add(new Integer(42));
        ba[2] = s.add("b");
        ba[3] = s.add("a");         //a is duplicate so add will return false here!
        ba[4] = s.add(new Object());

        for (int i = 0; i < ba.length; i++) {
            System.out.print(ba[i] + " ");
        }
        System.out.println();

        // as we have used Hashset the order of the print will not be as inserted order.
        // order will be unpredictable of course.
        for(Object o:s){
            System.out.println(o);
        }
//#####################################[TREE-SET]#####################################################################
        //2nd   We will get below exception when we use TreeSet for set
        /*//Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        at java.lang.Integer.compareTo(Integer.java:52)
        at java.util.TreeMap.put(TreeMap.java:568)
        at java.util.TreeSet.add(TreeSet.java:255)
        at CH11.LearnSets.main(LearnSets.java:40)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:497)
        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)*/

        //Reason : using TreeSet means we want collections to be sorted.
        // But we know that to be collection to sorted we need comparable objects within collection
        // but in set collection we have different types of objects which are not comparable.
        // Think how will you compare "Integer 42" with "A"?

        System.out.println("-------------TreeSet Section--------------");
        Set myTreeSet = new TreeSet();
        ba[0] = myTreeSet.add("a");
        ba[1] = myTreeSet.add(new Integer(42));
        ba[2] = myTreeSet.add("b");
        ba[3] = myTreeSet.add("a");         //a is duplicate so add will return false here!
        ba[4] = myTreeSet.add(new Object());

        for (boolean aBa : ba) {
            System.out.print(aBa + " ");
        }
        System.out.println();

        for(Object o:myTreeSet){
            System.out.println(o);
        }

    }
}
