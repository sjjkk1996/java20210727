package collection;

import java.util.*;

public class HashLotto {
    public static void main(String[] args) {
        Set lotto = new HashSet();
        int num;

        while(lotto.size() < 6){
            num = (int)(Math.random()*45+1);

            lotto.add(num);
        }
        ArrayList<Integer> arr = new ArrayList<Integer>(lotto);

        System.out.println("로또번호: "+arr);
    }
}
