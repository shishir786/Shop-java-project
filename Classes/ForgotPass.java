package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class ForgotPass {
    JFrame f1, f2;
    JPanel p1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    JTextField tf1, tf2, tf3, tf4;
    JButton b1, b2, b3, b4;
    JCheckBox c1;
    JComboBox securityQsn;
    ImageIcon i1;

    ForgotPass() {

        f1 = new JFrame();
        f1.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        f1.setIconImage(i1.getImage());

        p1 = new JPanel();
        p1.setBounds(700, 0, 666, 768);
        p1.setBackground(new Color(25, 118, 211));

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/forgotpass.jpg"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0, 0, size.width, size.height);

        l2 = new JLabel("Recovery Password");
        l2.setBounds(900, 100, 350, 60);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 35));

        l3 = new JLabel("User Name");
        l3.setBounds(850, 200, 300, 40);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        tf1 = new JTextField();
        tf1.setBounds(855, 235, 380, 30);
        tf1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        tf1.setForeground(Color.white);
        tf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tf1.setCaretColor(Color.white);
        tf1.setBorder(null);
        tf1.setOpaque(false);

        l4 = new JLabel("________________________________________________________");
        l4.setBounds(850, 240, 400, 40);
        l4.setForeground(Color.white);
        l4.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l5 = new JLabel();
        l5.setIcon(new ImageIcon("image/icon.png"));
        l5.setBounds(1250, 210, 80, 80);
        l5.setForeground(Color.white);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 25));

        l6 = new JLabel("Recovery Email");
        l6.setBounds(850, 380, 150, 40);
        l6.setForeground(Color.white);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l7 = new JLabel("________________________________________________________");
        l7.setBounds(850, 430, 400, 40);
        l7.setForeground(Color.white);
        l7.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l8 = new JLabel();
        l8.setIcon(new ImageIcon("image/email.png"));
        l8.setBounds(1250, 430, 25, 20);
        l8.setForeground(Color.white);
        l8.setFont(new Font("Segoe UI", Font.PLAIN, 25));

        l9 = new JLabel("Created By Group 8");
        l9.setBounds(280, 650, 400, 40);
        l9.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l10 = new JLabel("Recovery Password");
        l10.setBounds(280, 680, 400, 40);
        l10.setFont(new Font("Segoe UI", Font.PLAIN, 22));

        tf2 = new JTextField();
        tf2.setBounds(855, 420, 380, 30);
        tf2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        tf2.setForeground(Color.white);
        tf2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tf2.setCaretColor(Color.white);
        tf2.setBorder(null);
        tf2.setOpaque(false);

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

        b3 = new JButton("Retrieve Password");
        b3.setBounds(850, 590, 400, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setForeground(new Color(25, 118, 211));
        b3.setBackground(new Color(255, 255, 255));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);

        b4 = new JButton();
        b4.setIcon(new ImageIcon("image/return.png"));
        b4.setBounds(15, 8, 35, 40);
        b4.setForeground(Color.white);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b4.setContentAreaFilled(false);
        /*
         * // Captcha Label and Text Field
         * l11 = new JLabel();
         * l11.setText("Captcha");
         * l11.setBounds(850, 490, 500, 50);
         * l11.setForeground(Color.white);
         * l11.setFont(new Font("Segoe UI", Font.PLAIN, 20));
         * 
         * tf3 = new JTextField();
         * tf3.setBounds(1054, 495, 180, 40);
         * tf3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
         * tf3.setForeground(Color.white);
         * tf3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
         * tf3.setCaretColor(Color.white);
         * tf3.setBorder(null);
         * tf3.setOpaque(false);
         * 
         * // To get a random number for captcha
         * Random rand = new Random();
         * int a = rand.nextInt(10);
         * int b = rand.nextInt(10);
         * 
         * // Captcha
         * l12 = new JLabel();
         * l12.setText("   " + a + " + " + b + "  ");
         * l12.setBounds(930, 500, 75, 30);
         * l12.setForeground(Color.black);
         * l12.setBackground(Color.decode("#FFD3D3"));
         * l12.setFont(new Font("Segoe UI", Font.PLAIN, 20));
         * l12.setBorder(null);
         * l12.setOpaque(true);
         * 
         * l13 = new JLabel("____________________________");
         * l13.setBounds(1050, 505, 200, 40);
         * l13.setForeground(Color.white);
         * l13.setCursor(new Cursor(Cursor.TEXT_CURSOR));
         */

        l14 = new JLabel("Security Questions");
        l14.setBounds(850, 280, 300, 40);
        l14.setForeground(Color.white);
        l14.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] secQsn = { "Choose a Security Question...", "what's your father's name?", "what's your mother's name?",
                "whats your favourite pet name?", "what's your favorite sports?", "what's your favourite movie?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(1020, 290, 250, 25);
        securityQsn.setSelectedIndex(0);
        // securityQsn.setBackground(Color.white);

        l15 = new JLabel("Write your Answer");
        l15.setBounds(850, 330, 320, 30);
        l15.setForeground(Color.white);
        l15.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        tf4 = new JTextField();
        tf4.setBounds(1035, 330, 180, 30);
        tf4.setForeground(Color.white);
        tf4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        tf4.setBorder(null);
        tf4.setOpaque(false);
        l16 = new JLabel("___________________________");
        l16.setBounds(1030, 335, 190, 40);
        l16.setForeground(Color.white);

        // adding lebel
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(l10);
        // f1.add(l11);
        // f1.add(l12);
        // f1.add(l13);
        f1.add(l14);
        f1.add(l15);
        f1.add(l16);

        // adding text field
        f1.add(tf1);
        f1.add(tf2);
        // f1.add(tf3);
        f1.add(tf4);

        // adding button
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);

        // add
        f1.add(l1);
        f1.add(securityQsn);
        f1.add(p1);

        f1.setSize(1366, 768);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);

        // Action

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
                }

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String textField1 = tf1.getText();
                String secQsn = String.valueOf(securityQsn.getSelectedItem());
                String textField8 = tf4.getText(); // Security Question Answer
                // String textField9 = tf3.getText();
                String textField00 = tf2.getText();
                // int result = 0;

                if (e.getSource() == b3) {
                    if (!secQsn.isEmpty() && !textField8.isEmpty() && !textField1.isEmpty()
                            && !textField00.isEmpty()) {

                        try {
                            String userNameS = "User Name : " + textField1;
                            String QuestionS = "Security Question : " + secQsn;
                            String AnswerS = "Answer : " + textField8;
                            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                            int totalLines = 0;
                            while (reader.readLine() != null)
                                totalLines++;
                            reader.close();

                            for (int i = 0; i <= totalLines; i++) {
                                String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                                if (line.equals(userNameS)) {
                                    String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 3));
                                    if (line2.equals(QuestionS)) {
                                        String line3 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt"))
                                                .get((i + 4));
                                        if (line3.equals(AnswerS)) {
                                            new ForgotPass2();
                                            f1.setVisible(false);
                                            break;
                                        }
                                    }
                                }
                            }

                        } catch (Exception ex) {
                            showMessageDialog(null, " User not Found or Security Question & anawer not matched",
                                    "Message", -1);
                            System.out.println(" Maching error");
                            // ex.printStackTrace();

                        }

                    } else {
                        showMessageDialog(null, "Please fill all of the fields.", "Warning!", 2);
                    }
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new Login("textField1", "textField2");
                    f1.setVisible(false);
                }
            }
        });

    }
}
