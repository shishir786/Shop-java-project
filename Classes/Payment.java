package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Payment {
    JFrame frame;
    JPanel p1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JButton b1, b2, b3, b4;
    JTextField tf1, tf2, tf3, tf4, tf5;
    ImageIcon i1;

    Payment(String textField1) {

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        p1 = new JPanel();
        p1.setBounds(0, 0, 655, 768);
        p1.setBackground(new Color(25, 118, 211));

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/payment.png"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0, 0, size.width, size.height);

        b1 = new JButton("X");
        b1.setBounds(1320, 4, 30, 40);
        // b1.setForeground(Color.white);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(1290, 4, 25, 30);
        // b2.setForeground(Color.white);
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

        b4 = new JButton("Pay");
        b4.setBounds(800, 550, 400, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b4.setBackground(Color.orange);
        b4.setForeground(Color.black);
        b4.setFocusPainted(false);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        l2 = new JLabel("*Card number");
        l2.setBounds(800, 260, 150, 40);
        l2.setFont(new Font("Serif", Font.PLAIN, 20));

        l3 = new JLabel("*Name on card");
        l3.setBounds(800, 340, 150, 40);
        l3.setFont(new Font("Serif", Font.PLAIN, 20));

        l4 = new JLabel("*Expiration date");
        l4.setBounds(800, 420, 150, 40);
        l4.setFont(new Font("Serif", Font.PLAIN, 20));

        l5 = new JLabel("*CVV");
        l5.setBounds(1050, 420, 100, 40);
        l5.setFont(new Font("Serif", Font.PLAIN, 20));

        l6 = new JLabel();
        l6.setIcon(new ImageIcon("image/payment_mathod.png"));
        Dimension size1 = l6.getPreferredSize();
        l6.setBounds(800, 210, size1.width, size1.height);
        // l6.setBounds(740, 120, 250, 100);

        l7 = new JLabel("Secure Payment");
        l7.setBounds(800, 120, 300, 50);
        l7.setFont(new Font("Serif", Font.BOLD, 42));

        tf1 = new JTextField();
        tf1.setBounds(800, 300, 400, 40);
        tf1.setFont(new Font("Serif", Font.PLAIN, 18));

        tf2 = new JTextField();
        tf2.setBounds(800, 380, 400, 40);
        tf2.setFont(new Font("Serif", Font.PLAIN, 18));

        tf3 = new JTextField();
        tf3.setBounds(800, 460, 200, 40);
        tf3.setFont(new Font("Serif", Font.PLAIN, 18));

        tf4 = new JTextField();
        tf4.setBounds(1050, 460, 150, 40);
        tf4.setFont(new Font("Serif", Font.PLAIN, 18));

        // addding lebel
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);

        // adding button
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        // adding text field
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf4);

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
                    new UserDashBoard(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    if (tf1.getText().equals("") || tf2.getText().equals("") || tf3.getText().equals("")
                            || tf4.getText().equals("")) {
                        showMessageDialog(null, " You need to give all information ", "Message",
                                -1);
                    }

                    else {
                        showMessageDialog(null, "Payment Complete", "Thank You", -1);
                        new UserDashBoard(textField1);
                        frame.setVisible(false);

                    }
                }
            }
        });

    }
}
