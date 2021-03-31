package day20.java.test;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author:liuzidi
 * @Description:
 */
public class SeasonTestTestTest  {
    @Test
    public void test1(){
        Collection col =new ArrayList();
        col.add(123);
        col.add(true);
        col.add(new Person());
        col.add(new String("TOM"));
        Iterator iterator =col.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
class Person {
    private int age;
    private String name;

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}