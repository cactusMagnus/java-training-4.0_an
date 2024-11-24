import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {

        return Arrays.stream(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(0, (a, b) -> (a + b));
    }

    public static int[] getSortedOddsArray(int[] numbers) {

        return Arrays.stream(numbers)
                .filter(x -> x % 2 != 0)
                .sorted()
                .toArray();
    }
}