package CH11;

import java.util.stream.IntStream;

/**
 * Created by Nikhil on 1/16/2016.
 */
public class StreamTest {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).forEach(i-> System.out.print(i));
    }
}
