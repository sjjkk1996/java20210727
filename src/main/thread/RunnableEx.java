package main.thread;

public class RunnableEx {
    public static void main(String[] args) {
        NuclearBomb nuclearBomb = new NuclearBomb();
        nuclearBomb.start();

        Bomb bomb = new Bomb();
        Thread t = new Thread(bomb);
        t.start();

    }
}

class NuclearBomb extends Thread{ }
class Explosion { }
class Bomb extends Explosion implements  Runnable{
    @Override
    public void run() {

    }
}