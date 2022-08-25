package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class PcBuild {

    JFrame frame;
    JPanel p1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JLabel label1, label2, label3;
    JButton b1, b2, b3, b4, b5;
    JTextField tf1;
    ImageIcon i1;
    JComboBox c1, c2, c3, c4, c5, c6, c7, c8;

    PcBuild(String textField1) {
        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size0 = label1.getPreferredSize();
        label1.setBounds(80, 10, size0.width, size0.height);

        label2 = new JLabel("Tech Experiment");
        label2.setBounds(200, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));

        label3 = new JLabel("Find your all tech need here in one place");
        label3.setBounds(205, 80, 500, 60);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        p1 = new JPanel();
        p1.setBounds(700, 0, 666, 768);
        p1.setBackground(new Color(25, 118, 211));

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/pc_0.png"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(50, 110, size.width, size.height);

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

        l3 = new JLabel("User :" + " " + textField1);
        l3.setBounds(1150, 50, 120, 25);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        b4 = new JButton("Sign Out");
        b4.setBounds(1260, 50, 90, 25);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setContentAreaFilled(false);

        l2 = new JLabel("Create your Custom PC list");
        l2.setBounds(760, 150, 500, 60);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 28));

        l4 = new JLabel("CPU");
        l4.setBounds(850, 280, 300, 40);
        l4.setForeground(Color.white);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] CPU = { "Select CPU", "i3 10th gen", "i5 11 th gen", "i5 12 th gen",
                "17 9 th gen", "i7 12 th gen", "AMD Ryzen 3 3500", "AMD Ryzen 5 5500", "AMD Ryzen 7 4700" };
        c1 = new JComboBox(CPU);
        c1.setBounds(1020, 290, 250, 25);
        c1.setSelectedIndex(0);

        l5 = new JLabel("GPU");
        l5.setBounds(850, 330, 300, 40);
        l5.setForeground(Color.white);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] GPU = { "Select GPU", "GTX 1080", "GTX 1650",
                "RTX 3050", "RTX 3070 ti", "Radian RX 6600", "RTX 3090" };
        c2 = new JComboBox(GPU);
        c2.setBounds(1020, 340, 250, 25);
        c2.setSelectedIndex(0);

        l6 = new JLabel("MotherBoard");
        l6.setBounds(850, 380, 300, 40);
        l6.setForeground(Color.white);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] Mobo = { "Select MotherBoard", "Gygabyte B450 ATX", "MSi B550 gaming", "Aurous B450 Elite v4",
                "Asus Tuf Gaming B660m", "Rog strix B11 WiFi", "Auorous rs550 mini " };
        c3 = new JComboBox(Mobo);
        c3.setBounds(1020, 390, 250, 25);
        c3.setSelectedIndex(0);

        l7 = new JLabel("RAM");
        l7.setBounds(850, 430, 300, 40);
        l7.setForeground(Color.white);
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] ram = { "Select RAM", "Adata 4 GB DDR4 2666MHz", "TEAM ELITE 8GB 2400MHz DDR4 ",
                "G.Skill Ripjaws V 8GB DDR4 3200MHz",
                "Crucial 8GB DDR4 3200MHz", "Transcend U-DIMM RGB 16GB DDR4 3200MHz",
                "ZADAK SPARK RGB 16GB DDR4 4800Mhz" };
        c4 = new JComboBox(ram);
        c4.setBounds(1020, 440, 250, 25);
        c4.setSelectedIndex(0);

        l8 = new JLabel("Storage 1");
        l8.setBounds(850, 480, 300, 40);
        l8.setForeground(Color.white);
        l8.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] storage1 = { "Select Storage 1", "Netac N535S 120GB SATAIII SSD", "TEAM GX1 120GB 2.5 SATA SSD",
                "Transcend 820s 120GB M.2 2280 SATA SSD",
                "Western Digital 120GB M.2 SSD", "Acer RE100 128GB 2.5 SATA lll SSD",
                "Samsung 980 250GB PCIe 3.0 SSD" };
        c5 = new JComboBox(storage1);
        c5.setBounds(1020, 490, 250, 25);
        c5.setSelectedIndex(0);

        l9 = new JLabel("Storage 2");
        l9.setBounds(850, 530, 300, 40);
        l9.setForeground(Color.white);
        l9.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] storage2 = { "Select Storage 2", "Western Digital 1TB Blue HDD", "Seagate 1TB 2.5 Inch SATA HDD",
                "Western Digital 1TB Purple Surveillance HDD",
                "Seagate Barracuda 2TB 7200RPM SATA HDD", "Toshiba S300 1TB 5700rpm Surveillance HDD",
                "Samsung 980 250GB PCIe 3.0 SSD" };
        c6 = new JComboBox(storage2);
        c6.setBounds(1020, 540, 250, 25);
        c6.setSelectedIndex(0);

        l10 = new JLabel("Power Supply");
        l10.setBounds(850, 580, 300, 40);
        l10.setForeground(Color.white);
        l10.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] psu = { "Select PSU", "Antec Atom 350W 350 Watt", "Gamdias Kratos E1-600W RGB",
                "ASUS ROG THOR 850P 80+ Platinum",
                "MSI MAG A550BN 550W 80 Plus Bronz", "Corsair CV650 650Watt 80 Plus Bronze",
                "Lian Li SP750 SFX 80 PLUS Gold " };
        c7 = new JComboBox(psu);
        c7.setBounds(1020, 590, 250, 25);
        c7.setSelectedIndex(0);

        l11 = new JLabel("Cabinet");
        l11.setBounds(850, 630, 300, 40);
        l11.setForeground(Color.white);
        l11.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        String[] casing = { "Select Cabinet", "Gigabyte C200 Glass Mid Tower Casing",
                "Xtreme T38 RGB ATX Gaming Casing",
                "Antec DF600 Flux Mid Tower Gaming Case",
                "Montech X1 MESH Black Mid Gaming Case", "Deepcool MATREXX 55 V3 ADD-RGB Mid-Tower",
                "Gamdias ARGUS E4 Elite WH Mid Tower" };
        c8 = new JComboBox(casing);
        c8.setBounds(1020, 640, 250, 25);
        c8.setSelectedIndex(0);

        b5 = new JButton("Get Print Out");
        b5.setBounds(940, 700, 250, 25);
        b5.setFont(new Font("Segoe UI", Font.BOLD, 17));
        b5.setForeground(new Color(25, 118, 211));
        b5.setBackground(new Color(255, 255, 255));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);

        // adding lebel
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);
        frame.add(l10);
        frame.add(l11);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        // adding button
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        // add combo box
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);
        frame.add(c5);
        frame.add(c6);
        frame.add(c7);
        frame.add(c8);

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

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String lin0 = textField1;
                String lin1 = String.valueOf(c1.getSelectedItem());
                String lin2 = String.valueOf(c2.getSelectedItem());
                String lin3 = String.valueOf(c3.getSelectedItem());
                String lin4 = String.valueOf(c4.getSelectedItem());
                String lin5 = String.valueOf(c5.getSelectedItem());
                String lin6 = String.valueOf(c6.getSelectedItem());
                String lin7 = String.valueOf(c7.getSelectedItem());
                String lin8 = String.valueOf(c8.getSelectedItem());

                if (e.getSource() == b5) {
                    try {
                        File newfile = new File(".\\print\\PrintOut.doc");

                        if (newfile.createNewFile()) {
                            System.out.println("A new file is successfully created!!" + newfile.getName());
                        } else {
                            System.out.println("The file can not be created or already exists");
                        }
                    } catch (IOException ie) {
                        System.out.println("An error Occured and failed to create the file");
                    }

                    try {
                        FileWriter file = new FileWriter(".\\print\\PrintOut.doc");
                        file.write("User Name            : " + lin0 + "\n" + "\n");
                        file.write("PC Buld List : " + "\n" + "\n");
                        file.write("CPU                  : " + lin1 + "\n");
                        file.write("GPU                  : " + lin2 + "\n");
                        file.write("MotherBoard          : " + lin3 + "\n");
                        file.write("RAM                  : " + lin4 + "\n");
                        file.write("Storage 1            : " + lin5 + "\n");
                        file.write("Storage 2            : " + lin6 + "\n");
                        file.write("Power Supply         : " + lin7 + "\n");
                        file.write("Cabinet              : " + lin8 + "\n");

                        file.close();
                    }

                    catch (IOException iee) {
                        System.out.println("There is a error ");
                    }
                    showMessageDialog(null, " Print Document created \n chech it  ", "Message", -1);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
