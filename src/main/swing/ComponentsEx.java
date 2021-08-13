package swing;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;

import javax.swing.*;

public class ComponentsEx {
    public static void main(String[] args) {
        new MyComponents(700, 500, "Components");

    }
}


class MyComponents extends BasicFrm{
    JPanel pnlNorth, pnlCenter, pnlSouth;
    JRadioButton[] rbGender;
    JCheckBox[] cbHobby;
    ButtonGroup group;
    JTextArea ta;
    JScrollPane scp;
    JDatePanel datePanel;
    JDatePicker datePicker;

    public MyComponents(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pnlCenter = new JPanel(); //panel에 얹는작업
        pnlSouth = new JPanel(); //panel에 얹는작업
        pnlNorth = new JPanel();

        datePicker = new JDatePicker();
        datePanel = new JDatePanel();
        datePanel.add(datePicker);

        cbHobby = new JCheckBox[2];
        rbGender = new JRadioButton[2];
        group = new ButtonGroup();
        String [] genders = {"Female", "Male"};
        String [] hobbys = {"Reading", "Music"};
        for (int i = 0; i < genders.length; i++) {
            rbGender[i] = new JRadioButton(genders[i],(i==0)?true:false);
            group.add(rbGender[i]);
            cbHobby[i] = new JCheckBox(hobbys[i]);
            pnlCenter.add(cbHobby[i]);
            pnlSouth.add(rbGender[i]);
        }
        ta = new JTextArea(10, 20);
        scp = new JScrollPane(ta);
    }

    @Override
    public void arrange() {
        pnlNorth.add(datePanel);
        pnlNorth.add(datePicker);
        pnlNorth.add(scp);
        add(pnlNorth, "North");
        add(pnlCenter,"Center");
        add(pnlSouth, "South");

    }
}