package swing;

import javax.swing.*;
import java.awt.*;

public class JoinFrm extends BasicFrm{
    public static void main(String[] args) {new JoinFrm(500, 700, "Join");}
    private JPanel pnlId, pnlPw, pnlName, pnlBtn;
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
        pnlId = new JPanel();
        pnlPw = new JPanel();
        pnlName = new JPanel();
        pnlBtn = new JPanel();

        lbId = new JLabel("ID: ");
        pnlId.add(lbId);
        tfId = new JTextField(10);
        pnlId.add(tfId);
        lbPw = new JLabel("PW: ");
        pnlPw.add(lbPw);
        tfPw = new JTextField(10);
        pnlPw.add(tfPw);
        lbName = new JLabel("NAME: ");
        pnlName.add(lbName);
        tfName = new JTextField(10);
        pnlName.add(tfName);
        btnJoin = new JButton("Join");
        btnCancel = new JButton("Cancel");
        pnlBtn.add(btnJoin);
        pnlBtn.add(btnCancel);
        add(pnlId);
        add(pnlPw);
        add(pnlName);
        add(pnlBtn);

    }

    @Override
    public void arrange() {

        setLayout(new GridLayout(4, 2));
    }
}
