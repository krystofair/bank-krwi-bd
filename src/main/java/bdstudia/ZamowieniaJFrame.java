/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.Query;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


/**
 *
 * @author makma
 */
public class ZamowieniaJFrame extends javax.swing.JFrame {

    private SessionFactory factory;

    /**
     * Creates new form ZamowieniaJFrame
     */
    
    public ZamowieniaJFrame(SessionFactory factory_ref) {
        this.factory = factory_ref;
        initComponents();
        Dodaj_Opis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaZnalezionychOsob = new javax.swing.JList<>();
        ImieEditText2 = new javax.swing.JTextField();
        NazwiskoEditText = new javax.swing.JTextField();
        PeselEditText = new javax.swing.JTextField();
        AdresEditText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SzukajOsobyBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TypProduktuComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelOpisu = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaZnalezionychOsob.setModel(new OsobyZnalezioneModel());
        ListaZnalezionychOsob.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListaZnalezionychOsob);

        ImieEditText2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImieEditText2.setName(""); // NOI18N
        ImieEditText2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImieEditText2KeyTyped(evt);
            }
        });

        NazwiskoEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NazwiskoEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NazwiskoEditTextKeyTyped(evt);
            }
        });

        PeselEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PeselEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PeselEditTextKeyTyped(evt);
            }
        });

        AdresEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AdresEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AdresEditTextKeyTyped(evt);
            }
        });

        jLabel2.setText("Imie :");

        jLabel3.setText("Nazwisko :");

        jLabel4.setText("PESEL :");

        jLabel5.setText("Adres :");

        SzukajOsobyBtn.setText("Szukaj");
        SzukajOsobyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzukajOsobyBtnSzukajHandler(evt);
            }
        });

        jButton2.setText("Ostatnia Dodana Osoba");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NazwiskoEditText, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                    .addComponent(PeselEditText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AdresEditText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ImieEditText2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SzukajOsobyBtn)
                                .addGap(31, 31, 31)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ImieEditText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NazwiskoEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PeselEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AdresEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SzukajOsobyBtn)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Wyb�r Osoby", jPanel1);

        TypProduktuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "osocze", "krew pe�na", "p�ytki krwi" }));
        TypProduktuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypProduktuComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Typ Produktu :");

        jLabel6.setText("Ilo�� :");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel7.setText("Jednostek");

        PanelOpisu.setEditable(false);
        PanelOpisu.setColumns(20);
        PanelOpisu.setRows(5);
        PanelOpisu.setText("ABCDEFGHIJKLMNOUPRSTWXYZ");
        PanelOpisu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelOpisu.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(PanelOpisu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TypProduktuComboBox, 0, 113, Short.MAX_VALUE)
                            .addComponent(jSpinner1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TypProduktuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Wyb�r Produktu", jPanel3);

        jButton1.setText("Z�� zam�wienie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SzukajOsobyBtnSzukajHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajOsobyBtnSzukajHandler
        try (Session sesja = factory.openSession()) {
            CriteriaBuilder cb = sesja.getCriteriaBuilder();
            List<Predicate> predicates = new ArrayList<>();
            if(evt.getSource() == SzukajOsobyBtn) {
                CriteriaQuery<Osoba> cr = cb.createQuery(Osoba.class);
                Root<Osoba> root = cr.from(Osoba.class);
                if(!PeselEditText.getText().isBlank()) {
                    String pesel = PeselEditText.getText();
                    // dodanie predicates - czyli takiego obiektowego warunku XD
                    predicates.add(cb.like(root.get("pesel"), pesel + "%"));
                    //                if(Validator.isOnlyDigit(pesel))
                    //                else
                    //                    JOptionPane.showMessageDialog(
                        //                        this, "Wpisany nr. PESEL jest niepoprawny.",
                        //                        "B��d w nr. PESEL.", JOptionPane.WARNING_MESSAGE);
                } else {
                    if(!ImieEditText2.getText().isBlank()) {
                        String imie = ImieEditText2.getText();
                        predicates.add(cb.like(root.get("imie"), imie+"%"));
                    }
                    if (!NazwiskoEditText.getText().isBlank()) {
                        String nazwisko = NazwiskoEditText.getText();
                        predicates.add(cb.like(root.get("nazwisko"), nazwisko+"%"));
                    }
                    if (!AdresEditText.getText().isBlank()) {
                        String adres = AdresEditText.getText();
                        predicates.add(cb.like(root.get("adres"), "%"+adres+"%"));
                        //                   if(Validator.validateSQL(adres))
                        //                    else
                        //                        JOptionPane.showMessageDialog(this, "Wpisano b��dne znaki");
                        //                    restr.add(Restrictions.ilike("adres", AdresEditText.getText(), MatchMode.START));
                    }
                }
                Predicate[] preds = new Predicate[predicates.size()];
                for(int i=0; i<predicates.size(); ++i) preds[i] = predicates.get(i);
                if(predicates.size() > 0) {
                    cr.where(preds);
                    Query query = sesja.createQuery(cr);
                    ((OsobyZnalezioneModel)
                        ListaZnalezionychOsob.getModel())
                    .dodajOsoby(query.getResultList());
                } else {
                    JOptionPane.showMessageDialog(this, "Musisz wype�ni� przynajmniej jedno pole.");
                }
            }   
            // zamykanie sesji
        }
    }//GEN-LAST:event_SzukajOsobyBtnSzukajHandler

    private void AdresEditTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdresEditTextKeyTyped
        if(AdresEditText.getText().length() > 255 ||
            !Character.isLetterOrDigit(evt.getKeyChar()) &&
            evt.getKeyChar()!= ' ' && evt.getKeyChar() != '/') {
            evt.consume();
        }
    }//GEN-LAST:event_AdresEditTextKeyTyped

    private void PeselEditTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PeselEditTextKeyTyped
        if(!((evt.getKeyChar()>='0') && (evt.getKeyChar()<='9'))
            || PeselEditText.getText().length() > 11)
        evt.consume();
    }//GEN-LAST:event_PeselEditTextKeyTyped

    private void NazwiskoEditTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NazwiskoEditTextKeyTyped
        if(!Character.isAlphabetic(evt.getKeyChar()) && evt.getKeyChar() != ' ' &&
            evt.getKeyChar() != '-') {
            evt.consume();
        }
    }//GEN-LAST:event_NazwiskoEditTextKeyTyped

    private void ImieEditText2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImieEditText2KeyTyped
        if(ImieEditText2.getText().length() > 255
            || !Character.isAlphabetic(evt.getKeyChar())
            && evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_ImieEditText2KeyTyped

    private void TypProduktuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypProduktuComboBoxActionPerformed
         Dodaj_Opis();
    }//GEN-LAST:event_TypProduktuComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public void pokaz_formularz() {
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
            java.util.logging.Logger.getLogger(PobranieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PobranieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PobranieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PobranieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ZamowieniaJFrame t = this;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               t.setVisible(true);
            }
        });
    }
    
    void Dodaj_Opis(){
        switch(TypProduktuComboBox.getSelectedIndex()){
            case 0:
            {                
                PanelOpisu.setText("Jest p�ynn� cz�ci� krwi i stanowi 55% jej obj�to�ci.\n"+
                                   "Jest podstawowym �rodowiskiem dla element�w morfotycznych.\n"+
                                   "Zawiera :\n" +
                                   "- 91% wody\n" +
                                   "- 8% zwi�zk�w organicznych w tym bia�ek, cukr�w, witamin, enzym�w\n" +
                                   "- 1% zwi�zk�w nieorganicznych"
                                   );
                break;
            }
            case 1:
            {                
                PanelOpisu.setText("Krew pe�na konserwowana, KPK \n" +
                                   "� stosowany w transfuzjologii preparat krwiopochodny powsta�y \n" +
                                   "przez dodanie do krwi pobranej od dawcy p�ynu konserwuj�cego. \n" +
                                   "Zawiera pe�ny sk�ad fizjologiczny krwi,\n" +
                                   "nie zawiera funkcjonuj�cych p�ytek krwi ani \n" +
                                   "labilnych czynnik�w krzepni�cia "
                                   );
                break;
            }
            case 2:
            {                
                PanelOpisu.setText("Trombocyty, inaczej p�ytki krwi b�d� krwinki p�ytkowe,\n" +
                                   "to obok bia�ych i czerwonych krwinek elementy morfotyczne krwi.\n" + 
                                   "P�ytki krwi odgrywaj� kluczow� rol� w procesie krzepni�cia.\n" +
                                   "Ich poziom okre�la si� w ramach badania morfologicznego krwi."
                                   );
                break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdresEditText;
    private javax.swing.JTextField ImieEditText2;
    private javax.swing.JList<String> ListaZnalezionychOsob;
    private javax.swing.JTextField NazwiskoEditText;
    private javax.swing.JTextArea PanelOpisu;
    private javax.swing.JTextField PeselEditText;
    private javax.swing.JButton SzukajOsobyBtn;
    private javax.swing.JComboBox<String> TypProduktuComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
