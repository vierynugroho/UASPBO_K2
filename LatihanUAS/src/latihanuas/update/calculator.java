/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package latihanuas;

/**
 *
 * @author LENOVO
 */
public class calculator extends javax.swing.JFrame {

//  -> Variable
  String angka;
  double result, angka1, angka2;
  int pilih;

  /**
   * Creates new form calculator
   */
  public calculator() {
    initComponents();
    angka = "";
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    ContainerResult = new javax.swing.JPanel();
    Hasil = new javax.swing.JLabel();
    ButtonArea = new javax.swing.JPanel();
    BtnClear = new javax.swing.JButton();
    BtnPangkat = new javax.swing.JButton();
    BtnModulo = new javax.swing.JButton();
    BtnBagi = new javax.swing.JButton();
    Btn7 = new javax.swing.JButton();
    Btn8 = new javax.swing.JButton();
    Btn9 = new javax.swing.JButton();
    BtnKali = new javax.swing.JButton();
    Btn4 = new javax.swing.JButton();
    Btn5 = new javax.swing.JButton();
    BtnKurang = new javax.swing.JButton();
    BtnKoma = new javax.swing.JButton();
    BtnTambah = new javax.swing.JButton();
    Btn3 = new javax.swing.JButton();
    Btn6 = new javax.swing.JButton();
    Btn0 = new javax.swing.JButton();
    Btn1 = new javax.swing.JButton();
    BtnHasil = new javax.swing.JButton();
    Btn2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    ContainerResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    Hasil.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
    Hasil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    Hasil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    javax.swing.GroupLayout ContainerResultLayout = new javax.swing.GroupLayout(ContainerResult);
    ContainerResult.setLayout(ContainerResultLayout);
    ContainerResultLayout.setHorizontalGroup(
      ContainerResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ContainerResultLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(Hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    ContainerResultLayout.setVerticalGroup(
      ContainerResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ContainerResultLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(Hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        .addContainerGap())
    );

    BtnClear.setBackground(new java.awt.Color(255, 255, 204));
    BtnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    BtnClear.setForeground(new java.awt.Color(0, 0, 0));
    BtnClear.setText("C");
    BtnClear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnClearActionPerformed(evt);
      }
    });

