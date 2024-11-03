import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        Pattern pattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            String[] values = matcher.group().split("\\.");
              for (String v : values) {
                  if(Integer.parseInt(v) < 0 || Integer.parseInt(v) > 255) {
                      return "";
                  }
            }
            return matcher.group();
        } else return "";
    }
}