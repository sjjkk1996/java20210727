package swing;

import javax.swing.*;
import java.awt.*;

public class JoinFrm extends BasicFrm{
    public static void main(String[] args) {new JoinFrm(500, 700, "Join");}
    private JPanel pnl;
    private JLabel lbId,lbPw,lbName;
    private JTextField tfId;
    private JTextField tfPw;
    private JTextField tfName;
    private JButton btnJoin,btnCancel;
    public JoinFrm(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pnl = new JPanel();

        lbId = new JLabel("ID: ");
        add(lbId);
        tfId = new JTextField();
        add(tfId);
        lbPw = new JLabel("PW: ");
        add(lbPw);
        tfPw = new JTextField();
        add(tfPw);
        lbName = new JLabel("NAME: ");
        add(lbName);
        tfName = new JTextField();
        add(tfName);
        btnJoin = new JButton("Join");
        btnCancel = new JButton("Cancel");
        add(btnJoin);
        add(btnCancel);

    }

    @Override
    public void arrange() {
        setLayout(new GridLayout(4, 2));
    }
}
