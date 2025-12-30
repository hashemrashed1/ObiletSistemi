/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otobusbiletsatissistemi;

import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class SelectSeat extends javax.swing.JFrame {

    private Trip trip;
    private AnaSayfa anaSayfa;

    public SelectSeat(Trip trip, AnaSayfa anaSayfa) {
        this.anaSayfa = anaSayfa;
        this.trip = trip;
        initComponents();
    }

    private JButton selectedSeat;
    private String currentSeat;
    private Boolean isSeatSelected = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopUp = new javax.swing.JPopupMenu();
        boyJmenu = new javax.swing.JMenuItem();
        girlJmenu = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Koltuk_20 = new javax.swing.JButton();
        Koltuk_10 = new javax.swing.JButton();
        Koltuk_1 = new javax.swing.JButton();
        Koltuk_21 = new javax.swing.JButton();
        Koltuk_11 = new javax.swing.JButton();
        Koltuk_23 = new javax.swing.JButton();
        Koltuk_13 = new javax.swing.JButton();
        Koltuk_12 = new javax.swing.JButton();
        Koltuk_22 = new javax.swing.JButton();
        Koltuk_16 = new javax.swing.JButton();
        Koltuk_17 = new javax.swing.JButton();
        Koltuk_26 = new javax.swing.JButton();
        Koltuk_27 = new javax.swing.JButton();
        Koltuk_15 = new javax.swing.JButton();
        Koltuk_25 = new javax.swing.JButton();
        Koltuk_24 = new javax.swing.JButton();
        Koltuk_14 = new javax.swing.JButton();
        Koltuk_18 = new javax.swing.JButton();
        Koltuk_28 = new javax.swing.JButton();
        Koltuk_2 = new javax.swing.JButton();
        Koltuk_4 = new javax.swing.JButton();
        Koltuk_3 = new javax.swing.JButton();
        Koltuk_7 = new javax.swing.JButton();
        Koltuk_6 = new javax.swing.JButton();
        Koltuk_5 = new javax.swing.JButton();
        Koltuk_9 = new javax.swing.JButton();
        Koltuk_8 = new javax.swing.JButton();
        Koltuk_19 = new javax.swing.JButton();
        Koltuk_29 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OnaylaBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        PopUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PopUpMouseClicked(evt);
            }
        });

        boyJmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boy.png"))); // NOI18N
        boyJmenu.setActionCommand("boy");
        boyJmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boyJmenuActionPerformed(evt);
            }
        });
        PopUp.add(boyJmenu);

        girlJmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/girl.png"))); // NOI18N
        girlJmenu.setActionCommand("girl");
        girlJmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        girlJmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girlJmenuActionPerformed(evt);
            }
        });
        PopUp.add(girlJmenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/wheel.png"))); // NOI18N

        Koltuk_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_20.setActionCommand("Koltuk 20");
        Koltuk_20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_20MouseClicked(evt);
            }
        });

        Koltuk_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_10.setActionCommand("Koltuk 10");
        Koltuk_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_10MouseClicked(evt);
            }
        });

        Koltuk_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_1.setActionCommand("Koltuk 1");
        Koltuk_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_1MouseClicked(evt);
            }
        });
        Koltuk_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Koltuk_1ActionPerformed(evt);
            }
        });

        Koltuk_21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_21.setActionCommand("Koltuk 21");
        Koltuk_21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_21MouseClicked(evt);
            }
        });

        Koltuk_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_11.setActionCommand("Koltuk 11");
        Koltuk_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_11MouseClicked(evt);
            }
        });

        Koltuk_23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_23.setActionCommand("Koltuk 23");
        Koltuk_23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_23MouseClicked(evt);
            }
        });

        Koltuk_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_13.setActionCommand("Koltuk 13");
        Koltuk_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_13MouseClicked(evt);
            }
        });

        Koltuk_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_12.setActionCommand("Koltuk 12");
        Koltuk_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_12MouseClicked(evt);
            }
        });

        Koltuk_22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_22.setActionCommand("Koltuk 22");
        Koltuk_22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_22MouseClicked(evt);
            }
        });

        Koltuk_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_16.setActionCommand("Koltuk 16");
        Koltuk_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_16MouseClicked(evt);
            }
        });

        Koltuk_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_17.setActionCommand("Koltuk 17");
        Koltuk_17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_17MouseClicked(evt);
            }
        });

        Koltuk_26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_26.setActionCommand("Koltuk 26");
        Koltuk_26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_26MouseClicked(evt);
            }
        });

        Koltuk_27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_27.setActionCommand("Koltuk 27");
        Koltuk_27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_27MouseClicked(evt);
            }
        });

        Koltuk_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_15.setActionCommand("Koltuk 15");
        Koltuk_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_15MouseClicked(evt);
            }
        });

        Koltuk_25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_25.setActionCommand("Koltuk 25");
        Koltuk_25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_25MouseClicked(evt);
            }
        });

        Koltuk_24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_24.setActionCommand("Koltuk 24");
        Koltuk_24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_24MouseClicked(evt);
            }
        });

        Koltuk_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_14.setActionCommand("Koltuk 14");
        Koltuk_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_14MouseClicked(evt);
            }
        });

        Koltuk_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_18.setActionCommand("Koltuk 18");
        Koltuk_18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_18MouseClicked(evt);
            }
        });

        Koltuk_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_28.setActionCommand("Koltuk 28");
        Koltuk_28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_28MouseClicked(evt);
            }
        });

        Koltuk_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_2.setActionCommand("Koltuk 2");
        Koltuk_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_2MouseClicked(evt);
            }
        });

        Koltuk_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_4.setActionCommand("Koltuk 4");
        Koltuk_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_4MouseClicked(evt);
            }
        });

        Koltuk_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_3.setActionCommand("Koltuk 3");
        Koltuk_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_3MouseClicked(evt);
            }
        });

        Koltuk_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_7.setActionCommand("Koltuk 7");
        Koltuk_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_7MouseClicked(evt);
            }
        });

        Koltuk_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_6.setActionCommand("Koltuk 6");
        Koltuk_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_6MouseClicked(evt);
            }
        });

        Koltuk_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_5.setActionCommand("Koltuk 5");
        Koltuk_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_5MouseClicked(evt);
            }
        });

        Koltuk_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_9.setActionCommand("Koltuk 9");
        Koltuk_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_9MouseClicked(evt);
            }
        });

        Koltuk_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_8.setActionCommand("Koltuk 8");
        Koltuk_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_8MouseClicked(evt);
            }
        });

        Koltuk_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_19.setActionCommand("Koltuk 19");
        Koltuk_19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_19MouseClicked(evt);
            }
        });

        Koltuk_29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N
        Koltuk_29.setToolTipText("");
        Koltuk_29.setActionCommand("Koltuk 29");
        Koltuk_29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Koltuk_29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Koltuk_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Koltuk_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Koltuk_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Koltuk_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Koltuk_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Koltuk_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Koltuk_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Koltuk_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Koltuk_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Koltuk_10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Koltuk_11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Koltuk_20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Koltuk_21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Koltuk_12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Koltuk_13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Koltuk_22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Koltuk_23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Koltuk_14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Koltuk_15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Koltuk_24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Koltuk_25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Koltuk_16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Koltuk_17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Koltuk_18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Koltuk_19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Koltuk_20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Koltuk_10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Koltuk_22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Koltuk_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Koltuk_24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Koltuk_14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Koltuk_15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Koltuk_26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Koltuk_16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Koltuk_28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Koltuk_18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Koltuk_27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Koltuk_17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Koltuk_29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Koltuk_19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Koltuk_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koltuk_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koltuk_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koltuk_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koltuk_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koltuk_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koltuk_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koltuk_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koltuk_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boy.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/girl.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Dolu Koltuk - Erkek");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Dolu Koltuk - Kadın");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Boş Koltuk");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Seçilen Koltuk");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boş.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/avalible.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        OnaylaBtn.setBackground(new java.awt.Color(0, 102, 0));
        OnaylaBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        OnaylaBtn.setForeground(new java.awt.Color(255, 255, 255));
        OnaylaBtn.setText("Onayla ve Devam Edin");
        OnaylaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnaylaBtnActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setText("Lütfen Soldan Koltuk Seçin.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(OnaylaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(67, 67, 67)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(217, 217, 217))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(OnaylaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Koltuk_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Koltuk_1ActionPerformed

    }//GEN-LAST:event_Koltuk_1ActionPerformed

    private void boyJmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boyJmenuActionPerformed
        if (selectedSeat != null) {
            selectedSeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/boy.png")));
            isSeatSelected = true;
            trip.setSeat(currentSeat);
        }

    }//GEN-LAST:event_boyJmenuActionPerformed

    private void girlJmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girlJmenuActionPerformed
        if (selectedSeat != null) {
            selectedSeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/girl.png")));
            isSeatSelected = true;
            trip.setSeat(currentSeat);
        }
    }//GEN-LAST:event_girlJmenuActionPerformed

    private void PopUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PopUpMouseClicked

    }//GEN-LAST:event_PopUpMouseClicked

    private void Koltuk_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_1MouseClicked

        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            currentSeat = selectedSeat.getActionCommand();

            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

        }

    }//GEN-LAST:event_Koltuk_1MouseClicked

    private void Koltuk_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_10MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_10MouseClicked

    private void Koltuk_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_2MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_2MouseClicked

    private void Koltuk_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_3MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_3MouseClicked

    private void Koltuk_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_4MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_4MouseClicked

    private void Koltuk_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_5MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_5MouseClicked

    private void Koltuk_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_6MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_6MouseClicked

    private void Koltuk_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_7MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_7MouseClicked

    private void Koltuk_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_8MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_8MouseClicked

    private void Koltuk_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_9MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_9MouseClicked

    private void Koltuk_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_11MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_11MouseClicked

    private void Koltuk_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_12MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_12MouseClicked

    private void Koltuk_13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_13MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_13MouseClicked

    private void Koltuk_14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_14MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_14MouseClicked

    private void Koltuk_15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_15MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_15MouseClicked

    private void Koltuk_16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_16MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_16MouseClicked

    private void Koltuk_17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_17MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_17MouseClicked

    private void Koltuk_18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_18MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_18MouseClicked

    private void Koltuk_19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_19MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_19MouseClicked

    private void Koltuk_20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_20MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_20MouseClicked

    private void Koltuk_21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_21MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_21MouseClicked

    private void Koltuk_22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_22MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_22MouseClicked

    private void Koltuk_23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_23MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_23MouseClicked

    private void Koltuk_24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_24MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_24MouseClicked

    private void Koltuk_25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_25MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_25MouseClicked

    private void Koltuk_26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_26MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_26MouseClicked

    private void Koltuk_27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_27MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_27MouseClicked

    private void Koltuk_28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_28MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_28MouseClicked

    private void Koltuk_29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Koltuk_29MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            selectedSeat = (JButton) evt.getSource();
            PopUp.show(evt.getComponent(), evt.getX(), evt.getY());

            currentSeat = selectedSeat.getActionCommand();
        }
    }//GEN-LAST:event_Koltuk_29MouseClicked

    private void OnaylaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnaylaBtnActionPerformed
        if (isSeatSelected == true) {
            OdemePage a = new OdemePage(trip, anaSayfa);
            //a.setNeredenOdeme(trip.getNereden());
            //System.out.println(trip.getNereden());
            a.setVisible(true);
            a.setLocationRelativeTo(null);
            this.dispose();
        } else {
            Uyari a = new Uyari();
            a.setVisible(true);
            a.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_OnaylaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SelectSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SelectSeat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Koltuk_1;
    private javax.swing.JButton Koltuk_10;
    private javax.swing.JButton Koltuk_11;
    private javax.swing.JButton Koltuk_12;
    private javax.swing.JButton Koltuk_13;
    private javax.swing.JButton Koltuk_14;
    private javax.swing.JButton Koltuk_15;
    private javax.swing.JButton Koltuk_16;
    private javax.swing.JButton Koltuk_17;
    private javax.swing.JButton Koltuk_18;
    private javax.swing.JButton Koltuk_19;
    private javax.swing.JButton Koltuk_2;
    private javax.swing.JButton Koltuk_20;
    private javax.swing.JButton Koltuk_21;
    private javax.swing.JButton Koltuk_22;
    private javax.swing.JButton Koltuk_23;
    private javax.swing.JButton Koltuk_24;
    private javax.swing.JButton Koltuk_25;
    private javax.swing.JButton Koltuk_26;
    private javax.swing.JButton Koltuk_27;
    private javax.swing.JButton Koltuk_28;
    private javax.swing.JButton Koltuk_29;
    private javax.swing.JButton Koltuk_3;
    private javax.swing.JButton Koltuk_4;
    private javax.swing.JButton Koltuk_5;
    private javax.swing.JButton Koltuk_6;
    private javax.swing.JButton Koltuk_7;
    private javax.swing.JButton Koltuk_8;
    private javax.swing.JButton Koltuk_9;
    private javax.swing.JButton OnaylaBtn;
    private javax.swing.JPopupMenu PopUp;
    private javax.swing.JMenuItem boyJmenu;
    private javax.swing.JMenuItem girlJmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
