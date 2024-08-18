package chatting.application;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;




public class Server implements ActionListener {

    JTextField text;
    JPanel a1;
   static Box vertical = Box.createVerticalBox();
   static JFrame f = new JFrame();
   static DataOutputStream dout;




    Server(){


        f.setLayout(null);

        // Frame size and color
        f.setSize(450, 700);  // frame siz
        f.setUndecorated(true);
        f.setLocation(150, 10);
        f.getContentPane() .setBackground(Color.WHITE);  // frame color




        //  Upper Frame

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));   // upper frame color by RGB
        p1.setBounds(0, 0, 450, 70);      // upper frame size
        p1.setLayout(null);
        f.add(p1);


        //  Backspace Icon

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));  // Icon image
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);  // Icon ka Size change kerny ka Treeqa
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25);  // Icon ki Location change kerny k liye
        p1.add(back);

        // Mouse clicked event means frame close ho jay ga icon per click kerny sy
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });

        // Profile Picture

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/dpRA.jpg"));  // profile image
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);  // image ka Size change kerny ka Treeqa
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50);  // image ki Location change kerny k liye
        p1.add(profile);

        // voice icon

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));  // profile image
        Image i8 = i7.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);  // image ka Size change kerny ka Treeqa
        ImageIcon i9 = new ImageIcon(i8);
        JLabel voice = new JLabel(i9);
        voice.setBounds(350, 20, 35, 30);  // image ki Location change kerny k liye
        p1.add(voice);

        // video icon

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));  // profile image
        Image i11 = i10.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);  // image ka Size change kerny ka Treeqa
        ImageIcon i12 = new ImageIcon(i11);
        JLabel video = new JLabel(i12);
        video.setBounds(300, 20, 30, 30);  // image ki Location change kerny k liye
        p1.add(video);

        //  dotes icon

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel dotes = new JLabel(i15);
        dotes.setBounds(410, 20, 10, 25);
        p1.add(dotes);
        dotes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Display menu bar action
                JPopupMenu menu = new JPopupMenu();
                JMenuItem clearChat = new JMenuItem("Clear Chat");
                JMenuItem media = new JMenuItem("Media");
                JMenuItem links = new JMenuItem("Links");
                JMenuItem settings = new JMenuItem("Settings");
                menu.add(clearChat);
                menu.add(media);
                menu.add(links);
                menu.add(settings);
                clearChat.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clearChat();
                    }
                });

                menu.show(dotes, 0, dotes.getHeight());
            }
        });
        // Name

        JLabel name = new JLabel("Rameez ");
        name.setBounds(110, 15, 100, 18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name);

        // Status

        JLabel status = new JLabel("online");
        status.setBounds(110, 35, 100, 18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 12));
        p1.add(status);

        // Chat Area



        a1 = new JPanel();
        a1.setBounds(5, 75, 440, 570);
        a1.setLayout(new BoxLayout(a1, BoxLayout.Y_AXIS));
        f.add(a1);

        // Text Area

        text = new JTextField();
        text.setBounds(5, 655, 335, 40);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN,16)); // For font size in text area
        f.add(text);

        // Send Button

        JButton send = new JButton("Send");
        send.setBounds(345, 655, 100, 40);
        send.setBackground(new Color(7, 94, 84));  // for Button background color
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        send.setFont(new Font("SAN_SERIF", Font.PLAIN,14));
        f.add(send);




        // setVisible (true) ko hamisha end per likhty hain
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        try {

            String out = text.getText();

            JLabel output = new JLabel(out);

            JPanel p2 = formatLabel(out);


            a1.setLayout(new BorderLayout());


            JPanel right = new JPanel(new BorderLayout());
            right.add(p2, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15));

            a1.add(vertical, BorderLayout.PAGE_START);

            dout.writeUTF(out);

            text.setText("");

            f.repaint();
            f.invalidate();
            f.validate();
        }  catch (Exception e){
            e.printStackTrace();
        }


    }
    public static <JLable> JPanel formatLabel(String out){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel output = new JLabel("<html><p style=\"width: 150px\">" + out + "</p></html>");
        output.setFont(new Font("Tahoma", Font.PLAIN, 16));// Text Size
        output.setBackground(new Color(37, 211,102));  //  Text color
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(15, 15, 15, 50));

        panel.add(output);

        // Set time

        Calendar cal =  Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));
        panel.add(time);

        return panel;

    }

    public static void main(String[] args){


        new Server();

        try {
            ServerSocket skt = new ServerSocket(6001);
            while (true){
                Socket s = skt.accept();
                DataInputStream din = new DataInputStream(s.getInputStream());
                dout = new DataOutputStream(s.getOutputStream());

                while (true){
                    String msg = din.readUTF();
                    JPanel panel = formatLabel(msg);

                    JPanel left = new JPanel(new BorderLayout());
                    left.add(panel, BorderLayout.LINE_START);
                    vertical.add(left);
                    f.validate();
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private void clearChat() {
        // Clear chat logic
        a1.removeAll();
        a1.revalidate();
        a1.repaint();
    }
}