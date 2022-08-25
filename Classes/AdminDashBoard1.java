package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import javax.swing.table.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDashBoard1 {

    JFrame frame;
    JLabel label1, label2, label3, label4, l1;
    JPanel panel1;
    JScrollPane scroll;
    JTable table;
    DefaultTableModel model;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    ImageIcon i1;

    private String[] column = { "User Name", "Password", "Email", "Security Question", "Answer", "Date and Time" };
    private String[] rows = new String[7];

    AdminDashBoard1(String textField1) {

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 600, 768);
        panel1.setBackground(new Color(25, 118, 211));
        
        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/userinfo2.jpg"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0, 0, size.width, size.height);

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("image/back.png"));
        Dimension size1 = label1.getPreferredSize();
        label1.setBounds(0, 0, size1.width, size1.height);

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

        label2 = new JLabel("All User Information");
        label2.setBounds(650, 50, 500, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 40));

        //// Catagories

        

        label3 = new JLabel("User :" + " " + textField1);
        label3.setBounds(1150, 50, 120, 25);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        b12 = new JButton("Sign Out");
        b12.setBounds(1260, 50, 90, 25);
        b12.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setFocusPainted(false);
        b12.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setContentAreaFilled(false);

        frame.add(label3);
        frame.add(b12);

        b13 = new JButton("Delete User");
        b13.setBounds(1135, 660, 180, 30);
        b13.setFont(new Font("Segoe UI", Font.BOLD, 18));
        b13.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b13.setBackground(Color.orange);
        b13.setFocusPainted(false);
        //b13.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        // b13.setContentAreaFilled(false);

        frame.add(b13);

        // table
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(150);

        scroll = new JScrollPane(table);
        scroll.setBounds(650, 150, 666, 500);
        scroll.setBackground(Color.cyan);
        frame.add(scroll);

        String file = ".\\Data\\user_data.txt";
        String temp = ".\\Data\\temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // Email
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(20); // Security Question
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(9); // Answer
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(14); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            System.out.println("error");
            return;
        }

        // Delete Button
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(12).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }

                    try {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4)
                                    || j == (q + 5))) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    new AdminDashBoard1(textField1);
                    frame.setVisible(false);
                }

            }
        });

        // adding lebel

        frame.add(label1);
        frame.add(label2);

        // adding button

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        // add
        frame.add(label1);
        frame.add(l1);
        frame.add(panel1);

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
                    new AdminDashBoard(textField1);
                    frame.setVisible(false);
                }
            }
        });



        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b12) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
