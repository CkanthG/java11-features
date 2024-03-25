package classes.features;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class NestBasedAccessControl {
    public class NestClass {
        public boolean isNestClass = true;

        public boolean isNestClass() {
            return isNestClass;
        }
    }
    public void isNestClassCheck() {
        boolean nestClass = new NestClass().isNestClass();
        System.out.println("This is NestBasedAccessControl " + nestClass);
        Set<String> nestedMembers = Arrays.stream(NestBasedAccessControl.NestClass.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());
        System.out.println("nestedMembers:" + nestedMembers);
    }
}
