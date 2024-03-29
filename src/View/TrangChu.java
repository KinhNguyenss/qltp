package View;

import DAO.foodDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.food;

public class TrangChu extends javax.swing.JFrame {

    public TrangChu() {
        initComponents();
        hiendulieu();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        timKiemTxt = new javax.swing.JTextField();
        themBtn = new javax.swing.JButton();
        xoaBtn = new javax.swing.JButton();
        capNhatBtn = new javax.swing.JButton();
        timKiemBtn = new javax.swing.JButton();
        dangXuatBtn = new javax.swing.JButton();
        lamMoiBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dsach = new javax.swing.JTable();
        giaTienTxt = new javax.swing.JTextField();
        tenTpTxt = new javax.swing.JTextField();
        donViTinhTxt = new javax.swing.JTextField();
        matpTxt = new javax.swing.JTextField();
        moTaTxt = new javax.swing.JTextField();
        soLuongTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(185, 214, 243));

        jPanel3.setBackground(new java.awt.Color(161, 201, 241));

        timKiemTxt.setBackground(new java.awt.Color(255, 216, 185));
        timKiemTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timKiemTxt.setForeground(new java.awt.Color(0, 0, 0));
        timKiemTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        themBtn.setBackground(new java.awt.Color(7, 157, 217));
        themBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        themBtn.setForeground(new java.awt.Color(0, 0, 0));
        themBtn.setText("Thêm Thực Phẩm");
        themBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themBtnActionPerformed(evt);
            }
        });

        xoaBtn.setBackground(new java.awt.Color(7, 157, 217));
        xoaBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xoaBtn.setForeground(new java.awt.Color(0, 0, 0));
        xoaBtn.setText("Xóa Thực Phẩm");
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });

        capNhatBtn.setBackground(new java.awt.Color(7, 157, 217));
        capNhatBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        capNhatBtn.setForeground(new java.awt.Color(0, 0, 0));
        capNhatBtn.setText("Cập Nhật Thực Phẩm");
        capNhatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capNhatBtnActionPerformed(evt);
            }
        });

        timKiemBtn.setBackground(new java.awt.Color(7, 157, 217));
        timKiemBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timKiemBtn.setForeground(new java.awt.Color(0, 0, 0));
        timKiemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-icon.png"))); // NOI18N
        timKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemBtnActionPerformed(evt);
            }
        });

        dangXuatBtn.setBackground(new java.awt.Color(7, 157, 217));
        dangXuatBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dangXuatBtn.setForeground(new java.awt.Color(0, 0, 0));
        dangXuatBtn.setText("Đăng xuất");
        dangXuatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangXuatBtnActionPerformed(evt);
            }
        });

        lamMoiBtn.setBackground(new java.awt.Color(7, 157, 217));
        lamMoiBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lamMoiBtn.setForeground(new java.awt.Color(0, 0, 0));
        lamMoiBtn.setText("Làm mới");
        lamMoiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamMoiBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dangXuatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timKiemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capNhatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lamMoiBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timKiemBtn))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timKiemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timKiemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(capNhatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dangXuatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel4.setBackground(new java.awt.Color(252, 240, 207));

        dsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã thực phẩm", "Tên thực phẩm", "Số lượng", "Giá tiền", "Đơn vị tính", "Mô tả"
            }
        ));
        dsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dsach);

        giaTienTxt.setBackground(new java.awt.Color(253, 207, 118));
        giaTienTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        giaTienTxt.setForeground(new java.awt.Color(0, 0, 0));
        giaTienTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tenTpTxt.setBackground(new java.awt.Color(253, 207, 118));
        tenTpTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenTpTxt.setForeground(new java.awt.Color(0, 0, 0));
        tenTpTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        donViTinhTxt.setBackground(new java.awt.Color(253, 207, 118));
        donViTinhTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        donViTinhTxt.setForeground(new java.awt.Color(0, 0, 0));
        donViTinhTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        matpTxt.setBackground(new java.awt.Color(253, 207, 118));
        matpTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        matpTxt.setForeground(new java.awt.Color(0, 0, 0));
        matpTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        moTaTxt.setBackground(new java.awt.Color(253, 207, 118));
        moTaTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        moTaTxt.setForeground(new java.awt.Color(0, 0, 0));
        moTaTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        soLuongTxt.setBackground(new java.awt.Color(253, 207, 118));
        soLuongTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        soLuongTxt.setForeground(new java.awt.Color(0, 0, 0));
        soLuongTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mã thực phẩm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Số lượng ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tên thực phẩm");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Đơn vị tính");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mô tả");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Giá tiền");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(soLuongTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(matpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(tenTpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giaTienTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moTaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(donViTinhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giaTienTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tenTpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(donViTinhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moTaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuongTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Đoàn Tuấn Kiệt        23IT2 ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(161, 161, 161))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void themBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themBtnActionPerformed
        food f = new food();
        if (matpTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mã thực phẩm");
        } else if (tenTpTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tên thực phẩm");
        } else if (soLuongTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập số lượng ");
        } else if (giaTienTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập giá tiền");
        } else if (donViTinhTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đơn vị tính");
        } else if (moTaTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mô tả");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
            f.setMaTP(matpTxt.getText());
            f.setTenTP(tenTpTxt.getText());
            f.setSl(soLuongTxt.getText());
            f.setGiatien(giaTienTxt.getText());
            f.setDonViTinh(donViTinhTxt.getText());
            f.setMoTa(moTaTxt.getText());
            DAO.foodDAO.them(f);
            hiendulieu();
            khoiphuc();
        }
    }//GEN-LAST:event_themBtnActionPerformed

    private void dangXuatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangXuatBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_dangXuatBtnActionPerformed

    private void capNhatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capNhatBtnActionPerformed
        food f = new food();
        if (matpTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mã thực phẩm");
        } else if (tenTpTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tên thực phẩm");
        } else if (soLuongTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập số lượng ");
        } else if (giaTienTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập giá tiền");
        } else if (donViTinhTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đơn vị tính");
        } else if (moTaTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mô tả");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
            f.setMaTP(matpTxt.getText());
            f.setTenTP(tenTpTxt.getText());
            f.setSl(soLuongTxt.getText());
            f.setGiatien(giaTienTxt.getText());
            f.setDonViTinh(donViTinhTxt.getText());
            f.setMoTa(moTaTxt.getText());
            DAO.foodDAO.sua(f);
            hiendulieu();
            khoiphuc();
        }
    }//GEN-LAST:event_capNhatBtnActionPerformed

    private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBtnActionPerformed
        food f = new food();
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        f.setMaTP(matpTxt.getText());
        DAO.foodDAO.xoa(f);
        hiendulieu();
        khoiphuc();
    }//GEN-LAST:event_xoaBtnActionPerformed

    private void dsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsachMouseClicked
        DefaultTableModel chonTable = (DefaultTableModel) dsach.getModel();
        int chonDong = dsach.getSelectedRow();
        matpTxt.setText(chonTable.getValueAt(chonDong, 0).toString());
        tenTpTxt.setText(chonTable.getValueAt(chonDong, 1).toString());
        soLuongTxt.setText(chonTable.getValueAt(chonDong, 2).toString());
        giaTienTxt.setText(chonTable.getValueAt(chonDong, 3).toString());
        donViTinhTxt.setText(chonTable.getValueAt(chonDong, 4).toString());
        moTaTxt.setText(chonTable.getValueAt(chonDong, 5).toString());
    }//GEN-LAST:event_dsachMouseClicked

    private void timKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemBtnActionPerformed
        timkiem();
    }//GEN-LAST:event_timKiemBtnActionPerformed

    private void lamMoiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamMoiBtnActionPerformed
        hiendulieu();
        khoiphuc();
    }//GEN-LAST:event_lamMoiBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton capNhatBtn;
    private javax.swing.JButton dangXuatBtn;
    private javax.swing.JTextField donViTinhTxt;
    private javax.swing.JTable dsach;
    private javax.swing.JTextField giaTienTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lamMoiBtn;
    private javax.swing.JTextField matpTxt;
    private javax.swing.JTextField moTaTxt;
    private javax.swing.JTextField soLuongTxt;
    private javax.swing.JTextField tenTpTxt;
    private javax.swing.JButton themBtn;
    private javax.swing.JButton timKiemBtn;
    private javax.swing.JTextField timKiemTxt;
    private javax.swing.JButton xoaBtn;
    // End of variables declaration//GEN-END:variables

    private void hiendulieu() {
        dsach.removeAll();
        dsach.setDefaultEditor(Object.class, null);
        DefaultTableModel model = ((DefaultTableModel) (dsach.getModel()));
        model.setRowCount(0);
        ArrayList<food> dl = foodDAO.dsach();
        for (food f : dl) {
            model.addRow(new Object[]{
                f.getMaTP(),
                f.getTenTP(),
                f.getSl(),
                f.getGiatien(),
                f.getDonViTinh(),
                f.getMoTa()
            });
        }
    }

    private void timkiem() {
        dsach.removeAll();
        String timkiem = timKiemTxt.getText();
        DefaultTableModel model = ((DefaultTableModel) (dsach.getModel()));
        model.setRowCount(0);
        ArrayList<food> dl = foodDAO.timkiem(timkiem);
        for (food f : dl) {
            model.addRow(new Object[]{
                f.getMaTP(),
                f.getTenTP(),
                f.getSl(),
                f.getGiatien(),
                f.getDonViTinh(),
                f.getMoTa()
            });
        }
    }

    private void khoiphuc() {
        timKiemTxt.setText("");
        matpTxt.setText("");
        tenTpTxt.setText("");
        soLuongTxt.setText("");
        giaTienTxt.setText("");
        donViTinhTxt.setText("");
        moTaTxt.setText("");
    }
}
