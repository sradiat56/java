package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ActionListenerExamp extends Frame implements ActionListener{
    Label lb;
    Button b;
    public ActionListenerExamp(){
        this.setVisible(true);
        this.setTitle("ActionExamp");
        this.setSize(500,500);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        lb=new Label();
        lb.setBounds(100,100,100,100);
        b=new Button();
        b.setBounds(200,200,60,30);

        this.add(lb);
        this.add(b);
        b.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        Font f=new Font("consolas",Font.BOLD,25);
        lb.setFont(f);
        lb.setText("hi");
    }
    public static void main(String[] args) {
        new ActionListenerExamp();
    }
}
