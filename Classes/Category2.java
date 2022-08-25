package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Category2 {

    JFrame frame;
    JLabel label1, label2, label3, label4, ll3;
    JButton l1, l2, l3, l4, l5, l6, l7, l8, bl4;
    JButton p1, p2, p3, p4, p5, p6, p7, p8;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    ImageIcon i1;

    Category2(String textField1) {

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

        label2 = new JLabel("Welcome to our Tech Experiment");
        label2.setBounds(200, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));

        label3 = new JLabel("Find your all tech need here in one place");
        label3.setBounds(205, 80, 500, 60);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        label4 = new JLabel("Home/Laptop");
        label4.setBounds(80, 110, 500, 60);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //// Catagories

        b4 = new JButton();
        b4.setIcon(new ImageIcon("image/rsz_laptop_1.jpg"));
        b4.setBounds(60, 160, 300, 220);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setBackground(Color.white);
        // b4.setContentAreaFilled(false);
        // b4.setBorderPainted(false);
        l1 = new JButton("acer-1100mbbs");
        l1.setBounds(60, 385, 300, 35);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l1.setFocusPainted(false);
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l1.setContentAreaFilled(false);
        l1.setBorderPainted(false);
        p1 = new JButton("BDT 30000 tk");
        p1.setBounds(60, 422, 300, 35);
        p1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.setFocusPainted(false);
        p1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.setHorizontalAlignment(SwingConstants.LEFT);
        p1.setContentAreaFilled(false);
        p1.setBorderPainted(false);

        b5 = new JButton();
        b5.setIcon(new ImageIcon("image/rsz_laptop_2.jpg"));
        b5.setBounds(380, 160, 300, 220);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setBackground(Color.white);
        // b5.setContentAreaFilled(false);
        // b5.setBorderPainted(false);
        l2 = new JButton("Lenovo-1206eng");
        l2.setBounds(380, 385, 300, 35);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l2.setHorizontalAlignment(SwingConstants.LEFT);
        l2.setFocusPainted(false);
        l2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l2.setContentAreaFilled(false);
        l2.setBorderPainted(false);
        p2 = new JButton("BDT 32000 tk");
        p2.setBounds(380, 422, 300, 35);
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p2.setFocusPainted(false);
        p2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.setHorizontalAlignment(SwingConstants.LEFT);
        p2.setContentAreaFilled(false);
        p2.setBorderPainted(false);

        b6 = new JButton();
        b6.setIcon(new ImageIcon("image/rsz_laptop_3.jpg"));
        b6.setBounds(700, 160, 300, 220);
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setBackground(Color.white);
        // b6.setContentAreaFilled(false);
        // b6.setBorderPainted(false);
        l3 = new JButton("asus-22edc56");
        l3.setBounds(700, 385, 300, 35);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l3.setHorizontalAlignment(SwingConstants.LEFT);
        l3.setFocusPainted(false);
        l3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l3.setContentAreaFilled(false);
        l3.setBorderPainted(false);
        p3 = new JButton("BDT 32900 tk");
        p3.setBounds(700, 422, 300, 35);
        p3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p3.setFocusPainted(false);
        p3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p3.setHorizontalAlignment(SwingConstants.LEFT);
        p3.setContentAreaFilled(false);
        p3.setBorderPainted(false);

        b7 = new JButton();
        b7.setIcon(new ImageIcon("image/rsz_laptop_4.jpg"));
        b7.setBounds(1020, 160, 300, 220);
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setBackground(Color.white);
        // b7.setContentAreaFilled(false);
        // b7.setBorderPainted(false);
        l4 = new JButton("hp-mn1000");
        l4.setBounds(1020, 385, 300, 35);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l4.setFocusPainted(false);
        l4.setHorizontalAlignment(SwingConstants.LEFT);
        l4.setContentAreaFilled(false);
        l4.setBorderPainted(false);
        p4 = new JButton("BDT 35499 tk");
        p4.setBounds(1020, 422, 300, 35);
        p4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p4.setFocusPainted(false);
        p4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p4.setHorizontalAlignment(SwingConstants.LEFT);
        p4.setContentAreaFilled(false);
        p4.setBorderPainted(false);

        // next line

        b8 = new JButton();
        b8.setIcon(new ImageIcon("image/rsz_laptop_5.jpg"));
        b8.setBounds(60, 460, 300, 220);
        b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b8.setBackground(Color.white);
        // b8.setContentAreaFilled(false);
        // b8.setBorderPainted(false);
        l5 = new JButton("hp-200mn");
        l5.setBounds(60, 685, 300, 35);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l5.setHorizontalAlignment(SwingConstants.LEFT);
        l5.setFocusPainted(false);
        l5.setContentAreaFilled(false);
        l5.setBorderPainted(false);
        p5 = new JButton("BDT 39490 tk");
        p5.setBounds(60, 722, 300, 35);
        p5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p5.setFocusPainted(false);
        p5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p5.setHorizontalAlignment(SwingConstants.LEFT);
        p5.setContentAreaFilled(false);
        p5.setBorderPainted(false);

        b9 = new JButton();
        b9.setIcon(new ImageIcon("image/rsz_laptop_6.jpg"));
        b9.setBounds(380, 460, 300, 220);
        b9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b9.setBackground(Color.white);
        // b9.setContentAreaFilled(false);
        // b9.setBorderPainted(false);
        l6 = new JButton("dell-hye546");
        l6.setBounds(380, 685, 300, 35);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l6.setHorizontalAlignment(SwingConstants.LEFT);
        l6.setFocusPainted(false);
        l6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l6.setContentAreaFilled(false);
        l6.setBorderPainted(false);
        p6 = new JButton("BDT 40000 tk");
        p6.setBounds(380, 722, 300, 35);
        p6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p6.setFocusPainted(false);
        p6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p6.setHorizontalAlignment(SwingConstants.LEFT);
        p6.setContentAreaFilled(false);
        p6.setBorderPainted(false);

        b10 = new JButton();
        b10.setIcon(new ImageIcon("image/rsz_laptop_7.jpg"));
        b10.setBounds(700, 460, 300, 220);
        b10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b10.setBackground(Color.white);
        // b10.setContentAreaFilled(false);
        // b10.setBorderPainted(false);
        l7 = new JButton("Lenovo-756bnf");
        l7.setBounds(700, 685, 300, 35);
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l7.setHorizontalAlignment(SwingConstants.LEFT);
        l7.setFocusPainted(false);
        l7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l7.setContentAreaFilled(false);
        l7.setBorderPainted(false);
        p7 = new JButton("BDT 43900 tk");
        p7.setBounds(700, 722, 300, 35);
        p7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p7.setFocusPainted(false);
        p7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p7.setHorizontalAlignment(SwingConstants.LEFT);
        p7.setContentAreaFilled(false);
        p7.setBorderPainted(false);

        b11 = new JButton();
        b11.setIcon(new ImageIcon("image/rsz_laptop_8.jpg"));
        b11.setBounds(1020, 460, 300, 220);
        b11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b11.setBackground(Color.white);
        // b11.setContentAreaFilled(false);
        // b11.setBorderPainted(false);
        l8 = new JButton("asus-23jf");
        l8.setBounds(1020, 685, 300, 35);
        l8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l8.setHorizontalAlignment(SwingConstants.LEFT);
        l8.setContentAreaFilled(false);
        l8.setBorderPainted(false);
        l8.setFocusPainted(false);
        p8 = new JButton("BDT 45000 tk");
        p8.setBounds(1020, 722, 300, 35);
        p8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p8.setFocusPainted(false);
        p8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p8.setHorizontalAlignment(SwingConstants.LEFT);
        p8.setContentAreaFilled(false);
        p8.setBorderPainted(false);

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
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        frame.add(p6);
        frame.add(p7);
        frame.add(p8);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);

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
                    new UserDashBoard(textField1);
                    frame.setVisible(false);
                }
            }
        });

        // Catagories

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new Product9(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l1) {
                    new Product9(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p1) {
                    new Product9(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    new Product10(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l2) {
                    new Product10(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p2) {
                    new Product10(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b6) {
                    new Product11(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l3) {
                    new Product11(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p3) {
                    new Product11(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b7) {
                    new Product12(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l4) {
                    new Product12(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p4) {
                    new Product12(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b8) {
                    new Product13(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l5) {
                    new Product13(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p5) {
                    new Product13(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b9) {
                    new Product14(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l6) {
                    new Product14(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p6) {
                    new Product14(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b10) {
                    new Product15(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l7) {
                    new Product15(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p7) {
                    new Product15(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b11) {
                    new Product16(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l8) {
                    new Product16(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p8) {
                    new Product16(textField1);
                    frame.setVisible(false);
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
