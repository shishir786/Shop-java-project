package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDashBoard extends JFrame {

    JFrame frame;
    JPanel panel1, panel2;
    JLabel l1, l2, l3, l4, l5;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    JButton pl1, pl2, pl3, pl4, pl5, pl6, pl7, pl8, pl9, pl10, pl11, pl12, pl13, pl14;
    ImageIcon i1;

    AdminDashBoard(String textField1) {

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        panel1 = new JPanel();
        panel1.setBounds(650, 0, 800, 768);
        panel1.setBackground(new Color(25, 118, 211));

        panel2 = new JPanel();
        panel2.setBounds(0, 0, 666, 768);
        panel2.setBackground(new Color(252, 255, 255));

        

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/admin.png"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(50, 150, size.width, size.height);

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
        // b3.setForeground(Color.white);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);

        l2 = new JLabel("Admin Dashboard");
        l2.setBounds(700, 50, 500, 40);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 40));

        // Option

        b4 = new JButton();
        b4.setIcon(new ImageIcon("image/userinfo.jpg"));
        b4.setBounds(700, 160, 300, 220);
        b4.setFocusPainted(false);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setBackground(Color.white);
        // b4.setBorderPainted(false);
        pl1 = new JButton("User Information");
        pl1.setBounds(700, 385, 300, 35);
        pl1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        pl1.setForeground(Color.white);
        pl1.setFocusPainted(false);
        pl1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pl1.setContentAreaFilled(false);
        pl1.setBorderPainted(false);

        b5 = new JButton();
        b5.setIcon(new ImageIcon("image/adduser.jpg"));
        b5.setBounds(1020, 160, 300, 220);
        b5.setFocusPainted(false);
        b5.setForeground(Color.white);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // b5.setContentAreaFilled(false);
        // b5.setBorderPainted(false);
        pl2 = new JButton("Add User");
        pl2.setBounds(1020, 385, 300, 35);
        pl2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        pl2.setForeground(Color.white);
        pl2.setFocusPainted(false);
        pl2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pl2.setContentAreaFilled(false);
        pl2.setBorderPainted(false);

        // next line

        b8 = new JButton();
        b8.setIcon(new ImageIcon("image/adminInfo.jpg"));
        b8.setBounds(700, 460, 300, 220);
        b8.setFocusPainted(false);
        b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b8.setBackground(Color.WHITE);
        // b8.setBorderPainted(false);
        pl5 = new JButton("Admin Information");
        pl5.setBounds(700, 685, 300, 35);
        pl5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        pl5.setForeground(Color.white);
        pl5.setFocusPainted(false);
        pl5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pl5.setContentAreaFilled(false);
        pl5.setBorderPainted(false);

        b9 = new JButton();
        b9.setIcon(new ImageIcon("image/addadmin.png"));
        b9.setBounds(1020, 460, 300, 220);
        b9.setFocusPainted(false);
        b9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // b9.setContentAreaFilled(false);
        // b9.setBorderPainted(false);
        pl6 = new JButton("Add New Admin");
        pl6.setBounds(1020, 685, 300, 35);
        pl6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        pl6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pl6.setForeground(Color.white);
        pl6.setContentAreaFilled(false);
        pl6.setBorderPainted(false);
        pl6.setFocusPainted(false);

        l3 = new JLabel("User :" + " " + textField1);
        l3.setBounds(1150, 50, 120, 25);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        b10 = new JButton("Sign Out");
        b10.setBounds(1260, 50, 90, 25);
        b10.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b10.setFocusPainted(false);
        b10.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b10.setContentAreaFilled(false);

        // adding lebel
        frame.add(l2);
        frame.add(l3);

        // adding button
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);

        frame.add(pl1);
        frame.add(pl2);
        frame.add(pl5);
        frame.add(pl6);

        // add
        frame.add(l1);
        frame.add(panel1);
        frame.add(panel2);

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
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

        // option

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new AdminDashBoard1(textField1);
                    frame.setVisible(false);
                }
            }
        });
        pl1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == pl1) {
                    new AdminDashBoard1(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    new AdminDashBoard2(textField1);
                    frame.setVisible(false);
                }
            }
        });
        pl2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == pl2) {
                    new AdminDashBoard2(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b8) {
                    showMessageDialog(null, " Not available now ", "Message", 1);
                }
            }
        });
        pl5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == pl5) {
                    showMessageDialog(null, " Not available now ", "Message", 1);
                }
            }
        });

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b9) {
                    new AdminDashBoard3(textField1);
                    frame.setVisible(false);
                }
            }
        });
        pl6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == pl6) {
                    new AdminDashBoard3(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b10) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
