package Classes;

import java.lang.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.Cursor;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.awt.EventQueue;

import static javax.swing.JOptionPane.showMessageDialog;

public class Registration extends registrationC {

    JFrame frame1;
    JPanel panel1;
    JLabel lebel1, lebel2, lebel3, lebel4, lebel5, lebel6, lebel7, lebel8, lebel9, lebel10, lebel11, lebel12, lebel13,
            lebel14, lebel15, lebel16, lebel17, lebel18, lebel19,
            lebel99;
    JLabel lf1, lf2, lf3, lf4, lf5, lf6, lf7, lf8, lf9;
    JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9;
    JButton button1, button2, button3, button4, button5;
    JRadioButton Box1, Box2, Box3;
    ButtonGroup bg;
    JCheckBox c;
    JComboBox religion, securityQsn;
    ImageIcon i1;

    Registration(String textField5, String textField6, String textField4, String textField8, String secQsna) {
        super(textField5, textField6, textField4, textField8, secQsna);

        frame1 = new JFrame();
        frame1.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame1.setIconImage(i1.getImage());

        panel1 = new JPanel();
        panel1.setBounds(700, 00, 666, 768);
        panel1.setBackground(new Color(25, 118, 211));

        button1 = new JButton("X");
        button1.setBounds(1320, 4, 30, 40);
        button1.setFont(new Font("Segeo UI", Font.BOLD, 20));
        button1.setForeground(Color.WHITE);
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1.setContentAreaFilled(false);

        button2 = new JButton("Submit");
        button2.setBounds(832, 660, 400, 40);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        button2.setBackground(Color.GREEN);
        button2.setForeground(Color.black);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setFocusPainted(false);

        button3 = new JButton("-");
        button3.setBounds(1290, 0, 25, 40);
        button3.setFont(new Font("Segeo UI", Font.BOLD, 40));
        button3.setForeground(Color.WHITE);
        button3.setBorderPainted(false);
        button3.setFocusPainted(false);
        button3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3.setContentAreaFilled(false);

        button4 = new JButton();
        button4.setIcon(new ImageIcon("image/return.png"));
        button4.setBounds(15, 8, 35, 40);
        button4.setFont(new Font("Segeo UI", Font.BOLD, 40));
        button4.setForeground(Color.WHITE);
        button4.setBorderPainted(false);
        button4.setFocusPainted(false);
        button4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button4.setContentAreaFilled(false);

        button5 = new JButton("Login");
        button5.setBounds(1100, 710, 105, 30);
        button5.setFont(new Font("Segoe UI", Font.BOLD, 18));
        button5.setForeground(Color.WHITE);
        button5.setBorderPainted(false);
        button5.setFocusPainted(false);
        button5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button5.setContentAreaFilled(false);

        lebel1 = new JLabel("Create Account");
        lebel1.setBounds(890, 30, 300, 60);
        lebel1.setForeground(Color.white);
        lebel1.setFont(new Font("Default", Font.BOLD, 40));

        lebel2 = new JLabel("First Name");
        lebel2.setBounds(800, 120, 200, 40);
        lebel2.setForeground(Color.white);
        lebel2.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field1 = new JTextField();
        field1.setBounds(805, 150, 230, 30);
        field1.setForeground(Color.white);
        field1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field1.setCaretColor(Color.white);
        field1.setBorder(null);
        field1.setOpaque(false);
        lf1 = new JLabel("___________________________________");
        lf1.setBounds(800, 155, 250, 40);
        lf1.setForeground(Color.white);

        lebel3 = new JLabel("Surname");
        lebel3.setBounds(1100, 120, 200, 40);
        lebel3.setForeground(Color.white);
        lebel3.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field2 = new JTextField();
        field2.setBounds(1105, 150, 180, 30);
        field2.setForeground(Color.white);
        field2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field2.setCaretColor(Color.white);
        field2.setBorder(null);
        field2.setOpaque(false);
        lf2 = new JLabel("___________________________");
        lf2.setBounds(1100, 155, 200, 40);
        lf2.setForeground(Color.white);

        lebel4 = new JLabel("Date of Birth (dd/mm/yyyy)");
        lebel4.setBounds(800, 190, 250, 40);
        lebel4.setForeground(Color.white);
        lebel4.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field3 = new JTextField();
        field3.setBounds(805, 220, 230, 30);
        field3.setForeground(Color.white);
        field3.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field3.setCaretColor(Color.white);
        field3.setBorder(null);
        field3.setOpaque(false);
        lf3 = new JLabel("___________________________________");
        lf3.setBounds(800, 225, 250, 40);
        lf3.setForeground(Color.white);

        lebel5 = new JLabel("Religion");
        lebel5.setBounds(1100, 190, 250, 40);
        lebel5.setForeground(Color.white);
        lebel5.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        String[] option = { "Choose Religion", "Islam", "Hinduism",
                "Christianity", "Sikhism", "Buddhism" };
        religion = new JComboBox(option);
        religion.setBounds(1180, 200, 120, 26);
        religion.setSelectedIndex(0);
        religion.setBackground(Color.white);

        lebel6 = new JLabel("Gender");
        lebel6.setBounds(800, 260, 300, 40);
        lebel6.setForeground(Color.white);
        lebel6.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        bg = new ButtonGroup();

        Box1 = new JRadioButton("Male");
        Box1.setBounds(880, 270, 100, 25);
        Box1.setForeground(Color.white);
        Box1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box1.setFocusPainted(false);
        Box1.setBorderPainted(false);
        Box1.setContentAreaFilled(false);

        Box2 = new JRadioButton("Female", true);
        Box2.setForeground(Color.white);
        Box2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box2.setBounds(980, 270, 100, 25);
        Box2.setFocusPainted(false);
        Box2.setBorderPainted(false);
        Box2.setContentAreaFilled(false);

        Box3 = new JRadioButton("Other", true);
        Box3.setForeground(Color.white);
        Box3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box3.setBounds(1090, 270, 100, 25);
        Box3.setFocusPainted(false);
        Box3.setBorderPainted(false);
        Box3.setContentAreaFilled(false);

        lebel7 = new JLabel("Email");
        lebel7.setBounds(800, 300, 300, 40);
        lebel7.setForeground(Color.white);
        lebel7.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field4 = new JTextField();
        field4.setBounds(805, 330, 380, 30);
        field4.setForeground(Color.white);
        field4.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field4.setCaretColor(Color.white);
        field4.setBorder(null);
        field4.setOpaque(false);
        lf4 = new JLabel("_________________________________________________________");
        lf4.setBounds(800, 335, 400, 40);
        lf4.setForeground(Color.white);

        lebel9 = new JLabel("Already have an account?");
        lebel9.setBounds(920, 710, 320, 30);
        lebel9.setForeground(Color.white);
        lebel9.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        lebel10 = new JLabel("User Name");
        lebel10.setBounds(800, 370, 200, 40);
        lebel10.setForeground(Color.white);
        lebel10.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field5 = new JTextField();
        field5.setBounds(805, 400, 200, 30);
        field5.setForeground(Color.white);
        field5.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field5.setCaretColor(Color.white);
        field5.setBorder(null);
        field5.setOpaque(false);
        lf5 = new JLabel("_______________________________");
        lf5.setBounds(800, 405, 220, 40);
        lf5.setForeground(Color.white);

        lebel11 = new JLabel("Password");
        lebel11.setBounds(800, 440, 200, 40);
        lebel11.setForeground(Color.white);
        lebel11.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field6 = new JTextField();
        field6.setBounds(805, 470, 200, 30);
        field6.setForeground(Color.white);
        field6.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field6.setCaretColor(Color.white);
        field6.setBorder(null);
        field6.setOpaque(false);
        lf6 = new JLabel("_______________________________");
        lf6.setBounds(800, 475, 220, 40);
        lf6.setForeground(Color.white);

        lebel12 = new JLabel("Re-type Password");
        lebel12.setBounds(1100, 440, 200, 40);
        lebel12.setForeground(Color.white);
        lebel12.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field7 = new JTextField();
        field7.setBounds(1105, 470, 200, 30);
        field7.setForeground(Color.white);
        field7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        field7.setCaretColor(Color.white);
        field7.setBorder(null);
        field7.setOpaque(false);
        lf7 = new JLabel("_______________________________");
        lf7.setBounds(1100, 475, 220, 40);
        lf7.setForeground(Color.white);

        lebel13 = new JLabel("Security Questions");
        lebel13.setBounds(800, 515, 300, 40);
        lebel13.setForeground(Color.white);
        lebel13.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        String[] secQsn = { "Choose a Security Question...", "what's your father's name?", "what's your mother's name?",
                "whats your favourite pet name?", "what's your favorite sports?", "what's your favourite movie?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(955, 525, 250, 25);
        securityQsn.setSelectedIndex(0);
        securityQsn.setBackground(Color.white);

        lebel14 = new JLabel("Text your Answer");
        lebel14.setBounds(800, 560, 320, 30);
        lebel14.setForeground(Color.white);
        lebel14.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field8 = new JTextField();
        field8.setBounds(995, 560, 200, 30);
        field8.setForeground(Color.white);
        field8.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        field8.setCaretColor(Color.white);
        field8.setBorder(null);
        field8.setOpaque(false);
        lf8 = new JLabel("______________________________");
        lf8.setBounds(990, 565, 220, 40);
        lf8.setForeground(Color.white);

        lebel15 = new JLabel();
        lebel15.setText("Captcha");
        lebel15.setBounds(800, 600, 200, 30);
        lebel15.setForeground(Color.white);
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
        field9.setForeground(Color.white);
        field9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        field9.setCaretColor(Color.white);
        field9.setBorder(null);
        field9.setOpaque(false);
        lf9 = new JLabel("______________________________");
        lf9.setBounds(990, 605, 220, 40);
        lf9.setForeground(Color.white);

        lebel99 = new JLabel();
        lebel99.setIcon(new ImageIcon("image/registration.jpg"));
        Dimension size = lebel99.getPreferredSize();
        lebel99.setBounds(0, 0, size.width, size.height);

        // adding all level
        frame1.add(lebel1);
        frame1.add(lebel2);
        frame1.add(lebel3);
        frame1.add(lebel4);
        frame1.add(lebel5);
        frame1.add(lebel6);
        frame1.add(lebel7);
        frame1.add(lebel9);
        frame1.add(lebel10);
        frame1.add(lebel11);
        frame1.add(lebel12);
        frame1.add(lebel13);
        frame1.add(lebel14);
        frame1.add(lebel15);
        frame1.add(lebel16);

        // adding all button
        frame1.add(button1);
        frame1.add(button2);
        frame1.add(button3);
        frame1.add(button4);
        frame1.add(button5);

        // adding all text field
        frame1.add(field1);
        frame1.add(field2);
        frame1.add(field3);
        frame1.add(field4);
        frame1.add(field5);
        frame1.add(field6);
        frame1.add(field7);
        frame1.add(field8);
        frame1.add(field9);

        // adding extra lebel for " __________ "
        frame1.add(lf1);
        frame1.add(lf2);
        frame1.add(lf3);
        frame1.add(lf4);
        frame1.add(lf5);
        frame1.add(lf6);
        frame1.add(lf7);
        frame1.add(lf8);
        frame1.add(lf9);

        // add
        frame1.add(Box1);
        frame1.add(Box2);
        frame1.add(Box3);
        bg.add(Box1);
        bg.add(Box2);
        bg.add(Box3);
        frame1.add(religion);
        frame1.add(securityQsn);

        // adding panel
        frame1.add(lebel99);
        frame1.add(panel1);

        frame1.setSize(1366, 768);
        frame1.setLayout(null);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);

        // Action Listener
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button1) {
                    if (e.getSource().equals(button1)) {

                        frame1.setVisible(false);
                    }
                }
            }
        });

        button2.addActionListener(new ActionListener() {
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
                String secQsna = String.valueOf(securityQsn.getSelectedItem()); // Security Question
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

                        registration(textField5, textField6, textField4, textField8, secQsna);

                        if (s == 1) {
                            frame1.setVisible(false);
                        }

                    }
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button3) {
                    if (e.getSource().equals(button3)) {

                        frame1.setState(frame1.ICONIFIED);

                    }
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button4) {
                    new Login("textField1", "textField2");
                    frame1.setVisible(false);
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button5) {
                    new Login("textField1", "textField2");
                    frame1.setVisible(false);
                }
            }
        });

    }
}