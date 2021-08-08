package Network2;

import javax.sound.midi.Receiver;
import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Net_JJC {
    public static void main(String[] args) {
        String nickName = JOptionPane.showInputDialog("채팅에서 사용할 이름 입력 바랍니다");
        String ip = JOptionPane.showInputDialog("접속할 서버 IP 입력 바랍니다");
        try {
            Socket socket = new Socket(ip, 7777);
            System.out.println("서버에 접속 되었습니다.");
            Sender sender = new Sender(socket, nickName);
            sender.start();
            Receiver receiver = new Receiver(socket);
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static class Sender extends Thread {
        Socket socket;
        DataOutputStream out;
        String nickName;
        static String chattingValue;
        public Sender(Socket socket, String nickName) {
            this.socket = socket;
            this.nickName = nickName;
            try {
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                if (out != null) out.writeUTF(nickName);
                while (out != null) {
                        out.writeUTF("[" + nickName + "]" + (chattingValue = JOptionPane.showInputDialog
                                ("이곳에서 메세지 입력하시면 됩니다. \n" + "('Q' 또는 'q' 입력시 채팅이 종료됩니다.)")));
//                        if(chattingValue.equals(null)||chattingValue.equals("")){
//                            continue;
//                        }

                     if(chattingValue.equals("Q")||chattingValue.equals("q")) {
                        System.out.println("'Q' 또는 'q' 를 입력하여 채팅이 종료되었습니다. :)");
                        break;
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        static class Receiver extends Thread{
            Socket socket;
            DataInputStream in;
            public Receiver(Socket socket){
                this.socket=socket;
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

