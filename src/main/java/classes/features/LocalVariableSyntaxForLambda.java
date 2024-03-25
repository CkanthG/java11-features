package classes.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariableSyntaxForLambda {
    public void localVariableSyntax() {
        List<String> strings = Arrays.asList("Java", "Kotlin", "Scala", "PostgreSQL", "Redis", "RabbitMQ", "Auth0");
        String collect = strings.stream().map(
                (var x) -> x.toUpperCase()
        ).collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
