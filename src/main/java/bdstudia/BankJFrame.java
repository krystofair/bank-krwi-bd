package bdstudia;

import bdstudia.Bank;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author krystofair
 */

public class BankJFrame extends javax.swing.JFrame {
    //referencja do obiektu globalnego factory;
    SessionFactory sf_ref;
    private Bank bank;

    /**
     * Creates new form BankJFrame
     * @param sf - reference to factory
     */
    public BankJFrame(SessionFactory sf) {
        this.sf_ref = sf;
        initComponents();
    }
    public void loadBank(Bank b) {
        this.bank = b;
        int i=0;
        while(true) {
            try {
                switch(i) {
                    case 0:
                        i+=1;
                        jTF_bank_adres.setText(bank.getAdres());
                    case 1:
                        i+=1;
                        jTF_bank_kodpoczt.setText(bank.getKodpocztowy());
                    case 2:
                        i+=1;
                        jTF_bank_kraj.setText(bank.getKraj());
                    case 3:
                        i+=1;
                        jTF_bank_miasto.setText(bank.getMiasto());
                    case 4:
                        i+=1;
                        jTF_bank_name.setText(bank.getNazwa());
                        
                }
                break;
            }
            catch (NullPointerException npe) {
            }
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

        EXECUTE_BUTTON = new javax.swing.JButton();
        jTF_bank_name = new javax.swing.JTextField();
        jTF_bank_adres = new javax.swing.JTextField();
        jTF_bank_miasto = new javax.swing.JTextField();
        jTF_bank_kodpoczt = new javax.swing.JTextField();
        jTF_bank_kraj = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IdLoadedBank = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DODAWANIE BANKU");
        setMinimumSize(new java.awt.Dimension(292, 374));

        EXECUTE_BUTTON.setText("Dodaj");
        EXECUTE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXECUTE_BUTTONActionPerformed(evt);
            }
        });

        jTF_bank_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF_bank_name.setToolTipText("Nazwa Banku");
        jTF_bank_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTF_bank_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_bank_nameKeyTyped(evt);
            }
        });

        jTF_bank_adres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF_bank_adres.setToolTipText("Adres");

        jTF_bank_miasto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF_bank_miasto.setToolTipText("Miasto");
        jTF_bank_miasto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_bank_miastoKeyTyped(evt);
            }
        });

        jTF_bank_kodpoczt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF_bank_kodpoczt.setToolTipText("Kod Pocztowy");
        jTF_bank_kodpoczt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_bank_kodpocztKeyTyped(evt);
            }
        });

        jTF_bank_kraj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF_bank_kraj.setToolTipText("Kraj");
        jTF_bank_kraj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_bank_krajKeyTyped(evt);
            }
        });

        jLabel2.setText("Nazwa Banku");

        jLabel3.setText("Adres");

        jLabel4.setText("Miasto");

        jLabel5.setText("Kod Pocztowy");

        jLabel6.setText("Kraj");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(EXECUTE_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTF_bank_kraj))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTF_bank_adres))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTF_bank_name))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_bank_kodpoczt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTF_bank_miasto)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IdLoadedBank)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IdLoadedBank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_bank_adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_bank_miasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_bank_kodpoczt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_bank_kraj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EXECUTE_BUTTON)
                .addContainerGap())
        );

        jTF_bank_name.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXECUTE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXECUTE_BUTTONActionPerformed
        boolean dodawanie = false;
        if(bank == null) {
            // zebranie nowych informacji.
            bank = new Bank();
            bank.setAdres(jTF_bank_adres.getText());
            bank.setKodpocztowy(jTF_bank_kodpoczt.getText());
            bank.setKraj(jTF_bank_kraj.getText());
            bank.setMiasto(jTF_bank_miasto.getText());
            bank.setNazwa(jTF_bank_name.getText());
            dodawanie = true;
        }
        
        if(!bank.validate() ) {
            JOptionPane.showMessageDialog(this, "Nie poprawne dane, wype³nij wszystkie komórki",
                    "Dodawanie banku. B³¹d.", JOptionPane.WARNING_MESSAGE);
        } else {
            Session sesja = sf_ref.openSession();
            if(dodawanie) {
                EntityManager em = sf_ref.createEntityManager();
                try {
                    em.createQuery("from banki where miasto = :miasto " +
                            "AND adres = :adres", Bank.class)
                            .setParameter("miasto", bank.getMiasto())
                            .setParameter("adres", bank.getAdres())
                            .getSingleResult();
                    JOptionPane.showMessageDialog(this, "Bank w tym mieœcie o podanym adresie ju¿ istnieje, popraw dane lub zamknij okno formularza",
                            "Dodawanie banku. B³¹d.", JOptionPane.WARNING_MESSAGE);

                } catch(NoResultException nre) {
                    //dodawania banku.
                    sesja.beginTransaction();
                    sesja.save(bank);
                    sesja.getTransaction().commit();
                    sesja.close();
                    JOptionPane.showMessageDialog(this, "Pomyœlnie dodano bank do bazy.",
                            "Dodawanie banku. Info.", JOptionPane.INFORMATION_MESSAGE);
                } catch(java.lang.IllegalStateException ise) {
                    // entity manager was close, now here isn't a problem
                    // Problem was here, because running from normal Main program - no in loop of AWT.
                    JOptionPane.showMessageDialog(this, "DEBUG IllegalStateException in BankFormularz.");
                } finally {
                    em.close();
                }
            } else {
                bank.setAdres(jTF_bank_adres.getText());
                bank.setKodpocztowy(jTF_bank_kodpoczt.getText());
                bank.setKraj(jTF_bank_kraj.getText());
                bank.setMiasto(jTF_bank_miasto.getText());
                bank.setNazwa(jTF_bank_name.getText());
                try {
                    sesja.beginTransaction();
                    sesja.update(bank);
                    sesja.getTransaction().commit();
                } catch(RollbackException re) {
                    sesja.getTransaction().rollback();
                    JOptionPane.showMessageDialog(this, "Nie uda³o siê wyedytowaæ banku");
                }
                sesja.close();
                JOptionPane.showMessageDialog(this, "Pomyœlnie wyedytowano wpis banku.");
            }
            
            this.dispose();
        }
    }//GEN-LAST:event_EXECUTE_BUTTONActionPerformed

    private void jTF_bank_kodpocztKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_bank_kodpocztKeyTyped
        if(jTF_bank_kodpoczt.getText().length() >= 32) evt.consume();
        if( !Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != ' ' && evt.getKeyChar()!='-') {
            evt.consume();
        }
    }//GEN-LAST:event_jTF_bank_kodpocztKeyTyped

    private void jTF_bank_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_bank_nameKeyTyped
        if(jTF_bank_name.getText().length() >= 255) evt.consume();
        if( Character.isDigit(evt.getKeyChar()) || !Character.isAlphabetic(evt.getKeyChar())
                && evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jTF_bank_nameKeyTyped

    private void jTF_bank_krajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_bank_krajKeyTyped
        if(jTF_bank_kraj.getText().length() >= 255) evt.consume();
        if( Character.isDigit(evt.getKeyChar()) || !Character.isAlphabetic(evt.getKeyChar())
                && evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jTF_bank_krajKeyTyped

    private void jTF_bank_miastoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_bank_miastoKeyTyped
        if(jTF_bank_miasto.getText().length() >= 64
                || !Character.isAlphabetic(evt.getKeyChar()) || evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jTF_bank_miastoKeyTyped

    void showAddForm(){
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
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        BankJFrame t = this;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                t.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXECUTE_BUTTON;
    private javax.swing.JLabel IdLoadedBank;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTF_bank_adres;
    private javax.swing.JTextField jTF_bank_kodpoczt;
    private javax.swing.JTextField jTF_bank_kraj;
    private javax.swing.JTextField jTF_bank_miasto;
    private javax.swing.JTextField jTF_bank_name;
    // End of variables declaration//GEN-END:variables

    void showEditForm() {
        this.setTitle("EDYTUJ BANK");
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
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        IdLoadedBank.setText("ID BANKU: " + Integer.toString(bank.getIdbanku()));
        BankJFrame t = this;
        EXECUTE_BUTTON.setText("Edytuj");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                t.setVisible(true);
            }
        });
    }
}
