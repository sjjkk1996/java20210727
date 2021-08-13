package swing;

import javax.swing.*;
import java.awt.*;

public class LoginFrm extends BasicFrm {
    public static void main(String[] args) {new LoginFrm(250, 150, "Login");}
    private JPanel pnlCenter, pnlSouth, pnlNorth;
    private JLabel lbId,lbPw;
    private JTextField tfId;
    private JPasswordField pfPass;
    private JButton btnLogin, btnCancel, btnJoin;

    public LoginFrm(int width, int height, String title) {super(width, height, title);}

    @Override
    public void init() {
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
        pnlNorth = new JPanel();
        lbId = new JLabel("ID: ");
        lbPw = new JLabel("PW: ");
        tfId = new JTextField(10);
        pfPass = new JPasswordField(10);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
        btnJoin = new JButton("Join");


    }

    @Override
    public void arrange() {
        pnlNorth.add(lbId);
        pnlNorth.add(tfId);
        pnlCenter.add(lbPw);
        pnlCenter.add(pfPass);
        pnlSouth.add(btnLogin);
        pnlSouth.add(btnCancel);
        pnlSouth.add(btnJoin);
        add(pnlCenter,"Center");
        add(pnlSouth, "South");
        add(pnlNorth,"North");
    }
}

