package swing;

import javax.swing.*;
import java.awt.*;

public class MyFrameEx1 {
    public static void main(String[] args) {
//        MyFrm1 frm = new MyFrm1(500, 300,"MyFrm1");
//        // new라는 생성연산자를 만나서 생성자를 만듬(인스턴스를 만들기 위해 생성자가있음)
//        // 인스턴스 = 객체 초기화
        new MyFrm1(500,300,"hi");
    }
}

// JFrame, JPanel, JScrollPane 담을 수 있는 component 를 container에 담는다
class MyFrm1 extends BasicFrm {
//    private JLabel lbTitle;
//    private JButton btn, btn2, btn3, btn4, btn5;
    private JButton[] btns;
    private String[] arr;
    private JPanel[] pnl;

    public MyFrm1(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pnl = new JPanel[5];
        btns = new JButton[5];
        arr = new String[] {"North", "South", "Center", "East", "West"};
//        lbTitle = new JLabel("버튼을 눌러주세요");
        for (int i = 0; i < btns.length; i++) {
            pnl[i] = new JPanel();
        btns[i] = new JButton(arr[i]);
//        btns[i].setBounds(i*100, i*30, 100, 30); //좌표찍고 버튼사이즈
        pnl[i].add(btns[i], arr[i]);
        add(pnl[i]);
        }
    }

    @Override
    public void arrange() {
//        add(pnl);
        //JFrame의 디폴트 Layout은 BorderLayout이다
//        setLayout(null); //Absolute Layout 절대배치 (좌표를가져서 좌표를 지정해줘야함)
//        setLayout(new FlowLayout());
        setLayout(new GridLayout(2, 3));
    }
}