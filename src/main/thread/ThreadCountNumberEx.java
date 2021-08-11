package main.thread;

import javax.swing.*;

public class ThreadCountNumberEx {
    public static void main(String[] args) {
        Bomb2 b = new Bomb2();
        b.start();
        String pickLine = JOptionPane.showInputDialog("빨간선(0), 파란선(1) 중 선택하시오");
        b.pickLine(Integer.parseInt(pickLine));

    }
}

class Bomb2 extends Thread{
    boolean stopped = false;
    int realLine = (int)(Math.random()*2);
    @Override
    public void run() {
//        for (int i = 10; i > 0 ; i--) {
//            if(stopped) break;
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        int i = 10;
        while(i!=0 && !isInterrupted()){
            System.out.println(i--);
            for(long x=0; x<2500000000L;x++);
        }
    }

    void pickLine(int pickLine) {
        if(realLine==(pickLine)){
            System.out.println("다행이다");
        }else{
            System.out.println("펑~!");
        }
            interrupt();

    }
}