package main.thread;

public class DaemonThreadEx implements  Runnable{
    static boolean autoSave = false;
    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThreadEx());
        t.setDaemon(true); //해당프로세스가 종료되기전까지 죽지 않음 프로세스가 종료되면 같이 사라짐
        t.start();
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            System.out.println(i);
            if(i==5) autoSave = true;
        }
    }

    @Override
    public void run() {
        while (true){
            try {
            Thread.sleep(1000*3);
            }catch (InterruptedException e) { }
            if(autoSave) autoSave(); //하나는 변수 하나는 메서드, 생성자는 대문자여야하고 클래스이름과 같아야함
        }
    }
    public void autoSave() {
        System.out.println("작업이 저장되었습니다.");
    }
}
