package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Contribution {
    JFrame f1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JCheckBox c1;
    ImageIcon i1;

    Contribution() {

        f1 = new JFrame();
        f1.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        f1.setIconImage(i1.getImage());

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/contribution.png"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0, 0, size.width, size.height);

        b1 = new JButton("X");
        b1.setBounds(520, 4, 30, 40);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(490, 4, 25, 30);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton("OK");
        b3.setBounds(220, 725, 120, 50);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setBackground(new Color(23, 61, 123));
        b3.setForeground(new Color(255, 255, 255));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        // b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        // b3.setContentAreaFilled(false);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(l1);

        f1.setSize(566, 800);
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
                    f1.setState(Frame.ICONIFIED);
                } else {
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new Home();
                    f1.setVisible(false);

                }
            }
        });
    }
}
