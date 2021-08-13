package swing;

import javax.swing.*;

public class TxtFrm extends BasicFrm{
    public static void main(String[] args) {new TxtFrm(700, 500, "Txt");}
    private JMenuBar menuBar;
    private JMenu memoFile , memoEdit, memoForm;
    private JMenuItem newMake, exCancel, font;
    private JTextField textField;
    public TxtFrm(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
    menuBar = new JMenuBar();
    memoFile = new JMenu("File");
    memoEdit = new JMenu("Edit");
    memoForm = new JMenu("Form");
    textField = new JTextField();
    newMake = new JMenuItem("newMake");
    exCancel = new JMenuItem("exCancel");
    font = new JMenuItem("font");
    menuBar.add(memoFile);
    memoFile.add(newMake);
    menuBar.add(memoEdit);
    memoEdit.add(exCancel);
    menuBar.add(memoForm);
    memoForm.add(font);
    setJMenuBar(menuBar);
    }

    @Override
    public void arrange() {
        add(textField);
    }
}
