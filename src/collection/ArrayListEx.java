package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0);
        list.add("1");
        list.add(true);
        list.add(new Date());
        list.add(4);
        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
//            System.out.println(list.get(i) instanceof Date?"O":"X");
        }
        System.out.println(list.indexOf(new Date())); //몇번째 인덱스인지 찾아줌
        list.remove(3);//인덱스에 해당하는 내용 지우기
        list.set(1,1); //a(1)에해당하는자리에 b(1)넣기
        list.set(2,2); //a(2)에해당하는자리에 b(2)넣기
        System.out.println(list.toString());
        Comparator comp = new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        if (o1 instanceof Comparable && o2 instanceof Comparable) {
                            Comparable c1 = (Comparable) o1;
                            Comparable c2 = (Comparable) o2;
                            return c1.compareTo(c2)*-1;
                        }
                        return -1;

        }
        };
//        list.sort();
        Collections.sort(list, comp);
        System.out.println(list.toString());
    }
}