    BtnPangkat.setBackground(new java.awt.Color(255, 255, 204));
    BtnPangkat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    BtnPangkat.setForeground(new java.awt.Color(0, 0, 0));
    BtnPangkat.setText("^");
    BtnPangkat.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnPangkatActionPerformed(evt);
      }
    });

    BtnModulo.setBackground(new java.awt.Color(255, 255, 204));
    BtnModulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    BtnModulo.setForeground(new java.awt.Color(0, 0, 0));
    BtnModulo.setText("%");
    BtnModulo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnModuloActionPerformed(evt);
      }
    });

    BtnBagi.setBackground(new java.awt.Color(255, 255, 204));
    BtnBagi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    BtnBagi.setForeground(new java.awt.Color(0, 0, 0));
    BtnBagi.setText(":");
    BtnBagi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnBagiActionPerformed(evt);
      }
    });

    Btn7.setText("7");
    Btn7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn7ActionPerformed(evt);
      }
    });

    Btn8.setText("8");
    Btn8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn8ActionPerformed(evt);
      }
    });

    Btn9.setText("9");
    Btn9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn9ActionPerformed(evt);
      }
    });

    BtnKali.setBackground(new java.awt.Color(255, 255, 204));
    BtnKali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    BtnKali.setForeground(new java.awt.Color(0, 0, 0));
    BtnKali.setText("X");
    BtnKali.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnKaliActionPerformed(evt);
      }
    });

    Btn4.setText("4");
    Btn4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn4ActionPerformed(evt);
      }
    });

    Btn5.setText("5");
    Btn5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn5ActionPerformed(evt);
      }
    });

    BtnKurang.setBackground(new java.awt.Color(255, 255, 204));
    BtnKurang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    BtnKurang.setForeground(new java.awt.Color(0, 0, 0));
    BtnKurang.setText("-");
    BtnKurang.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnKurangActionPerformed(evt);
      }
    });

    BtnKoma.setText(",");
    BtnKoma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnKomaActionPerformed(evt);
      }
    });

    BtnTambah.setBackground(new java.awt.Color(255, 255, 204));
    BtnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    BtnTambah.setForeground(new java.awt.Color(0, 0, 0));
    BtnTambah.setText("+");
    BtnTambah.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnTambahActionPerformed(evt);
      }
    });

    Btn3.setText("3");
    Btn3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn3ActionPerformed(evt);
      }
    });

    Btn6.setText("6");
    Btn6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn6ActionPerformed(evt);
      }
    });

    Btn0.setText("0");
    Btn0.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn0ActionPerformed(evt);
      }
    });

    Btn1.setText("1");
    Btn1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn1ActionPerformed(evt);
      }
    });

    BtnHasil.setBackground(new java.awt.Color(255, 51, 51));
    BtnHasil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    BtnHasil.setText("=");
    BtnHasil.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnHasilActionPerformed(evt);
      }
    });

    Btn2.setText("2");
    Btn2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout ButtonAreaLayout = new javax.swing.GroupLayout(ButtonArea);
    ButtonArea.setLayout(ButtonAreaLayout);
    ButtonAreaLayout.setHorizontalGroup(
      ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ButtonAreaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(ButtonAreaLayout.createSequentialGroup()
              .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Btn0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonAreaLayout.createSequentialGroup()
              .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ButtonAreaLayout.createSequentialGroup()
              .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(BtnPangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(ButtonAreaLayout.createSequentialGroup()
            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(ButtonAreaLayout.createSequentialGroup()
            .addComponent(BtnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonAreaLayout.createSequentialGroup()
            .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(ButtonAreaLayout.createSequentialGroup()
            .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(ButtonAreaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(ButtonAreaLayout.createSequentialGroup()
                .addComponent(BtnModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(ButtonAreaLayout.createSequentialGroup()
                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    ButtonAreaLayout.setVerticalGroup(
      ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ButtonAreaLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(BtnPangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(BtnModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(BtnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(ButtonAreaLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(BtnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(ButtonAreaLayout.createSequentialGroup()
            .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(ButtonAreaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonAreaLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(ButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(BtnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(BtnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(14, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(ContainerResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(ButtonArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(ContainerResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(ButtonArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
//    -> Button 2
    angka += '2';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn2ActionPerformed

  private void BtnHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHasilActionPerformed
//    -> Button =
    switch (pilih) {
      case 1:
        angka2 = Double.parseDouble(angka);
//        -> Down Casting
        OperatorMatematics op_penjumlahan = new Penjumlahan(angka1, angka2);
        Hasil.setText(((Penjumlahan) op_penjumlahan).result());
        break;
      case 2:
        angka2 = Double.parseDouble(angka);
//        -> Down Casting
        OperatorMatematics op_pengurangan = new Pengurangan(angka1, angka2);
        Hasil.setText(((Pengurangan) op_pengurangan).result());

        break;
      case 3:
        angka2 = Double.parseDouble(angka);
//        -> Down Casting
        OperatorMatematics op_perkalian = new Perkalian(angka1, angka2);
        Hasil.setText(((Perkalian) op_perkalian).result());
        break;
      case 4:
        angka2 = Double.parseDouble(angka);
//        -> Down Casting
        OperatorMatematics op_pembagian = new Pembagian(angka1, angka2);
        Hasil.setText(((Pembagian) op_pembagian).result());
        break;
      case 5:
        angka2 = Double.parseDouble(angka);
//        -> Down Casting
        OperatorMatematics op_modulo = new Modulus(angka1, angka2);
        Hasil.setText(((Modulus) op_modulo).result());
        break;
      case 6:
        angka2 = Double.parseDouble(angka);
//        -> Down Casting
        OperatorMatematics op_pangkat = new Pangkat(angka1, angka2);
        Hasil.setText(((Pangkat) op_pangkat).result());
        break;
      default:
        throw new AssertionError();
    }
  }//GEN-LAST:event_BtnHasilActionPerformed

  private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
//    -> Button 1
    angka += '1';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn1ActionPerformed

  private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
//    -> Button 0
    angka += '0';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn0ActionPerformed

  private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
//    -> Button 6
    angka += '6';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn6ActionPerformed

  private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
//    -> Button 3
    angka += '3';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn3ActionPerformed

  private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
//    -> Button +
    angka1 = Double.parseDouble(angka);
    Hasil.setText(" + ");
    angka = "";
    pilih = 1;
  }//GEN-LAST:event_BtnTambahActionPerformed

  private void BtnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKomaActionPerformed
//    -> Button ,
    angka += '.';
    Hasil.setText(angka);
  }//GEN-LAST:event_BtnKomaActionPerformed

  private void BtnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKurangActionPerformed
//    -> Button -
    angka1 = Double.parseDouble(angka);
    Hasil.setText(" - ");
    angka = "";
    pilih = 2;
  }//GEN-LAST:event_BtnKurangActionPerformed

  private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
//    -> Button 5
    angka += '5';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn5ActionPerformed

  private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
//    -> Button 4
    angka += '4';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn4ActionPerformed

  private void BtnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKaliActionPerformed
//    -> Button X
    angka1 = Double.parseDouble(angka);
    Hasil.setText(" x ");
    angka = "";
    pilih = 3;
  }//GEN-LAST:event_BtnKaliActionPerformed

  private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
//    -> Button 9
    angka += '9';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn9ActionPerformed

  private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
//    -> Button 7
    angka += '7';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn7ActionPerformed

  private void BtnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBagiActionPerformed
//    -> Button :
    angka1 = Double.parseDouble(angka);
    Hasil.setText(" : ");
    angka = "";
    pilih = 4;
  }//GEN-LAST:event_BtnBagiActionPerformed

  private void BtnModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModuloActionPerformed
//    -> Button %
    angka1 = Double.parseDouble(angka);
    Hasil.setText("%");
    angka = "";
    pilih = 5;
  }//GEN-LAST:event_BtnModuloActionPerformed

  private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
//    -> Button C
    Hasil.setText("");
    result = 0;
    angka = "";
    angka1 = 0;
    angka2 = 0;
  }//GEN-LAST:event_BtnClearActionPerformed

  private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
//    -> Button 8
    angka += '8';
    Hasil.setText(angka);
  }//GEN-LAST:event_Btn8ActionPerformed

  private void BtnPangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPangkatActionPerformed
//   -> Button Pangkat
    angka1 = Double.parseDouble(angka);
    Hasil.setText(" ^ ");
    angka = "";
    pilih = 6;
  }//GEN-LAST:event_BtnPangkatActionPerformed

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
      java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new calculator().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Btn0;
  private javax.swing.JButton Btn1;
  private javax.swing.JButton Btn2;
  private javax.swing.JButton Btn3;
  private javax.swing.JButton Btn4;
  private javax.swing.JButton Btn5;
  private javax.swing.JButton Btn6;
  private javax.swing.JButton Btn7;
  private javax.swing.JButton Btn8;
  private javax.swing.JButton Btn9;
  private javax.swing.JButton BtnBagi;
  private javax.swing.JButton BtnClear;
  private javax.swing.JButton BtnHasil;
  private javax.swing.JButton BtnKali;
  private javax.swing.JButton BtnKoma;
  private javax.swing.JButton BtnKurang;
  private javax.swing.JButton BtnModulo;
  private javax.swing.JButton BtnPangkat;
  private javax.swing.JButton BtnTambah;
  private javax.swing.JPanel ButtonArea;
  private javax.swing.JPanel ContainerResult;
  private javax.swing.JLabel Hasil;
  // End of variables declaration//GEN-END:variables
}
