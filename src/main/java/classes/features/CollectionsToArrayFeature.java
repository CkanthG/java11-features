package classes.features;

import java.util.Arrays;
import java.util.List;

public class CollectionsToArrayFeature {
    public void collectionToArrayConverter() {
        List<String> strings = Arrays.asList("Java", "Kotlin", "Scala", "PostgreSQL", "Redis", "RabbitMQ", "Auth0");
        String[] stringsArray = strings.toArray(String[]::new);
        for (String string : stringsArray) {
            System.out.println(string);
        }
    }
}
