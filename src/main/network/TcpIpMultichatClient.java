package main.network;

import javax.swing.*;
import java.io.*;
import java.net.Socket;

public class TcpIpMultichatClient {
    public static void main(String[] args) {
        String nickName = JOptionPane.showInputDialog("채팅할 대화명을 입력하세요!");
        String ip = JOptionPane.showInputDialog("서버 IP를 입력하세요");
        try {
            Socket socket = new Socket(ip, 7777);
            System.out.println("서버에 접속되었습니다.");
            Sender sender = new Sender(socket, nickName);
            sender.start();
            Receiver receiver = new Receiver(socket);
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static class Sender extends Thread {
        Socket socket; // [네트워크를 사용하기 위한 통로] 인 소켓에담아
        DataOutputStream out; // 소켓에서 획득한 값을 [입출력 스트림]을사용하여 네트워크로 보내기
        String nickName; // 통신할 때 구분 되는 ID같은 개념

        // 위의 변수들을 생성자를 통해 초기화!
        public Sender(Socket socket, String nickName) {
            this.socket = socket;this.nickName = nickName;
            try {
                //소켓으로부터 출력스트림을 획득
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void run() {
            try {
                if(out!=null) out.writeUTF(nickName);
                while (out != null){
                    out.writeUTF("["+nickName+"]"+
                            JOptionPane.showInputDialog("메세지를 입력하세요!"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static class Receiver  extends Thread{
        Socket socket;
        DataInputStream in;
        Receiver(Socket socket){
            this.socket = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (in !=null){
                try {
                    System.out.println(in.readUTF());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
