package swing;

import org.jdatepicker.JDatePicker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JComboBoxJTableEx {
    public static void main(String[] args) {
        new SheetFrm(700, 500, "Sheet");
    }
}

class SheetFrm extends BasicFrm {
    private JMenuBar menuBar;
    private JMenu mnFile , mnInfo;
    private JMenuItem miOpen, miSave, miInfo;
    private JPanel pnl;
    private String[] arr;
    private JComboBox<String> cb;
    private JTextField tf;
    private JDatePicker dp;
    private JButton btnAdd, btnDel;
    private JTable table;
    private JScrollPane pane;
    private DefaultTableModel model;

    public SheetFrm(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        model = new DefaultTableModel(new String[]{"Date","Item","E/A"},0);
        table = new JTable(model);
        pane = new JScrollPane(table);
        tf = new JTextField(10);
        dp = new JDatePicker();
        btnAdd = new JButton("Add");btnDel = new JButton("Del");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar valDate = (Calendar) dp.getModel().getValue();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal = (Calendar) valDate;
                String dateStr = sdf.format(cal.getTimeInMillis());
                String item = cb.getSelectedItem().toString();
                String ea = tf.getText();
                String[] arrRow = {dateStr, item, ea};
                model.addRow(arrRow);
            }
        });
        //btnAdd를 람다식으로하면 btnDel과 같이 시작가능
        btnDel.addActionListener(e->{
            int row = table.getSelectedRow();
            if (row==-1){
                JOptionPane.showMessageDialog(this, "No Selected Row");
                return;
            }
            model.removeRow(row);
        });
        arr = new String[]{"IceAmericano","Cappucino","DolceLatte","Cocoa","Milk"};
        cb = new JComboBox<>(arr);
        pnl = new JPanel();
        menuBar = new JMenuBar();
        mnFile = new JMenu("File");
        mnFile.setMnemonic('F');// alt + f 를 타이핑하면 마우스로 클릭한 현상이 일어남
        mnInfo = new JMenu("Info");
        mnInfo.setMnemonic('I');// alt + i 를 타이핑하면 마우스로 클릭한 현상이 일어남
        miOpen = new JMenuItem("Open");
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
        miOpen.addActionListener( e -> System.out.println("Open"));
        miSave = new JMenuItem("Save");
        miInfo = new JMenuItem("Info");
        mnFile.add(miOpen);mnFile.add(miSave);
        mnInfo.add(miInfo);
        menuBar.add(mnFile);menuBar.add(mnInfo);
        setJMenuBar(menuBar);
    }

    @Override
    public void arrange() {
        pnl.add(dp);pnl.add(cb);pnl.add(tf);pnl.add(btnAdd);pnl.add(btnDel);
        add(pnl,"North");
        add(pane,"Center");
    }
}