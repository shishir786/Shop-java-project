package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class ForgotPass2 {
    JFrame frame;
    JPanel p1;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JButton b1, b2, b3, b4, b5;
    JTextField tf1;
    ImageIcon i1;

    ForgotPass2() {
        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        p1 = new JPanel();
        p1.setBounds(700, 0, 666, 768);
        p1.setBackground(new Color(25, 118, 211));

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/forgotPass.jpg"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0, 0, size.width, size.height);

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

        b3 = new JButton();
        b3.setIcon(new ImageIcon("image/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);

        l2 = new JLabel("Enter Recovery Code");
        l2.setBounds(760, 150, 500, 60);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 26));

        l3 = new JLabel("Check your email. You must recieve an Email with recovery code for  ");
        l3.setBounds(760, 230, 500, 60);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 15));

        l4 = new JLabel("password reset");
        l4.setBounds(760, 250, 500, 60);
        l4.setForeground(Color.white);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 15));

        tf1 = new JTextField();
        tf1.setBounds(760, 300, 200, 20);
        tf1.setBorder(null);

        l5 = new JLabel("Didn't recieve code ?");
        l5.setBounds(760, 340, 200, 20);
        l5.setForeground(Color.white);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 15));

        b4 = new JButton("Send again");
        b4.setBounds(890, 342, 100, 20);
        b4.setForeground(Color.white);
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);

        b5 = new JButton("Submit");
        b5.setBounds(760, 370, 100, 20);
        b5.setBackground(Color.YELLOW);
        b5.setForeground(Color.black);
        b5.setVisible(false);

        l6 = new JLabel("Created By Group 8");
        l6.setBounds(280, 650, 400, 40);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l7 = new JLabel("Forgot Password");
        l7.setBounds(280, 680, 400, 40);
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 22));

        // adding button
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b4);
        frame.add(b5);

        // adding lebel
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);

        // adding text field
        frame.add(tf1);

        // add
        frame.add(l1);
        frame.add(p1);

        frame.setSize(1366, 768);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

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
                    new ForgotPass();
                    frame.setVisible(false);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {

                    showMessageDialog(null, "Recovery Code resend succesful ", "Message",
                            -1);

                }
            }
        });

        tf1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == tf1) {
                    if (!tf1.getText().equals("")) {
                        // showMessageDialog(null, " Invalid recovery code ", "Message",-1);

                        b5.setVisible(true);
                    } else {
                        b5.setVisible(false);
                    }

                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    if (tf1.getText().equals("")) {
                        showMessageDialog(null, " Invalid recovery code ", "Message", -1);
                    }

                    else {
                        new ForgotPass3();
                        frame.setVisible(false);

                    }

                }
            }
        });

    }

}
