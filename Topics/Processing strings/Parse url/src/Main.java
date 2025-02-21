import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        scanner.close();

        parseUrl(url);
    }

    public static void parseUrl(String url) {
        String queryString = url.substring(url.indexOf("?") + 1); // Extract query parameters
        String[] params = queryString.split("&"); // Split into key-value pairs

        Map<String, String> paramMap = new LinkedHashMap<>();
        String passwordValue = null;

        for (String param : params) {
            String[] keyValue = param.split("=", 2);
            String key = keyValue[0];
            String value = keyValue.length > 1 && !keyValue[1].isEmpty() ? keyValue[1] : "not found";

            paramMap.put(key, value);

            if (key.equals("pass")) {
                passwordValue = value;
            }
        }

        // Print all parameters
        for (Map.Entry<String, String> entry : paramMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Print password value separately if pass exists
        if (passwordValue != null) {
            System.out.println("password : " + passwordValue);
        }
    }
}
