package main.collection;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx2 {
  public static void main(String[] args) {
    HashSet set = new HashSet();
    set.add("abc");
    set.add("abc");
    set.add(new Person("David", 10));
    set.add(new Person("David", 10));
    System.out.println(set);
  }
}

class Person {
  String name; int age;
  public Person(String name, int age) {
    this.name = name; this.age = age;
  }
  @Override
  public String toString() { return name+":"+age;}

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) return false;
    Person p = (Person) obj;
    return name.equals(p.name) && age==p.age;
  }
}