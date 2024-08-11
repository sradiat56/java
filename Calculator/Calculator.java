package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textfield; 
    JButton[] numButtons=new JButton[10];
    JButton[] funtionButtons=new JButton[9];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,equButton,delButton,clrButton,negButton;
    JPanel panel;
    Font myfont=new Font("Ink Free",Font.BOLD,30);

    double num1=0,num2=0,result=0;
    char operator;


    public Calculator(){
        frame =new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        textfield=new JTextField();
        textfield.setBounds(50,25,300,50);
        textfield.setFont(myfont);
        textfield.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("X");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");

        funtionButtons[0]=addButton;
        funtionButtons[1]=subButton;
        funtionButtons[2]=mulButton;
        funtionButtons[3]=divButton;
        funtionButtons[4]=decButton;
        funtionButtons[5]=equButton;
        funtionButtons[6]=delButton;
        funtionButtons[7]=clrButton;
        funtionButtons[8]=negButton;
        
        for(int i=0;i<9;i++){
            funtionButtons[i].addActionListener(this);
            funtionButtons[i].setFont(myfont);
            funtionButtons[i].setFocusable(false);
        }
        for(int i=0;i<10;i++){
            numButtons[i] =new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(myfont);
            numButtons[i].setFocusable(false);
        }
        
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);
        negButton.setBounds(50,430,100,50);

        panel =new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.DARK_GRAY);


        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addButton);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subButton);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc=new Calculator();

    }
    @Override
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<10;i++){
            if(e.getSource() == numButtons[i]){
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == decButton){
            textfield.setText(textfield.getText().concat("."));
        }
        if(e.getSource() == addButton){
            num1= Double.parseDouble(textfield.getText());
            operator='+';
            textfield.setText("");
        }
        if(e.getSource() == subButton){
            num1= Double.parseDouble(textfield.getText());
            operator='-';
            textfield.setText("");

        }
        if(e.getSource() == mulButton){
            num1= Double.parseDouble(textfield.getText());
            operator='X';
            textfield.setText("");
        }
        if(e.getSource() == divButton){
            num1= Double.parseDouble(textfield.getText());
            operator='/';
            textfield.setText("");
        }
        if(e.getSource() ==equButton){
            num2=Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case 'X':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;    
           
            }
            textfield.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource() == clrButton){
            textfield.setText("");
        }
        if(e.getSource() == delButton){
            String string= textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++){
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
        if(e.getSource() == negButton){
            Double temp =Double.parseDouble(textfield.getText());
            temp*=-1;
            textfield.setText(String.valueOf(temp));
        }
    }
    
}
