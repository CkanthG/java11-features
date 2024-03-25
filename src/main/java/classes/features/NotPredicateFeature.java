package classes.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateFeature {
    public void notPredicateMethod() {
        List<String> strings = Arrays.asList("Java", " \n \n", "Kotlin", "\n ", "Scala", "\n \n ", "PostgreSQL");
        List<String> stringList = strings.stream().filter(
                Predicate.not(String::isBlank)
        ).collect(Collectors.toList());
        System.out.println(stringList);
    }
}
