import java.util.ArrayList;
import java.util.List;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();

        if (array1.length > array2.length) {
            for (String s : array2) {
                for (String string : array1) {
                    if (s.equals(string)) {
                        result.add(s);
                        break;
                    }
                }
            }
        } else {
            for (String s : array1) {
                for (String string : array2) {
                    if (s.equals(string)) {
                        result.add(s);
                        break;
                    }
                }
            }
        }
        String[] common = new String[result.size()];
        return result.toArray(common);
    }
}