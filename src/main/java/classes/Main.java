package classes;

import classes.features.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new NewStringFeature().newStringMethods("Java 11 helps \n \n developers \n to work efficient on Strings.");
        new NewFileFeature().newFileMethod();
        new CollectionsToArrayFeature().collectionToArrayConverter();
        new NotPredicateFeature().notPredicateMethod();
        new LocalVariableSyntaxForLambda().localVariableSyntax();
        new NestBasedAccessControl().isNestClassCheck();
        System.out.println(NestBasedAccessControl.class.isNestmateOf(NestBasedAccessControl.NestClass.class));
        System.out.println((NestBasedAccessControl.NestClass.class.getNestHost()).equals(NestBasedAccessControl.class));
    }
}