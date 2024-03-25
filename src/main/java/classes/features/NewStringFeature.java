package classes.features;

import java.util.List;
import java.util.stream.Collectors;

public class NewStringFeature {
    public void newStringMethods(String input) {
        List<String> stringList = input.lines().filter(
                lines -> !lines.isBlank()
        ).map(
                String::strip
        ).collect(Collectors.toList());
        System.out.println("stringList : "+stringList);
    }
}
