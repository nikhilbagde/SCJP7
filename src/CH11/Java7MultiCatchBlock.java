package CH11;

import java.util.Scanner;

/**
 * Created by Nikhil on 2/3/2016.
 */
public class Java7MultiCatchBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        try{
            if(number.length()>5) {
                throw new IllegalArgumentException();
            }
            Integer.parseInt(number);
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e){
            e.printStackTrace();
        }

    }
}
