package maratonajavadevdojo.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
       ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));

        bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));

    }
}
