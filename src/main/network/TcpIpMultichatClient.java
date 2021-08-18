package network;

import javafx.scene.control.Skin;
import swing.BasicFrm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpIpMultichatClient extends BasicFrm {
  private JTextArea ta;
  private JScrollPane scp;
  private JTextField tf;
  private String nickName, ip;
  private DataOutputStream out;

  public TcpIpMultichatClient() {
    super(500, 600, "Chatting Room");
    tf.requestFocus();
  }

  @Override
  public void init() {
      nickName = JOptionPane.showInputDialog("Input Your ID!");
      String ip = JOptionPane.showInputDialog("Input Server IP!","192.168.0.127");


      ta = new JTextArea();
      ta.setEditable(false); //나온 채팅을 수정하지 못하도록 하게함
    scp = new JScrollPane(ta);
    tf = new JTextField();
    ta.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
    tf.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      try {
          Socket socket = new Socket(ip, 7777);
          out = new DataOutputStream(socket.getOutputStream());
          out.writeUTF(nickName);
          Receiver receiver = new Receiver(socket);
          receiver.start();
      } catch (IOException e) {
          e.printStackTrace();
      }
    //sender thread를 tf에서 사용 할 수 있게끔 함 람다식 사용했음
    tf.addActionListener(e -> {
            String msg = tf.getText();
            if(msg==null||msg.equals("")) return;
//            //IgnoreCase는 대소문자 구분안하고 넣어도 인정해줌
//            if(msg.equalsIgnoreCase("Q")) {
//                JOptionPane.showInputDialog(null,"Chatting is terminated");
//                System.exit(-1);
//            } window(swing)에서는 닫기버튼이 존재해서 필요하진 않음 콘솔에서만 필요한 코드임
            try {
                out.writeUTF("["+nickName+"] "+msg);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            tf.setText(""); //메세지 보내면 tf에있는 채팅보낸 내용을 털어줌(빈칸으로 만듬)
    });
  }

  @Override
  public void arrange() {
    add(scp, "Center");
    add(tf, "South");
  }

  public static void main(String[] args) {
      new TcpIpMultichatClient();
  }

   class Receiver extends Thread {
    Socket socket;
    DataInputStream in;
    Receiver(Socket socket){
      this.socket = socket;
      try {in = new DataInputStream(socket.getInputStream());}catch(IOException e){}
    }

    @Override
    public void run() {
      while (in != null) {
        try {
//          System.out.println(in.readUTF());
            ta.append(in.readUTF()+"\n");
            ta.setCaretPosition(ta.getDocument().getLength());
            //커서가 채팅을 계속 따라가면서 스크롤로 내려가도 자동으로 같이 화면이 내려가게 만듬
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}