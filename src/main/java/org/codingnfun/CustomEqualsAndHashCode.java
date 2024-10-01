package org.codingnfun;

import java.util.Objects;

public class CustomEqualsAndHashCode {
    public static void main( String[] args )
    {
        Person p1 = new Person("Ankit");
        Person p2 = new Person("Komal");
        Person p3 = new Person("Ankit");

        System.out.println( p1.equals(p2));
        System.out.println( p1.equals(p3));
    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}
