/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgfinal.project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OAnDo03O
 */
public class IYAutoTech extends javax.swing.JFrame {

    /**
     * Creates new form IYAutoTech
     */
    public IYAutoTech() {
        initComponents();
    // ...
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recordFrame = new javax.swing.JFrame();
        titleLabel1 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        dateLabel2 = new javax.swing.JLabel();
        dateField1 = new javax.swing.JTextField();
        dateField2 = new javax.swing.JTextField();
        jobOption1 = new javax.swing.JCheckBox();
        jobOption2 = new javax.swing.JCheckBox();
        jobOption3 = new javax.swing.JCheckBox();
        descOption = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        dateLabel3 = new javax.swing.JLabel();
        recordButton1 = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();
        descFrame = new javax.swing.JFrame();
        titleLabel2 = new javax.swing.JLabel();
        recordButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        background2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        descDialog = new javax.swing.JDialog();
        titleLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        background3 = new javax.swing.JLabel();
        invenFrame = new javax.swing.JFrame();
        titleLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        background5 = new javax.swing.JLabel();
        websiteFrame = new javax.swing.JFrame();
        titleLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        background6 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        recordButton = new javax.swing.JButton();
        descButton = new javax.swing.JButton();
        invenButton = new javax.swing.JButton();
        websiteButton = new javax.swing.JButton();
        nameLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        logoLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        recordFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        recordFrame.setTitle("Record Jobs");
        recordFrame.setAutoRequestFocus(false);
        recordFrame.setBounds(new java.awt.Rectangle(0, 0, 550, 400));
        recordFrame.setMaximumSize(recordFrame.getPreferredSize());
        recordFrame.setMinimumSize(recordFrame.getPreferredSize());
        recordFrame.setPreferredSize(new java.awt.Dimension(550, 425));
        recordFrame.setResizable(false);
        recordFrame.setSize(recordFrame.getPreferredSize());
        recordFrame.getContentPane().setLayout(null);

        titleLabel1.setBackground(new java.awt.Color(102, 102, 102));
        titleLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel1.setText("Record Jobs");
        titleLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        titleLabel1.setOpaque(true);
        recordFrame.getContentPane().add(titleLabel1);
        titleLabel1.setBounds(100, 35, 350, 60);

        jLabel.setBackground(new java.awt.Color(153, 153, 153));
        jLabel.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Choose The Job You'd \nLike To Record: ");
        jLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel.setMaximumSize(new java.awt.Dimension(146, 32));
        jLabel.setMinimumSize(new java.awt.Dimension(146, 32));
        jLabel.setOpaque(true);
        jLabel.setPreferredSize(new java.awt.Dimension(146, 32));
        recordFrame.getContentPane().add(jLabel);
        jLabel.setBounds(40, 130, 270, 45);

        dateLabel1.setBackground(new java.awt.Color(153, 153, 153));
        dateLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        dateLabel1.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel1.setText("Date Started:");
        dateLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dateLabel1.setMaximumSize(new java.awt.Dimension(146, 32));
        dateLabel1.setMinimumSize(new java.awt.Dimension(146, 32));
        dateLabel1.setOpaque(true);
        dateLabel1.setPreferredSize(new java.awt.Dimension(146, 32));
        recordFrame.getContentPane().add(dateLabel1);
        dateLabel1.setBounds(40, 180, 150, 45);

        dateLabel2.setBackground(new java.awt.Color(153, 153, 153));
        dateLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        dateLabel2.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel2.setText("Date Finished:");
        dateLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dateLabel2.setMaximumSize(new java.awt.Dimension(146, 32));
        dateLabel2.setMinimumSize(new java.awt.Dimension(146, 32));
        dateLabel2.setOpaque(true);
        dateLabel2.setPreferredSize(new java.awt.Dimension(146, 32));
        recordFrame.getContentPane().add(dateLabel2);
        dateLabel2.setBounds(40, 230, 150, 45);
        recordFrame.getContentPane().add(dateField1);
        dateField1.setBounds(210, 185, 80, 35);
        recordFrame.getContentPane().add(dateField2);
        dateField2.setBounds(210, 235, 80, 35);

        jobOption1.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(jobOption1);
        jobOption1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jobOption1.setText("Oil Change");
        jobOption1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jobOption1.setOpaque(true);
        jobOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobOption1ActionPerformed(evt);
            }
        });
        recordFrame.getContentPane().add(jobOption1);
        jobOption1.setBounds(350, 130, 180, 25);

        jobOption2.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(jobOption2);
        jobOption2.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jobOption2.setText("Brake Service");
        jobOption2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jobOption2.setOpaque(true);
        jobOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobOption2ActionPerformed(evt);
            }
        });
        recordFrame.getContentPane().add(jobOption2);
        jobOption2.setBounds(350, 165, 180, 25);

        jobOption3.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(jobOption3);
        jobOption3.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jobOption3.setText("Other");
        jobOption3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jobOption3.setOpaque(true);
        jobOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobOption3ActionPerformed(evt);
            }
        });
        recordFrame.getContentPane().add(jobOption3);
        jobOption3.setBounds(350, 200, 180, 25);

        descOption.setBackground(new java.awt.Color(204, 204, 204));
        descOption.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        descOption.setText("Add Description");
        descOption.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        descOption.setOpaque(true);
        descOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descOptionActionPerformed(evt);
            }
        });
        recordFrame.getContentPane().add(descOption);
        descOption.setBounds(350, 235, 180, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        recordFrame.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 270, 180, 100);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        recordFrame.getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 120, 200, 260);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boss", "Manager", "Worker 1", "Worker 2", "Worker 3" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        recordFrame.getContentPane().add(jComboBox2);
        jComboBox2.setBounds(210, 290, 83, 30);

        dateLabel3.setBackground(new java.awt.Color(153, 153, 153));
        dateLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        dateLabel3.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel3.setText("Who Was Working?");
        dateLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dateLabel3.setMaximumSize(new java.awt.Dimension(146, 32));
        dateLabel3.setMinimumSize(new java.awt.Dimension(146, 32));
        dateLabel3.setOpaque(true);
        dateLabel3.setPreferredSize(new java.awt.Dimension(146, 32));
        recordFrame.getContentPane().add(dateLabel3);
        dateLabel3.setBounds(40, 280, 150, 45);

        recordButton1.setText("Record Job");
        recordButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        recordButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButton1ActionPerformed(evt);
            }
        });
        recordFrame.getContentPane().add(recordButton1);
        recordButton1.setBounds(150, 340, 150, 35);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assestsPackage/gradient.png"))); // NOI18N
        background1.setText("background");
        recordFrame.getContentPane().add(background1);
        background1.setBounds(-3, -4, 560, 410);

        descFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        descFrame.setTitle("Record Jobs");
        descFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        descFrame.setMaximumSize(recordFrame.getPreferredSize());
        descFrame.setMinimumSize(recordFrame.getPreferredSize());
        descFrame.setPreferredSize(new java.awt.Dimension(550, 400));
        descFrame.setResizable(false);
        descFrame.setSize(recordFrame.getPreferredSize());
        descFrame.getContentPane().setLayout(null);

        titleLabel2.setBackground(new java.awt.Color(102, 102, 102));
        titleLabel2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel2.setText("Job Descriptions");
        titleLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        titleLabel2.setOpaque(true);
        descFrame.getContentPane().add(titleLabel2);
        titleLabel2.setBounds(30, 30, 350, 60);

        recordButton2.setText("Check Description");
        recordButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        recordButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButton2ActionPerformed(evt);
            }
        });
        descFrame.getContentPane().add(recordButton2);
        recordButton2.setBounds(400, 40, 110, 35);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Worker 1", "12/10/22", "12/16/22", "Oil Change", "Changed the oil of a 2020 honda pilot"}
            },
            new String [] {
                "Worker", "Started", "Finished", "Job", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(35);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        descFrame.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 490, 260);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assestsPackage/gradient.png"))); // NOI18N
        background2.setText("background");
        descFrame.getContentPane().add(background2);
        background2.setBounds(-3, -4, 560, 410);

        descDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        descDialog.setMaximumSize(descDialog.getPreferredSize());
        descDialog.setMinimumSize(descDialog.getPreferredSize());
        descDialog.setPreferredSize(new java.awt.Dimension(400, 350));
        descDialog.setResizable(false);
        descDialog.setSize(descDialog.getPreferredSize());
        descDialog.getContentPane().setLayout(null);

        titleLabel3.setBackground(new java.awt.Color(102, 102, 102));
        titleLabel3.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        titleLabel3.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel3.setText("Job Descriptions");
        titleLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        titleLabel3.setOpaque(true);
        descDialog.getContentPane().add(titleLabel3);
        titleLabel3.setBounds(20, 20, 350, 60);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        descDialog.getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(40, 90, 310, 180);

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assestsPackage/gradient.png"))); // NOI18N
        background3.setText("background");
        descDialog.getContentPane().add(background3);
        background3.setBounds(-3, -4, 560, 410);

        invenFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        invenFrame.setTitle("Record Jobs");
        invenFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        invenFrame.setMaximumSize(recordFrame.getPreferredSize());
        invenFrame.setMinimumSize(recordFrame.getPreferredSize());
        invenFrame.setPreferredSize(new java.awt.Dimension(550, 400));
        invenFrame.setResizable(false);
        invenFrame.setSize(recordFrame.getPreferredSize());
        invenFrame.getContentPane().setLayout(null);

        titleLabel5.setBackground(new java.awt.Color(102, 102, 102));
        titleLabel5.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        titleLabel5.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel5.setText("WorkShop Inventory");
        titleLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        titleLabel5.setOpaque(true);
        invenFrame.getContentPane().add(titleLabel5);
        titleLabel5.setBounds(100, 35, 350, 60);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""}
            },
            new String [] {
                "Tool Name", "Tool Location", "Tool Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(35);
        jTable2.setShowGrid(true);
        jScrollPane3.setViewportView(jTable2);

        invenFrame.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(50, 110, 450, 260);

        background5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assestsPackage/gradient.png"))); // NOI18N
        background5.setText("background");
        invenFrame.getContentPane().add(background5);
        background5.setBounds(-3, -4, 560, 410);

        websiteFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        websiteFrame.setTitle("Record Jobs");
        websiteFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        websiteFrame.setMaximumSize(recordFrame.getPreferredSize());
        websiteFrame.setMinimumSize(recordFrame.getPreferredSize());
        websiteFrame.setPreferredSize(new java.awt.Dimension(550, 400));
        websiteFrame.setResizable(false);
        websiteFrame.setSize(recordFrame.getPreferredSize());
        websiteFrame.getContentPane().setLayout(null);

        titleLabel6.setBackground(new java.awt.Color(102, 102, 102));
        titleLabel6.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        titleLabel6.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel6.setText("Websites");
        titleLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        titleLabel6.setOpaque(true);
        websiteFrame.getContentPane().add(titleLabel6);
        titleLabel6.setBounds(100, 35, 350, 60);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Amazon", "https://www.amazon.com/automotive-auto-truck-replacements-parts/b?ie=UTF8&node=15684181"},
                {"ebay", "https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334"}
            },
            new String [] {
                "Website Name", "Website Link"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setRowHeight(35);
        jTable3.setShowGrid(true);
        jScrollPane4.setViewportView(jTable3);

        websiteFrame.getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(50, 110, 450, 260);

        background6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assestsPackage/gradient.png"))); // NOI18N
        background6.setText("background");
        websiteFrame.getContentPane().add(background6);
        background6.setBounds(-3, -4, 560, 410);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(getPreferredSize());
        getContentPane().setLayout(null);

        titleLabel.setBackground(new java.awt.Color(102, 102, 102));
        titleLabel.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("I & Y Auto Tech");
        titleLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        titleLabel.setOpaque(true);
        getContentPane().add(titleLabel);
        titleLabel.setBounds(175, 50, 350, 60);

        recordButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        recordButton.setText("Record Jobs");
        recordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(recordButton);
        recordButton.setBounds(125, 175, 200, 32);

        descButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descButton.setText("Job Descriptions");
        descButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descButtonActionPerformed(evt);
            }
        });
        getContentPane().add(descButton);
        descButton.setBounds(375, 175, 200, 32);

        invenButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invenButton.setText("Workshop Inventory");
        invenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invenButtonActionPerformed(evt);
            }
        });
        getContentPane().add(invenButton);
        invenButton.setBounds(125, 250, 200, 32);

        websiteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        websiteButton.setText("Websites");
        websiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                websiteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(websiteButton);
        websiteButton.setBounds(375, 250, 200, 32);

        nameLabel4.setBackground(new java.awt.Color(204, 204, 204));
        nameLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        nameLabel4.setText("Who Is Recording?");
        nameLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nameLabel4.setMaximumSize(new java.awt.Dimension(146, 32));
        nameLabel4.setMinimumSize(new java.awt.Dimension(146, 32));
        nameLabel4.setOpaque(true);
        nameLabel4.setPreferredSize(new java.awt.Dimension(146, 32));
        getContentPane().add(nameLabel4);
        nameLabel4.setBounds(440, 410, 130, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boss", "Manager", "Worker 1", "Worker 2", "Worker 3" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(570, 410, 83, 30);

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assestsPackage/Logo I&Y Auto Tech.png"))); // NOI18N
        logoLabel.setText("jLabel1");
        getContentPane().add(logoLabel);
        logoLabel.setBounds(60, 340, 175, 125);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assestsPackage/gradient.png"))); // NOI18N
        background.setText("background");
        getContentPane().add(background);
        background.setBounds(-3, -4, 700, 510);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void recordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButtonActionPerformed
        // TODO add your handling code here:
        recordFrame.setVisible(true);
    }//GEN-LAST:event_recordButtonActionPerformed

    private void invenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invenButtonActionPerformed
        // TODO add your handling code here:
        invenFrame.setVisible(true);
    // Try File Reader
       try { 
        // Assigning Values
            File fr = new File("C:\\Users\\OAnDo03O\\Documents\\College Folder\\Fall Term 2022-2023\\COP 2800 (Java)\\Final Project\\src\\assestsPackage\\Workshop Inventory.txt");
            Scanner fs = new Scanner(fr);
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
        // Erase Post Values On Jtable2 Before Reading The File Workshop Inventory.txt
            tblModel.setRowCount(0);
        // Checking For New Lines To Add
            while (fs.hasNextLine()) {
                String[] inventory = fs.nextLine().split(", ");
            // Write To Table
                tblModel.addRow(inventory);
            }
       }
       catch (Exception e) { System.out.println(e.getMessage()); }
    }//GEN-LAST:event_invenButtonActionPerformed

    private void websiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_websiteButtonActionPerformed
        // TODO add your handling code here:
        websiteFrame.setVisible(true);
    }//GEN-LAST:event_websiteButtonActionPerformed

    private void descButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descButtonActionPerformed
        // TODO add your handling code here:
       descFrame.setVisible(true);
    // Try File Reader
       try { 
        // Assigning Values
            File fr = new File("C:\\Users\\OAnDo03O\\Documents\\College Folder\\Fall Term 2022-2023\\COP 2800 (Java)\\Final Project\\src\\assestsPackage\\Job Descriptions.txt");
            Scanner fs = new Scanner(fr);
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            // Erase Post Values On Jtable2 Before Reading The File Job Description.txt
            tblModel.setRowCount(0);
        // Checking For New Lines To Add
            while (fs.hasNextLine()) {
                String[] description = fs.nextLine().split(", ");
            // Write To Table
                tblModel.addRow(description);
            }
       }
       catch (Exception e) { System.out.println(e.getMessage()); }
    }//GEN-LAST:event_descButtonActionPerformed

    private void jobOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobOption1ActionPerformed

    private void jobOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobOption2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jobOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobOption3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobOption3ActionPerformed

    private void descOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descOptionActionPerformed
        // TODO add your handling code here:
    // Enable "jTextArea1" If Selected
        if (descOption.isSelected()) { jTextArea1.setEnabled(true); }
        else if (!descOption.isSelected()) { jTextArea1.setEnabled(false); }
    }//GEN-LAST:event_descOptionActionPerformed

    private void recordButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButton1ActionPerformed
        // TODO add your handling code here:
    // Write New Jobs
        try { 
        // Assigning Values
            FileWriter fw = new FileWriter("C:\\Users\\OAnDo03O\\Documents\\College Folder\\Fall Term 2022-2023\\COP 2800 (Java)\\Final Project\\src\\assestsPackage\\Job Descriptions.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            String jobOption = "";
            String description = "";
            
        // Check Which job Was Selected
            if (jobOption1.isSelected()) { jobOption = jobOption1.getText(); }
            else if (jobOption2.isSelected()) { jobOption = jobOption2.getText(); }
            else if (jobOption3.isSelected()) { jobOption = jobOption3.getText(); }
            
        // Remove "\n" from jTextArea1
            Scanner textScan = new Scanner(jTextArea1.getText());
            while (textScan.hasNextLine()) {
                String[] strArray = textScan.nextLine().split("\n");
                for(int i = 0; i < strArray.length; i++) 
                { description += strArray[i];}
                
            }
            
        // Writing Job Description To File "Job Descriptins.txt
            bw.newLine();
        // jComboBox2, dateField1, dateField2, {jobOption1, jobOption2, jobOption3, jobOption4}, jTextArea1
            bw.write(jComboBox2.getItemAt(jComboBox2.getSelectedIndex()) + ", " +
                     dateField1.getText() + ", " +
                     dateField2.getText() + ", " +
                     jobOption + ", " +
                     description);
        // Close File Writer
            bw.close();
            }
        catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }//GEN-LAST:event_recordButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void recordButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButton2ActionPerformed
        // TODO add your handling code here:
    // ...
        if (jTable1.isRowSelected(jTable1.getSelectedRow())) {
            descDialog.setVisible(true);
            jTextArea2.setText("");
            jTextArea2.append(jTable1.getValueAt(
                    jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString());

        }
    }//GEN-LAST:event_recordButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IYAutoTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IYAutoTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IYAutoTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IYAutoTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IYAutoTech().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background3;
    private javax.swing.JLabel background5;
    private javax.swing.JLabel background6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dateField1;
    private javax.swing.JTextField dateField2;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateLabel2;
    private javax.swing.JLabel dateLabel3;
    private javax.swing.JButton descButton;
    private javax.swing.JDialog descDialog;
    private javax.swing.JFrame descFrame;
    private javax.swing.JCheckBox descOption;
    private javax.swing.JButton invenButton;
    private javax.swing.JFrame invenFrame;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JCheckBox jobOption1;
    private javax.swing.JCheckBox jobOption2;
    private javax.swing.JCheckBox jobOption3;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nameLabel4;
    private javax.swing.JButton recordButton;
    private javax.swing.JButton recordButton1;
    private javax.swing.JButton recordButton2;
    private javax.swing.JFrame recordFrame;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel titleLabel3;
    private javax.swing.JLabel titleLabel5;
    private javax.swing.JLabel titleLabel6;
    private javax.swing.JButton websiteButton;
    private javax.swing.JFrame websiteFrame;
    // End of variables declaration//GEN-END:variables
}
