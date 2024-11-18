/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Quis;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
/**
 *
 * @author 3cc
 */
public class ServiceHP extends javax.swing.JFrame {

    /**
     * Creates new form QuisUTS
     */
    public ServiceHP() {
        initComponents();
        tabelFaktur.setModel(tebel);
        
        UIManager.put("OptionPane.okButtonText", "Okeh");
        
        buttonKeluar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WindowEvent windowEvent = new WindowEvent(ServiceHP.this, WindowEvent.WINDOW_CLOSING);
                formWindowClosing(windowEvent);
            }
        });
        
        this.addWindowListener(new WindowAdapter() {
            public void tutupJendela(WindowEvent evt) {
                formWindowClosing(evt);
            }
            
            public void sudahTutup (WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    private javax.swing.table.DefaultTableModel getDefaultTableModel(){
        return new javax.swing.table.DefaultTableModel (
                new Object[][]{},
                new String[]{
                    "Sparepart","Harga","Jumlah","Total"
                }
        ){
            boolean canEdit[] = new boolean[]{false, false, false, false};
            public boolean isCellEditable(int rowInt, int colInt){
                return canEdit[colInt];
            }
        };
                }
    
    String[] data = new String [4];
    private javax.swing.table.DefaultTableModel tebel = getDefaultTableModel();
    int baris = 0;
    
    private String[] getData() {
        data[0] = fieldSparepart.getText().trim();
        data[1] = fieldHarga.getText().trim();
        data[2] = fieldJumlah.getText().trim();
        data[3] = fieldTotal.getText().trim();
        return data;
    }
    
    private void hapusField() {
        fieldSparepart.setText("");
        fieldHarga.setText("");
        fieldJumlah.setText("");
        fieldTotal.setText("");
    }
    
    private boolean validasiField(JTextField field) {
        if (field.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "Field " + field.getName() + " tidak boleh kosong!");
            return false;
        }
        return true;
    }
    
    private boolean validasiAngka(JTextField field) {
        
        String ipuut = field.getText().trim();
        if (ipuut.isBlank()) {
            JOptionPane.showMessageDialog(null, "Field " + field.getName() + " tidak boleh kosong!",
                    "input tidak valid!", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!angkaValid(ipuut)) {
            JOptionPane.showMessageDialog(null, "Field " + field.getName() + " harus berupa angka bulat (integer)!",
                    "input tidak valid!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        float angka = Float.parseFloat(ipuut);
        if (angka < 1) {
            JOptionPane.showMessageDialog(null, "Field " + field.getName() + 
                    " tidak boleh kurang dari satu!", 
                    "input tidak valid!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean angkaValid(String field) {
        try {
            Integer.valueOf(field);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        fieldTelp = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldSparepart = new javax.swing.JTextField();
        fieldHarga = new javax.swing.JTextField();
        fieldJumlah = new javax.swing.JTextField();
        fieldTotal = new javax.swing.JTextField();
        buttonSimpan = new javax.swing.JButton();
        buttonKoreksi = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelFaktur = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldTotalSparepart = new javax.swing.JTextField();
        fieldServis = new javax.swing.JTextField();
        fieldBayar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        buttonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("Telp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel3.setText("HAKIM CELL");

        jLabel4.setText("FAKTUR SERVIS HANDPHONE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel5.setText("Harga");

        jLabel6.setText("Sparepart");

        jLabel7.setText("Total");

        jLabel8.setText("Jumlah");

        fieldSparepart.setName("nama sparepart"); // NOI18N

        fieldHarga.setName("harga"); // NOI18N

        fieldJumlah.setName("jumlah"); // NOI18N
        fieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJumlahActionPerformed(evt);
            }
        });

        fieldTotal.setEditable(false);
        fieldTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldTotalMouseClicked(evt);
            }
        });
        fieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTotalActionPerformed(evt);
            }
        });

        buttonSimpan.setText("SIMPAN");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonKoreksi.setText("KOREKSI");
        buttonKoreksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKoreksiActionPerformed(evt);
            }
        });

        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldSparepart, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(buttonKoreksi)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapus)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSparepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSimpan)
                            .addComponent(buttonKoreksi))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(buttonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelFaktur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelFaktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelFakturMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelFaktur);

        jLabel9.setText("Servis");

        jLabel10.setText("Bayar");

        jLabel11.setText("Total Sparepart");

        fieldTotalSparepart.setEditable(false);
        fieldTotalSparepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldTotalSparepartMouseClicked(evt);
            }
        });
        fieldTotalSparepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTotalSparepartActionPerformed(evt);
            }
        });

        fieldServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldServisActionPerformed(evt);
            }
        });

        fieldBayar.setEditable(false);
        fieldBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldBayarMouseClicked(evt);
            }
        });
        fieldBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldServis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(fieldTotalSparepart, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fieldTotalSparepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fieldServis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        buttonKeluar.setText("KELUAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonKeluar)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonKeluar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJumlahActionPerformed
        // TODO add your handling code here:
        if (!validasiAngka(fieldHarga)) {return;}
        else if (!validasiAngka(fieldJumlah)) {return;}
        
        int hargaJual = Integer.parseInt(fieldHarga.getText().trim());
        int jumlahBeli = Integer.parseInt(fieldJumlah.getText().trim());
        int total = hargaJual * jumlahBeli;
        
        fieldTotal.setText(String.valueOf(total));
        buttonSimpan.setEnabled(true);
    }//GEN-LAST:event_fieldJumlahActionPerformed

    private void fieldTotalSparepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTotalSparepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTotalSparepartActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        fieldJumlahActionPerformed(null);
        
        if (!validasiField(fieldSparepart)) {return;}
        else if (!validasiAngka(fieldHarga)) {return;}
        else if (!validasiAngka(fieldJumlah)) {return;}
        
        String[] data = getData();
        
        tebel.insertRow(baris, data);
        
        hapusField();
        
        buttonSimpan.setEnabled(false);
        totalHarga();
        Bayar();
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonKoreksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKoreksiActionPerformed
        // TODO add your handling code here:
        fieldJumlahActionPerformed(null);
        
        if (!validasiField(fieldSparepart)) {return;}
        else if (!validasiAngka(fieldHarga)) {return;}
        else if (!validasiAngka(fieldJumlah)) {return;}
        
        String[] data = getData();
        
        tebel.removeRow(baris);
        tebel.insertRow(baris, data);
        
        hapusField();
        
        buttonSimpan.setEnabled(true);
        totalHarga();
        Bayar();
    }//GEN-LAST:event_buttonKoreksiActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        hapusField();
        
        tebel.removeRow(baris);
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        
        buttonSimpan.setEnabled(false);
        totalHarga();
        Bayar();
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void fieldServisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldServisActionPerformed
        // TODO add your handling code here:
        if (!validasiAngka(fieldServis)) {return;}
        totalHarga();
        Bayar();
    }//GEN-LAST:event_fieldServisActionPerformed

    private void tabelFakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelFakturMouseClicked
        // TODO add your handling code here:
         if(evt.getClickCount()==1){
            
        hapusField();
        
        baris = tabelFaktur.getSelectedRow();
        
        fieldSparepart.setText(tebel.getValueAt(baris, 0).toString());
        fieldHarga.setText(tebel.getValueAt(baris, 1).toString());
        fieldJumlah.setText(tebel.getValueAt(baris, 2).toString());
        fieldTotal.setText(tebel.getValueAt(baris, 3).toString());
        
        buttonSimpan.setEnabled(false);
        }
    }//GEN-LAST:event_tabelFakturMouseClicked

    private void fieldBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBayarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
        "Selamat menggunakan aplikasi!\n"
                + "Jangan lupa mengisi biaya servis!\n"
                + "JANGAN KORUPSI!\n"
                + "Jangan mengedit total!\n" 
                + "Jangan mengedit total sparepart!\n" 
                + "Jangan mengedit total bayar!", 
        "Membuka Aplikasi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Object[] pilhans = {"Ya, Keluar", "Tak, masih pakai"};
        
        int pilihan1 = JOptionPane.showOptionDialog(null, "Belum terkait dengan database.\n"
                + "Data tidak tersimpan.\nAnda ingin keluar?", "Konfirmasi Keluar", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, pilhans, pilhans[1]);
        if (pilihan1 == JOptionPane.YES_OPTION) {
            dispose();
        } else if (pilihan1 == JOptionPane.NO_OPTION) {
            evt.getWindow().setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Terima Kasih telah menggunakan aplikasi", 
                "Aplikasi Ditutup", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_formWindowClosed

    private void fieldTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldTotalMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            JOptionPane.showMessageDialog(null, "Tidak dapat mengedit total!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fieldTotalMouseClicked

    private void fieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTotalActionPerformed

    private void fieldTotalSparepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldTotalSparepartMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            JOptionPane.showMessageDialog(null, "Tidak dapat mengedit total sparepart!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fieldTotalSparepartMouseClicked

    private void fieldBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldBayarMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            JOptionPane.showMessageDialog(null, "Tidak dapat mengedit total bayar!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fieldBayarMouseClicked

    void totalHarga (){
        double totalHArga = 0;
        int jumlahBaris = tebel.getRowCount();
        
        if (jumlahBaris == 0) {
            fieldTotalSparepart.setText("0.0");
            return;
        }
        
        for (int i = 0; i < jumlahBaris; i++){
            totalHArga = totalHArga 
                    + Double.parseDouble(tabelFaktur.getValueAt(i, 3).toString());
        }
        fieldTotalSparepart.setText(String.valueOf(totalHArga));
    }
    
    void Bayar (){
        float totalSparepart = Float.parseFloat(fieldTotalSparepart.getText().trim());
        String serviss = fieldServis.getText().trim();
        float servis;
        if (serviss.isBlank()) {
            servis = 0;
            fieldServis.setText(String.valueOf(servis));
        } else {
            servis = Float.parseFloat(serviss);
        }
        float bayar = totalSparepart + servis;
        fieldBayar.setText(String.valueOf(bayar));
    }
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
            java.util.logging.Logger.getLogger(ServiceHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceHP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonKoreksi;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JTextField fieldBayar;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldServis;
    private javax.swing.JTextField fieldSparepart;
    private javax.swing.JTextField fieldTelp;
    private javax.swing.JTextField fieldTotal;
    private javax.swing.JTextField fieldTotalSparepart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelFaktur;
    // End of variables declaration//GEN-END:variables
}
