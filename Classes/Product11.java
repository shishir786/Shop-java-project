package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Product11 {

    JFrame frame;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    JComboBox cb1;
    ImageIcon i1;
    JPanel p1;

    Product11(String textField1) {

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

        b4 = new JButton("Buy Now");
        b4.setBounds(610, 490, 250, 60);
        b4.setForeground(Color.black);
        b4.setFont(new Font("Serif", Font.BOLD, 30));
        b4.setBackground(Color.orange);
        b4.setFocusPainted(false);

        label2 = new JLabel("Welcome to our Tech Experiment");
        label2.setBounds(200, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));

        label3 = new JLabel("Find your all tech need here in one place");
        label3.setBounds(205, 80, 500, 60);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        label4 = new JLabel("Home/Laptop/Asus");
        label4.setBounds(80, 110, 500, 60);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        label5 = new JLabel("Asus-22edc56");
        label5.setBounds(600, 190, 1400, 40);
        label5.setFont(new Font("Serif", Font.BOLD, 22));

        label6 = new JLabel(new ImageIcon("image/rsz_laptop_3.jpg"));
        label6.setBounds(100, 180, 450, 400);

        p1 = new JPanel();
        p1.setBounds(100, 180, 450, 400);
        p1.setBackground(Color.white);
        frame.add(p1);

        label7 = new JLabel("SKU: Q-T-HAAT-12  |  BRAND: Asus");
        label7.setBounds(610, 230, 240, 40);
        label7.setFont(new Font("Serif", Font.PLAIN, 15));

        label8 = new JLabel("CATEGORY: Laptop");
        label8.setBounds(610, 270, 240, 40);
        label8.setFont(new Font("Serif", Font.PLAIN, 15));

        label9 = new JLabel("BDT 32900 ");
        label9.setBounds(610, 380, 240, 40);
        label9.setFont(new Font("Serif", Font.BOLD, 35));

        label10 = new JLabel("1 reviews");
        label10.setBounds(610, 420, 240, 40);
        label10.setFont(new Font("Serif", Font.BOLD, 15));

        label11 = new JLabel("Quantity");
        label11.setBounds(610, 330, 240, 40);
        label11.setFont(new Font("Serif", Font.BOLD, 18));

        String quantity[] = { "1", "2", "3", "4", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(690, 340, 60, 20);

        // adding lebel

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.add(label10);
        frame.add(label11);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        // add
        frame.add(cb1);
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
                    new Category2(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new Payment(textField1);
                    frame.setVisible(false);
                }
            }
        });

    }
}
