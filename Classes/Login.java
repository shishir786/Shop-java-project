package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import java.nio.file.*;
import java.util.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends logC {
    JFrame f1;
    JPanel p1;
    JPanel p2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JCheckBox c1;
    JComboBox religion;
    ImageIcon i1;
    JRadioButton r1, r2;
    ButtonGroup bg1;
    int pc = 0;

    Login(String textField1, String textField2) {
        super(textField1, textField2);

        f1 = new JFrame();
        f1.setUndecorated(true);
        // this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        i1 = new ImageIcon("image/logo.png");
        f1.setIconImage(i1.getImage());

        p1 = new JPanel();
        p1.setBounds(0, 0, 1366, 768);
        p1.setBackground(new Color(25, 118, 211));

        l1 = new JLabel("Log In");
        l1.setBounds(1000, 120, 200, 60);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 35));

        l2 = new JLabel("Hello! Let's get started");
        l2.setBounds(950, 170, 300, 40);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l3 = new JLabel("User Name");
        l3.setBounds(850, 280, 300, 40);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l4 = new JLabel("Password");
        l4.setBounds(850, 380, 150, 40);
        l4.setForeground(Color.white);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l5 = new JLabel("Created By Group 8");
        l5.setBounds(280, 630, 400, 40);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l6 = new JLabel("________________________________________________________");
        l6.setBounds(850, 330, 400, 40);
        l6.setForeground(Color.white);
        l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l7 = new JLabel("________________________________________________________");
        l7.setBounds(850, 430, 400, 40);
        l7.setForeground(Color.white);
        l7.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l8 = new JLabel();
        l8.setIcon(new ImageIcon("image/login.jpg"));
        Dimension size = l8.getPreferredSize();
        l8.setBounds(0, 0, size.width, size.height);

        l9 = new JLabel("Don't have an account?");
        l9.setBounds(890, 630, 240, 40);
        l9.setForeground(Color.white);
        l9.setFont(new Font("Segoe UI", Font.PLAIN, 22));

        l10 = new JLabel();
        l10.setIcon(new ImageIcon("image/icon.png"));
        l10.setBounds(1250, 300, 80, 80);
        l10.setForeground(Color.white);
        l10.setFont(new Font("Segoe UI", Font.PLAIN, 25));

        tf1 = new JTextField();
        tf1.setBounds(855, 320, 380, 30);
        tf1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        tf1.setForeground(Color.white);
        tf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tf1.setCaretColor(Color.white);
        tf1.setBorder(null);
        tf1.setOpaque(false);

        pf1 = new JPasswordField();
        pf1.setBounds(855, 420, 380, 30);
        pf1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        pf1.setForeground(Color.white);
        pf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pf1.setCaretColor(Color.white);
        pf1.setBorder(null);
        pf1.setOpaque(false);

        c1 = new JCheckBox("Remember me");
        c1.setBounds(850, 470, 160, 40);
        c1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        c1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c1.setForeground(Color.white);
        c1.setFocusPainted(false);
        c1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        c1.setContentAreaFilled(false);

        b1 = new JButton("X");
        b1.setBounds(1320, 4, 30, 40);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("Forgot Password?");
        b2.setBounds(1080, 470, 170, 40);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton("Login");
        b3.setBounds(850, 550, 400, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setForeground(new Color(25, 118, 211));
        b3.setBackground(new Color(255, 255, 255));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);

        b4 = new JButton("Sign Up");
        b4.setBounds(1115, 630, 90, 40);
        b4.setForeground(Color.white);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 20));
        b4.setForeground(new Color(255, 255, 255));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setContentAreaFilled(false);

        b5 = new JButton();
        b5.setIcon(new ImageIcon("image/icon2.png"));
        b5.setBounds(1250, 430, 25, 20);
        b5.setForeground(Color.white);
        b5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        b5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b5.setContentAreaFilled(false);

        b6 = new JButton();
        b6.setIcon(new ImageIcon("image/icon3.png"));
        b6.setBounds(1250, 430, 25, 20);
        b6.setForeground(Color.white);
        b6.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
        b6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b6.setContentAreaFilled(false);
        b6.setVisible(false);

        b7 = new JButton("-");
        b7.setBounds(1290, 4, 25, 30);
        b7.setForeground(Color.white);
        b7.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setFocusPainted(false);
        b7.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b7.setContentAreaFilled(false);

        b8 = new JButton();
        b8.setIcon(new ImageIcon("image/return.png"));
        b8.setBounds(15, 8, 35, 40);
        b8.setForeground(Color.white);
        b8.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b8.setFocusPainted(false);
        b8.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b8.setContentAreaFilled(false);

        bg1 = new ButtonGroup();

        r1 = new JRadioButton("Admin Log In");
        r1.setBounds(920, 240, 150, 20);
        r1.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        r1.setForeground(Color.white);
        r1.setBorderPainted(false);
        r1.setContentAreaFilled(false);
        r1.setFocusPainted(false);

        r2 = new JRadioButton("User Log In");
        r2.setBounds(1075, 240, 150, 20);
        r2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        r2.setForeground(Color.white);
        r2.setBorderPainted(false);
        r2.setContentAreaFilled(false);
        r2.setFocusPainted(false);

        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l9);
        f1.add(l10);
        f1.add(tf1);
        f1.add(pf1);
        f1.add(c1);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(l8);

        f1.add(r1);
        f1.add(r2);
        // f1.add(bg1);
        bg1.add(r1);
        bg1.add(r2);

        f1.add(p1);

        f1.setSize(1366, 768);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    f1.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b2) {
                    new ForgotPass();
                    f1.setVisible(false);

                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new Registration("dsff", "dfdf", "dfdfd", "dfdf", "fdfdf");
                    f1.setVisible(false);

                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    if (pf1.getEchoChar() != '\u0000') {
                        pf1.setEchoChar('\u0000');
                        b5.setVisible(false);
                        b6.setVisible(true);
                    }
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b6) {
                    pf1.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    b6.setVisible(false);
                    b5.setVisible(true);
                } else {
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b7) {
                    f1.setState(Frame.ICONIFIED);
                } else {
                }
            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b8) {
                    new Home();
                    f1.setVisible(false);
                }
            }
        });

        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == r1) {
                    pc = 1;
                }
            }
        });

        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == r2) {
                    pc = 2;
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = pf1.getText(); // Password
                if (pc == 1) {
                    if ((!textField1.isEmpty() && !textField2.isEmpty())) {

                        matchAdmin(textField1, textField2);

                        if (s == 1) {
                            f1.setVisible(false);
                        }

                    } else {
                        showMessageDialog(null, " Fill the blank fields ", "Message", -1);
                    }
                }

                else if (pc == 2) {
                    if (!textField1.isEmpty() && !textField2.isEmpty()) {

                        matchUser(textField1, textField2);

                        if (s == 2) {
                            f1.setVisible(false);
                        }

                    } else {
                        showMessageDialog(null, " Fill all fields ", "Message", -1);
                    }

                } else if (pc != 2 || pc != 1) {
                    showMessageDialog(null, " Choose User type ", "Message", -1);
                }

            }
        });
    }

}
