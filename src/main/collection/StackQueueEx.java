package main.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack s = new Stack();
        Queue q = new LinkedList(); //linkedlist를 queue 처럼사용한다

        s.push(0);
        s.push(1);
        s.push(2);

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("Stack");
        while(!s.isEmpty()){
//            System.out.println(s.peek());//맨 마지막 원소를 지우지 않고 출력
            System.out.println(s.pop());//맨 마지막 원소를 지우고 출력
        }
        System.out.println("Strack : " + s);

        System.out.println("Queue");
        while(!q.isEmpty()){
//            System.out.println(q.peek()); //맨 앞 원소를 지우지 않고 출력
            System.out.println(q.poll());//맨 앞 원소를 지우지 않고 출력
        }
        System.out.println("Queue :" + q);
    }
}
