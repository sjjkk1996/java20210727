package main.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorGenericEx {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student());
    list.add(new Student());
    list.add(new Student());
    Iterator it = list.iterator();
    while (it.hasNext()) {
      Student s = (Student) it.next();//형변환 필요
    }
    Iterator<Student> it2 = list.iterator();
    while (it2.hasNext()) {
      Student s = it2.next();  //형변환 불필요
    }
  }
}
class Student{}