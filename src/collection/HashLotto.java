package collection;

import java.util.HashSet;
import java.util.Random;

public class HashLotto {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Random random = new Random();
        int[] lot = new int[6];
        int count = 0;
        while(count < 6){
            int num = 1 + random.nextInt(6);

            for (int i = 0; i < count; i++) {
                if(lot[i] == num){

                }
            }
        }
    }
}
