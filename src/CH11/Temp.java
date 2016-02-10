package CH11;

/**
 * Created by Nikhil on 2/2/2016.
 */
public class Temp {
    public static void main(String[] args) {
        String S1= "CSx42";
        String S2 = "CS440";
        swap(S1,S2);
        System.out.println("in Main");
        System.out.println("\nS1 " + S1 + "\nS2 " + S2);


    }
    public static void swap(String a, String b){
        String temp = a;
        a= b;
        b= temp;
        System.out.println("in swap:\n");
        System.out.println("Temp " + temp + "\nS1 " + a + "\nS2 " + b + "\n");

    }
}
