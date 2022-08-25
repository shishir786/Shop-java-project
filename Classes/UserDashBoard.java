package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class UserDashBoard {

    JFrame frame;
    JLabel label1, label2, label3, label4, ll3;
    JButton l1, l2, l3, l4, l5, l6, l7, l8, bl4;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    ImageIcon i1;

    UserDashBoard(String textField1) {

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size = label1.getPreferredSize();
        label1.setBounds(80, 10, size.width, size.height);

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

        ll3 = new JLabel("User :" + " " + textField1);
        ll3.setBounds(1150, 50, 120, 25);
        ll3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        bl4 = new JButton("Sign Out");
        bl4.setBounds(1260, 50, 90, 25);
        bl4.setFont(new Font("Segoe UI", Font.BOLD, 16));
        bl4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bl4.setFocusPainted(false);
        bl4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        bl4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bl4.setContentAreaFilled(false);

        frame.add(bl4);
        frame.add(ll3);

        label2 = new JLabel("Welcome to our Tech Experiment");
        label2.setBounds(200, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));

        label3 = new JLabel("Find your all tech need here in one place");
        label3.setBounds(205, 80, 500, 60);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        label4 = new JLabel("Select which catagory product");
        label4.setBounds(80, 110, 500, 60);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //// Catagories

        b4 = new JButton();
        b4.setIcon(new ImageIcon("image/pc.jpg"));
        b4.setBounds(60, 460, 300, 220);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // b4.setContentAreaFilled(false);
        // b4.setBorderPainted(false);
        l1 = new JButton("Desktop");
        l1.setBounds(60, 685, 300, 35);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l1.setFocusPainted(false);
        l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l1.setContentAreaFilled(false);
        l1.setBorderPainted(false);

        b5 = new JButton();
        b5.setIcon(new ImageIcon("image/laptop.jpg"));
        b5.setBounds(380, 460, 300, 220);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // b5.setContentAreaFilled(false);
        // b5.setBorderPainted(false);
        l2 = new JButton("Laptop");
        l2.setBounds(380, 685, 300, 35);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l2.setFocusPainted(false);
        l2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l2.setContentAreaFilled(false);
        l2.setBorderPainted(false);

        b6 = new JButton();
        b6.setIcon(new ImageIcon("image/Pc_components.jpg"));
        b6.setBounds(700, 460, 300, 220);
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setBackground(Color.black);
        // b6.setContentAreaFilled(false);
        // b6.setBorderPainted(false);
        l3 = new JButton("Components");
        l3.setBounds(700, 685, 300, 35);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l3.setFocusPainted(false);
        l3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l3.setContentAreaFilled(false);
        l3.setBorderPainted(false);

        b7 = new JButton();
        b7.setIcon(new ImageIcon("image/customP.jpg"));
        b7.setBounds(1020, 460, 300, 220);
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setBackground(Color.white);
        // b7.setContentAreaFilled(false);
        // b7.setBorderPainted(false);
        l4 = new JButton("Custom Build");
        l4.setBounds(1020, 685, 300, 35);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l4.setFocusPainted(false);
        l4.setContentAreaFilled(false);
        l4.setBorderPainted(false);

        // next line

        b8 = new JButton();
        b8.setIcon(new ImageIcon("image/offer.jpg"));
        b8.setBounds(75, 160, 1233, 280);
        b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // b8.setContentAreaFilled(false);
        // b8.setBorderPainted(false);

        /*
         * b9 = new JButton("Coming soon.....");
         * //b9.setIcon(new ImageIcon("image/coming.jpg"));
         * b9.setBackground(new Color(220,220,220));
         * b9.setBounds(380, 460, 300, 220);
         * b9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
         * b9.setFocusPainted(false);
         * b9.setCursor(new Cursor(Cursor.HAND_CURSOR));
         * // b9.setContentAreaFilled(false);
         * // b9.setBorderPainted(false);
         * l6 = new JButton("Software");
         * l6.setBounds(380, 685, 300, 35);
         * l6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
         * l6.setFocusPainted(false);
         * l6.setCursor(new Cursor(Cursor.HAND_CURSOR));
         * l6.setContentAreaFilled(false);
         * l6.setBorderPainted(false);
         * 
         * b10 = new JButton("Coming soon.....");
         * // b10.setIcon(new ImageIcon("image/Camera.jpg"));
         * b10.setBackground(new Color(220,220,220));
         * b10.setBounds(700, 460, 300, 220);
         * b10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
         * b10.setFocusPainted(false);
         * b10.setCursor(new Cursor(Cursor.HAND_CURSOR));
         * // b10.setContentAreaFilled(false);
         * // b10.setBorderPainted(false);
         * l7 = new JButton("Camera");
         * l7.setBounds(700, 685, 300, 35);
         * l7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
         * l7.setFocusPainted(false);
         * l7.setCursor(new Cursor(Cursor.HAND_CURSOR));
         * l7.setContentAreaFilled(false);
         * l7.setBorderPainted(false);
         * 
         * b11 = new JButton("Coming soon.....");
         * // b11.setIcon(new ImageIcon("image/office.jpg"));
         * b11.setBackground(new Color(220,220,220));
         * b11.setBounds(1020, 460, 300, 220);
         * b11.setFont(new Font("Segoe UI", Font.PLAIN, 20));
         * b11.setCursor(new Cursor(Cursor.HAND_CURSOR));
         * b11.setFocusPainted(false);
         * // b11.setContentAreaFilled(false);
         * // b11.setBorderPainted(false);
         * l8 = new JButton("Office Item");
         * l8.setBounds(1020, 685, 300, 35);
         * l8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
         * l8.setCursor(new Cursor(Cursor.HAND_CURSOR));
         * l8.setContentAreaFilled(false);
         * l8.setBorderPainted(false);
         * l8.setFocusPainted(false);
         * 
         */

        // adding lebel

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        // adding button

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);

        // add
        frame.add(label1);

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
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

        // Catagories

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new Category1(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l1) {
                    new Category1(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    new Category2(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l2) {
                    new Category2(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b6) {
                    new Category3(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l3) {
                    new Category3(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b7) {
                    new PcBuild(textField1);
                    frame.setVisible(false);
                }
            }
        });
        /*
         * l4.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent e) {
         * 
         * if (e.getSource() == l4) {
         * new Category4(textField1);
         * frame.setVisible(false);
         * }
         * }
         * });
         */

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b8) {
                    // frame.setVisible(false);
                }
            }
        });

        bl4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bl4) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
