package strumienZ10Liczb;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        Stream.generate(new Random()::nextInt)
                .limit(10)
                .forEach(System.out::println);
    }
}
