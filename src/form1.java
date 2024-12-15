import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JPanel panel1;

    public form1() {
        add(panel1);
        setSize(400,200);
        setTitle("swing form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad,soyad;
                ad = textField1.getText();
                soyad = textField2.getText();
                System.out.println(ad+" "+soyad);
            }
        });
    }
}
