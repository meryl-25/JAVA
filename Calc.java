import java.awt.*;
import java.awt.event.*;

class Calc extends Frame implements ActionListener {

    Label L1,L2,L3;
    TextField T1,T2,T3;
    Button B1,B2,B3,B4;

    Calc() {

        setLayout(new FlowLayout());

        L1 = new Label("Number 1");
        T1 = new TextField(10);

        L2 = new Label("Number 2");
        T2 = new TextField(10);

        B1 = new Button("Add");
        B2 = new Button("Subtract");
        B3 = new Button("Multiply");
        B4 = new Button("Divide");
        
        L3 = new Label("Result");
        T3 = new TextField(10);

       
        add(L1);        
        add(T1);
        
        add(L2);    
        add(T2);

       
        add(B1);
        B1.addActionListener(this);

       
        add(B2);
        B2.addActionListener(this);

       
        add(B3);
        B3.addActionListener(this);

        
        add(B4);
        B4.addActionListener(this);

        
        add(L3);
        add(T3);
    }

    public void actionPerformed(ActionEvent ae) {

        int a, b, ans=0;
        String result;

        a = Integer.parseInt(T1.getText());
        b = Integer.parseInt(T2.getText());

        if(ae.getSource() == B1) {

            ans = a + b;
        }

        else if(ae.getSource() == B2) {

            ans = a - b;
        }

        else if(ae.getSource() == B3) {

            ans = a * b;
        }

        else if(ae.getSource() == B4) {

            ans = a / b;            
        }

        result = String.valueOf(ans);
        T3.setText(result);
    }

    public static void main(String args[]) {

        Calc obj = new Calc();
        obj.setSize(500,400);
        obj.setVisible(true);
    }
    

}