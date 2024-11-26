package oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Abstract base class for common attributes
abstract class Person {
    protected String name;
    protected String memberId;

    public Person(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public abstract String getDetails();
}