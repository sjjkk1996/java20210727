package swing;

import javax.swing.*;

public class ChattingFrm extends BasicFrm{
    public static void main(String[] args) {new ChattingFrm(500, 700, "Chtting");}
    private JPanel pnlCenter, pnlSouth;
    private JTextArea area;
    private JTextField field;
    public ChattingFrm(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        area = new JTextArea();
        field = new JTextField("",30);
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
    }

    @Override
    public void arrange() {
        add(area,"Center");
//        pnlCenter.add(area);
        add(field, "South");
    }
}
