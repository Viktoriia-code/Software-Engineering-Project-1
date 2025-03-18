import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        String language;
        String country;
        if (args.length == 2) {
            language = args[0];
            country = args[1];
        } else {
        // Use default language and country
            language = "fr";
            country = "FR";}
        Locale local = new Locale(language, country);
        ResourceBundle r = ResourceBundle.getBundle("messages", local);
        System.out.println(r.getString("greetings"));
        System.out.println(r.getString("farewell"));
        System.out.println(r.getString("inquiry"));
        System.out.println();
    }
}
