//Coded by Arn
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class LoginForm extends JFrame implements ActionListener
{
    JButton b1;
    JPanel Pl;
    JLabel L1, L2;
    final JTextField text1, text2;

    LoginForm()
    {
        //label 1
        L1 = new JLabel();
        L1.setText("Username");

        //text 1
        text1 = new JTextField(15);

        //label 2
        L2 = new JLabel();
        L2.setText("Password");

        //text 2
        text2 = new JTextField(15);

        //button
        b1 = new JButton("SUBMIT");

        //Panel
        Pl = new JPanel(new GridLayout(3,1));
        Pl.add(L1);
        Pl.add(text1);
        Pl.add(L2);
        Pl.add(text2);
        Pl.add(b1);

        add(Pl, BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("Welcome Arn");
    }
     @Override
    public void actionPerformed(ActionEvent e)
    {
        String Uvalue = text1.getText();
        String Pvalue = text2.getText();

        if (Uvalue.equals("Arn Christian")&& Pvalue.equals("arn123"))
        {
            NewPage page = new NewPage();
            page.setVisible(true);
            
            JLabel w_label = new JLabel("YAMETE KUDASAI UGHHHHHH!!!!!!");
            page.getContentPane().add(w_label);
        }
        else
        {
            System.out.println("Incorrect Username and Password");
        }
    }
}
class LoginFormDemo
{
    public static void main(String arg[])
    {
        try
        {
            LoginForm form = new LoginForm();
            form.setSize(300,100);
            form.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}