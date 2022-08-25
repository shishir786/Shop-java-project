package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.io.*;
import java.awt.Cursor;
import java.time.*;
import java.time.format.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDashBoard2 {

    JFrame frame;
    JLabel label1, label2, label3, label4, lp1;
    JLabel lebel1, lebel2, lebel3, lebel4, lebel5, lebel6, lebel7, lebel8, lebel9, lebel10, lebel11, lebel12, lebel13,
            lebel14, lebel15, lebel16, lebel17, lebel18, lebel19, lebel99;
    JPanel panel1;
    JLabel lf1, lf2, lf3, lf4, lf5, lf6, lf7, lf8, lf9;
    JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    JRadioButton Box1, Box2, Box3;
    ButtonGroup bg;
    JCheckBox c;
    JComboBox religion, securityQsn;
    ImageIcon i1;

    AdminDashBoard2(String textField1) {

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        lebel99 = new JLabel();
        lebel99.setIcon(new ImageIcon("image/registration.jpg"));
        Dimension size = lebel99.getPreferredSize();
        lebel99.setBounds(0, 0, size.width, size.height);

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("image/back.png"));
        Dimension size1 = label1.getPreferredSize();
        label1.setBounds(0, 0, size1.width, size1.height);

        b1 = new JButton("X");
        b1.setBounds(1320, 4, 30, 40);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(1290, 4, 25, 30);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton();
        b3.setIcon(new ImageIcon("image/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);

        b4 = new JButton("Add New User");
        b4.setBounds(832, 660, 400, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 20));
        b4.setBackground(Color.GREEN);
        b4.setForeground(Color.black);
        b4.setFocusPainted(false);

        label2 = new JLabel("Add New User");
        label2.setBounds(800, 50, 500, 60);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 40));

        lebel2 = new JLabel("First Name");
        lebel2.setBounds(800, 120, 200, 40);
        lebel2.setForeground(Color.black);
        lebel2.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field1 = new JTextField();
        field1.setBounds(805, 150, 230, 30);
        field1.setForeground(Color.black);
        field1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field1.setBorder(null);
        field1.setOpaque(false);
        lf1 = new JLabel("___________________________________");
        lf1.setBounds(800, 155, 250, 40);
        lf1.setForeground(Color.black);

        lebel3 = new JLabel("Surname");
        lebel3.setBounds(1100, 120, 200, 40);
        lebel3.setForeground(Color.black);
        lebel3.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field2 = new JTextField();
        field2.setBounds(1105, 150, 180, 30);
        field2.setForeground(Color.black);
        field2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field2.setBorder(null);
        field2.setOpaque(false);
        lf2 = new JLabel("___________________________");
        lf2.setBounds(1100, 155, 200, 40);
        lf2.setForeground(Color.black);

        lebel4 = new JLabel("Date of Birth (dd/mm/yyyy)");
        lebel4.setBounds(800, 190, 250, 40);
        lebel4.setForeground(Color.black);
        lebel4.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field3 = new JTextField();
        field3.setBounds(805, 220, 230, 30);
        field3.setForeground(Color.black);
        field3.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field3.setBorder(null);
        field3.setOpaque(false);
        lf3 = new JLabel("___________________________________");
        lf3.setBounds(800, 225, 250, 40);
        lf3.setForeground(Color.black);

        lebel5 = new JLabel("Religion");
        lebel5.setBounds(1100, 190, 250, 40);
        lebel5.setForeground(Color.black);
        lebel5.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        String[] option = { "Choose Religion", "Islam", "Hinduism",
                "Christianity", "Sikhism", "Buddhism" };
        religion = new JComboBox(option);
        religion.setBounds(1180, 200, 120, 26);
        religion.setSelectedIndex(0);
        // religion.setBackground(Color.black);

        lebel6 = new JLabel("Gender");
        lebel6.setBounds(800, 260, 300, 40);
        lebel6.setForeground(Color.black);
        lebel6.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        bg = new ButtonGroup();

        Box1 = new JRadioButton("Male");
        Box1.setBounds(880, 270, 100, 25);
        Box1.setForeground(Color.black);
        Box1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box1.setFocusPainted(false);
        Box1.setBorderPainted(false);
        Box1.setContentAreaFilled(false);

        Box2 = new JRadioButton("Female");
        Box2.setForeground(Color.black);
        Box2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box2.setBounds(980, 270, 100, 25);
        Box2.setFocusPainted(false);
        Box2.setBorderPainted(false);
        Box2.setContentAreaFilled(false);

        Box3 = new JRadioButton("Other");
        Box3.setForeground(Color.black);
        Box3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box3.setBounds(1090, 270, 100, 25);
        Box3.setFocusPainted(false);
        Box3.setBorderPainted(false);
        Box3.setContentAreaFilled(false);

        lebel7 = new JLabel("Email");
        lebel7.setBounds(800, 300, 300, 40);
        lebel7.setForeground(Color.black);
        lebel7.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field4 = new JTextField();
        field4.setBounds(805, 330, 380, 30);
        field4.setForeground(Color.black);
        field4.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field4.setBorder(null);
        field4.setOpaque(false);
        lf4 = new JLabel("_________________________________________________________");
        lf4.setBounds(800, 335, 400, 40);
        lf4.setForeground(Color.black);

        lebel10 = new JLabel("User Name");
        lebel10.setBounds(800, 370, 200, 40);
        lebel10.setForeground(Color.black);
        lebel10.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field5 = new JTextField();
        field5.setBounds(805, 400, 200, 30);
        field5.setForeground(Color.black);
        field5.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field5.setBorder(null);
        field5.setOpaque(false);
        lf5 = new JLabel("_______________________________");
        lf5.setBounds(800, 405, 220, 40);
        lf5.setForeground(Color.black);

        lebel11 = new JLabel("Password");
        lebel11.setBounds(800, 440, 200, 40);
        lebel11.setForeground(Color.black);
        lebel11.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field6 = new JTextField();
        field6.setBounds(805, 470, 200, 30);
        field6.setForeground(Color.black);
        field6.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field6.setBorder(null);
        field6.setOpaque(false);
        lf6 = new JLabel("_______________________________");
        lf6.setBounds(800, 475, 220, 40);
        lf6.setForeground(Color.black);

        lebel12 = new JLabel("Re-type Password");
        lebel12.setBounds(1100, 440, 200, 40);
        lebel12.setForeground(Color.black);
        lebel12.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field7 = new JTextField();
        field7.setBounds(1105, 470, 200, 30);
        field7.setForeground(Color.black);
        field7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        field7.setBorder(null);
        field7.setOpaque(false);
        lf7 = new JLabel("_______________________________");
        lf7.setBounds(1100, 475, 220, 40);
        lf7.setForeground(Color.black);

        lebel13 = new JLabel("Security Questions");
        lebel13.setBounds(800, 515, 300, 40);
        lebel13.setForeground(Color.black);
        lebel13.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        String[] secQsn = { "Choose a Security Question...", "what's your father's name?", "what's your mother's name?",
                "whats your favourite pet name?", "what's your favorite sports?", "what's your favourite movie?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(955, 525, 250, 25);
        securityQsn.setSelectedIndex(0);
        // securityQsn.setBackground(Color.black);

        lebel14 = new JLabel("Text your Answer");
        lebel14.setBounds(800, 560, 320, 30);
        lebel14.setForeground(Color.black);
        lebel14.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field8 = new JTextField();
        field8.setBounds(995, 560, 200, 30);
        field8.setForeground(Color.black);
        field8.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        field8.setBorder(null);
        field8.setOpaque(false);
        lf8 = new JLabel("______________________________");
        lf8.setBounds(990, 565, 220, 40);
        lf8.setForeground(Color.black);

        lebel15 = new JLabel();
        lebel15.setText("Captcha");
        lebel15.setBounds(800, 600, 200, 30);
        lebel15.setForeground(Color.black);
        lebel15.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        // To get a random number for captcha
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);

        // Captcha
        lebel16 = new JLabel();
        lebel16.setText("   " + a + " + " + b + "  ");
        lebel16.setBounds(880, 602, 75, 30);
        lebel16.setForeground(Color.black);
        lebel16.setBackground(Color.decode("#FFD3D3"));
        lebel16.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lebel16.setBorder(null);
        lebel16.setOpaque(true);

        field9 = new JTextField();
        field9.setBounds(995, 602, 200, 30);
        field9.setForeground(Color.black);
        field9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        field9.setBorder(null);
        field9.setOpaque(false);
        lf9 = new JLabel("______________________________");
        lf9.setBounds(990, 602, 220, 40);
        lf9.setForeground(Color.black);

        label3 = new JLabel("User :" + " " + textField1);
        label3.setBounds(1150, 50, 120, 25);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        b12 = new JButton("Sign Out");
        b12.setBounds(1260, 50, 90, 25);
        b12.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setFocusPainted(false);
        b12.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setContentAreaFilled(false);

        frame.add(label3);
        frame.add(b12);

        // adding lebel

        frame.add(label1);
        frame.add(label2);

        // regiii
        frame.add(lebel2);
        frame.add(lebel3);
        frame.add(lebel4);
        frame.add(lebel5);
        frame.add(lebel6);
        frame.add(lebel7);
        frame.add(lebel10);
        frame.add(lebel11);
        frame.add(lebel12);
        frame.add(lebel13);
        frame.add(lebel14);
        frame.add(lebel15);
        frame.add(lebel16);

        // field

        frame.add(field1);
        frame.add(field2);
        frame.add(field3);
        frame.add(field4);
        frame.add(field5);
        frame.add(field6);
        frame.add(field7);
        frame.add(field8);
        frame.add(field9);

        // adding extra lebel for " __________ "

        frame.add(lf1);
        frame.add(lf2);
        frame.add(lf3);
        frame.add(lf4);
        frame.add(lf5);
        frame.add(lf6);
        frame.add(lf7);
        frame.add(lf8);
        frame.add(lf9);

        // adding button

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        // r button
        frame.add(Box1);
        frame.add(Box2);
        frame.add(Box3);
        bg.add(Box1);
        bg.add(Box2);
        bg.add(Box3);

        // add
        frame.add(label1);
        frame.add(lebel99);
        frame.add(securityQsn);
        frame.add(religion);

        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        // Action
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    frame.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2) {
                    frame.setState(Frame.ICONIFIED);
                }

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new AdminDashBoard(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textField1 = field1.getText(); // First Name
                String textField2 = field2.getText(); // Sure Name
                String textField3 = field3.getText(); // Date Of Birth
                String textField4 = field4.getText(); // Email
                String textField5 = field5.getText().toLowerCase(); // User Name
                String textField6 = field6.getText(); // Password
                String textField7 = field7.getText(); // Retype Password
                String textField8 = field8.getText(); // Security Question Answer
                String textField9 = field9.getText(); // Capcha
                String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question
                int result = 0;

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                        || textField5.isEmpty() || textField6.isEmpty() || textField7.isEmpty()
                        || textField8.isEmpty()
                        || textField9.isEmpty() || ((religion.getSelectedIndex()) == 0)
                        || ((securityQsn.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);

                } else {

                    String string17 = field9.getText();
                    int myInteger = 0;
                    try {
                        myInteger = Integer.parseInt(string17);
                    } catch (Exception ef) {

                        showMessageDialog(null, "Whrong captcha input ", "null", 2);
                        ef.printStackTrace();
                    }

                    result = Integer.parseInt(field9.getText());

                    if (textField9.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);

                    }

                    else if (result != (a + b)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    } else if (!textField6.equals(textField7)) {
                        showMessageDialog(null, "Password & Re-type Password must be same", "null", 2);
                    }

                    else {

                        try {
                            File file = new File(".\\Data\\user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name : " + textField5);
                            pw.println("Password : " + textField6);
                            pw.println("Email : " + textField4);
                            pw.println("Security Question : " + secQsn);
                            pw.println("Answer : " + textField8);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                            JOptionPane.showMessageDialog(null,
                                    "User Added Successfully",
                                    "Registration Complete", JOptionPane.WARNING_MESSAGE);
                            new AdminDashBoard2(textField1);
                            frame.setVisible(false);

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        // frame2.setVisible(true);
                    }
                }
            }
        });

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b12) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
