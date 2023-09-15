/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ursinhos.View;

/**
 *
 * @author 182210137
 */
public class Janela extends javax.swing.JFrame {
   
    float valorB;
    float valorA = 0;
    float valorR ;
    float VT;
    public Janela() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Val = new javax.swing.JLabel();
        fina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Gravata = new javax.swing.JCheckBox();
        Chapeu = new javax.swing.JCheckBox();
        Kunai = new javax.swing.JCheckBox();
        Katana = new javax.swing.JCheckBox();
        Rosas = new javax.swing.JCheckBox();
        Pulseira = new javax.swing.JCheckBox();
        Sabre = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        Terno = new javax.swing.JCheckBox();
        Macacao = new javax.swing.JCheckBox();
        Pijama = new javax.swing.JCheckBox();
        Moletom = new javax.swing.JCheckBox();
        SemR = new javax.swing.JCheckBox();
        Personalisado = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Coelho = new javax.swing.JRadioButton();
        Stich = new javax.swing.JRadioButton();
        Urso = new javax.swing.JRadioButton();
        Yoda = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        Cal = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        Val.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Val.setText("Valor:");

        fina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fina.setText("Finalizar Compra");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Acessórios do Ursinho:");

        Gravata.setText("Gravata");
        Gravata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravataActionPerformed(evt);
            }
        });

        Chapeu.setText("Chapéu de Graduação");
        Chapeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChapeuActionPerformed(evt);
            }
        });

        Kunai.setText("Kunai");
        Kunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KunaiActionPerformed(evt);
            }
        });

        Katana.setText("Katana");
        Katana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatanaActionPerformed(evt);
            }
        });

        Rosas.setText("Rosas Vermelhas");
        Rosas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RosasActionPerformed(evt);
            }
        });

        Pulseira.setText("Pulseira da amizade");
        Pulseira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PulseiraActionPerformed(evt);
            }
        });

        Sabre.setText("Sabre de Luz");
        Sabre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Roupas para Ursinho");

        Terno.setText("Terno");
        Terno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TernoActionPerformed(evt);
            }
        });

        Macacao.setText("Macacão");
        Macacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacacaoActionPerformed(evt);
            }
        });

        Pijama.setText("Pijama");
        Pijama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PijamaActionPerformed(evt);
            }
        });

        Moletom.setText("Moletom");
        Moletom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoletomActionPerformed(evt);
            }
        });

        SemR.setText("Sem roupa");
        SemR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemRActionPerformed(evt);
            }
        });

        Personalisado.setText("Personalizado");
        Personalisado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalisadoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Coelinho(1).png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Ursinho(1).png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Stitch(1).png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Yoda(1).png"))); // NOI18N
        jLabel7.setText("jLabel7");

        buttonGroup1.add(Coelho);
        Coelho.setText("Coelinho");
        Coelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoelhoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Stich);
        Stich.setText("Stitch");
        Stich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StichActionPerformed(evt);
            }
        });

        buttonGroup1.add(Urso);
        Urso.setText("Ursinho Carinhoso");
        Urso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrsoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Yoda);
        Yoda.setText("Yoda");
        Yoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YodaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Monte seu Ursinho");

        Cal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cal.setText("Calcular");
        Cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Coelho)
                                    .addComponent(Urso))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Yoda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(Stich, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Katana)
                            .addComponent(Rosas)
                            .addComponent(Pulseira)
                            .addComponent(Sabre)
                            .addComponent(Gravata)
                            .addComponent(Chapeu)
                            .addComponent(Kunai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Terno)
                            .addComponent(Macacao)
                            .addComponent(Pijama)
                            .addComponent(Moletom)
                            .addComponent(SemR)
                            .addComponent(Personalisado)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel3)))
                        .addGap(81, 81, 81))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Val)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fina)
                        .addGap(79, 79, 79)
                        .addComponent(Cal)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Coelho)
                    .addComponent(Stich))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Urso)
                    .addComponent(Yoda))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Gravata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Chapeu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Kunai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Katana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Rosas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pulseira))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Terno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Macacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pijama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Moletom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SemR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Personalisado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sabre)
                .addGap(12, 12, 12)
                .addComponent(Val)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fina, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cal))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GravataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravataActionPerformed
        if(Gravata.isSelected()){
            valorA = valorA + 8;
        }
    }//GEN-LAST:event_GravataActionPerformed

    private void PijamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PijamaActionPerformed
       if(Pijama.isSelected()){
           valorR = 15;
       }
    }//GEN-LAST:event_PijamaActionPerformed

    private void TernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TernoActionPerformed
       if(Terno.isSelected()){
            valorR = 18;
        }
    }//GEN-LAST:event_TernoActionPerformed

    private void MacacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacacaoActionPerformed
        if(Macacao.isSelected()){
            valorR = 10;
        }
    }//GEN-LAST:event_MacacaoActionPerformed

    private void MoletomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoletomActionPerformed
      if(Moletom.isSelected()){
            valorR =15 ;
        }
    }//GEN-LAST:event_MoletomActionPerformed

    private void SemRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemRActionPerformed
     if(SemR.isSelected()){
            valorR = 0;
        }
    }//GEN-LAST:event_SemRActionPerformed

    private void PersonalisadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonalisadoActionPerformed
         if(Personalisado.isSelected()){
            valorR =20 ;
        }
    }//GEN-LAST:event_PersonalisadoActionPerformed

    private void ChapeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChapeuActionPerformed
        
        if(Chapeu.isSelected()){
            valorA = valorA + 10 ;
        }        
        
    }//GEN-LAST:event_ChapeuActionPerformed

    private void KunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KunaiActionPerformed
        if(Kunai.isSelected()){
            valorA =valorA + 18;
        }        
        
    }//GEN-LAST:event_KunaiActionPerformed

    private void KatanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatanaActionPerformed
         if(Katana.isSelected()){
            valorA =valorA + 20 ;
        }   
    }//GEN-LAST:event_KatanaActionPerformed

    private void RosasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RosasActionPerformed
         if(Rosas.isSelected()){
            valorA =valorA + 15 ;
        }        
    }//GEN-LAST:event_RosasActionPerformed

    private void PulseiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PulseiraActionPerformed
         if(Pulseira.isSelected()){
            valorA =valorA + 10 ;
        }        
        
    }//GEN-LAST:event_PulseiraActionPerformed

    private void SabreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabreActionPerformed
       if(Sabre.isSelected()){
            valorA =valorA + 200 ;
        }        
        
    }//GEN-LAST:event_SabreActionPerformed

    private void CoelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoelhoActionPerformed
       if(Coelho.isSelected()){
           valorB = 55;
       }
    }//GEN-LAST:event_CoelhoActionPerformed

    private void UrsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrsoActionPerformed
        if(Urso.isSelected()){
           valorB = 35;
       }
    }//GEN-LAST:event_UrsoActionPerformed

    private void StichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StichActionPerformed
       if(Stich.isSelected()){
           valorB = 155;
       }
    }//GEN-LAST:event_StichActionPerformed

    private void YodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YodaActionPerformed
        if(Yoda.isSelected()){
           valorB = 300;
       }
    }//GEN-LAST:event_YodaActionPerformed

    private void CalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalActionPerformed

      VT = valorB +valorA+ valorR;
      Val.setText("Valor:R$"+String.valueOf(VT));
        
        
        
        
    }//GEN-LAST:event_CalActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cal;
    private javax.swing.JCheckBox Chapeu;
    private javax.swing.JRadioButton Coelho;
    private javax.swing.JCheckBox Gravata;
    private javax.swing.JCheckBox Katana;
    private javax.swing.JCheckBox Kunai;
    private javax.swing.JCheckBox Macacao;
    private javax.swing.JCheckBox Moletom;
    private javax.swing.JCheckBox Personalisado;
    private javax.swing.JCheckBox Pijama;
    private javax.swing.JCheckBox Pulseira;
    private javax.swing.JCheckBox Rosas;
    private javax.swing.JCheckBox Sabre;
    private javax.swing.JCheckBox SemR;
    private javax.swing.JRadioButton Stich;
    private javax.swing.JCheckBox Terno;
    private javax.swing.JRadioButton Urso;
    private javax.swing.JLabel Val;
    private javax.swing.JRadioButton Yoda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton fina;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
