import javax.swing.*;
import java.awt.*;

public class  FRAME{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Error");
        JButton jButton=new JButton();
        jButton.setBounds(100,250,80,20);
        frame.add(jButton);
        JCheckBox checkbox1=new JCheckBox("piza 1000 Rupees");
        JCheckBox checkbox2=new JCheckBox("burger 400 Rupees");
        JCheckBox checkbox3=new JCheckBox("Tea 50 Rupees");
        checkbox1.setBounds(100,100,200,20);
        checkbox2.setBounds(100,150,200,20);
        checkbox3.setBounds(100,200,200,20);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.setVisible(true);
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.red);


    }
}
