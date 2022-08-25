package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class ForgotPass3 {
    JFrame f2;
    JPanel p1;
    JPanel p2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JCheckBox c1;
    ImageIcon i1;

    ForgotPass3() {

        f2 = new JFrame();
        f2.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        f2.setIconImage(i1.getImage());

        p1 = new JPanel();
        p1.setBounds(700, 0, 666, 768);
        p1.setBackground(new Color(25, 118, 211));

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/forgotPass.jpg"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0, 0, size.width, size.height);

        l2 = new JLabel("Recovery Password");
        l2.setBounds(900, 150, 350, 60);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 35));

        l3 = new JLabel("New Password");
        l3.setBounds(850, 280, 300, 40);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l4 = new JLabel("________________________________________________________");
        l4.setBounds(850, 330, 400, 40);
        l4.setForeground(Color.white);
        l4.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l5 = new JLabel("Comfrim Password");
        l5.setBounds(850, 380, 200, 40);
        l5.setForeground(Color.white);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l6 = new JLabel("________________________________________________________");
        l6.setBounds(850, 430, 400, 40);
        l6.setForeground(Color.white);
        l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l7 = new JLabel("Created By Group 8");
        l7.setBounds(280, 650, 400, 40);
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l8 = new JLabel("Forgot Password");
        l8.setBounds(280, 680, 400, 40);
        l8.setFont(new Font("Segoe UI", Font.PLAIN, 22));

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

        b1 = new JButton("X");
        b1.setBounds(1320, 4, 30, 40);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(1290, 4, 25, 30);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton("Change Password");
        b3.setBounds(850, 550, 400, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setForeground(new Color(25, 118, 211));
        b3.setBackground(new Color(255, 255, 255));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);

        b4 = new JButton();
        b4.setIcon(new ImageIcon("image/icon2.png"));
        b4.setBounds(1250, 430, 25, 20);
        b4.setForeground(Color.white);
        b4.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b4.setContentAreaFilled(false);

        b5 = new JButton();
        b5.setIcon(new ImageIcon("image/icon3.png"));
        b5.setBounds(1250, 430, 25, 20);
        b5.setForeground(Color.white);
        b5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        b5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b5.setContentAreaFilled(false);
        b5.setVisible(false);

        b6 = new JButton();
        b6.setIcon(new ImageIcon("image/return.png"));
        b6.setBounds(15, 8, 35, 40);
        b6.setForeground(Color.white);
        b6.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
        b6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b6.setContentAreaFilled(false);

        // adding
        f2.add(l2);
        f2.add(l3);
        f2.add(l4);
        f2.add(l5);
        f2.add(l6);
        f2.add(l7);
        f2.add(l8);

        // adding text field
        f2.add(tf1);
        f2.add(pf1);

        // adding button
        f2.add(b1);
        f2.add(b2);
        f2.add(b3);
        f2.add(b4);
        f2.add(b5);
        f2.add(b6);

        // add
        f2.add(l1);
        f2.add(p1);

        f2.setSize(1366, 768);
        f2.setLayout(new BorderLayout());
        f2.setLocationRelativeTo(null);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(false);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Action

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    f2.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b2) {
                    f2.setState(Frame.ICONIFIED);
                } else {
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    if (pf1.getEchoChar() != '\u0000') {
                        pf1.setEchoChar('\u0000');
                        b4.setVisible(false);
                        b5.setVisible(true);
                    }
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    pf1.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    b5.setVisible(false);
                    b4.setVisible(true);
                } else {
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b6) {
                    new ForgotPass2();
                    f2.setVisible(false);
                }
            }
        });

    }
}
