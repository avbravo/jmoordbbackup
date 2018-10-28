/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.mback;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.NbPreferences;
   
/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.avbravo.mback//Back//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "BackTopComponent",
        iconBase = "org/avbravo/mback/icon/backup.png",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "explorer", openAtStartup = false)
@ActionID(category = "Window", id = "org.avbravo.mback.BackTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_BackAction",
        preferredID = "BackTopComponent"
)
@Messages({
    "CTL_BackAction=Back",
    "CTL_BackTopComponent=Back Window",
    "HINT_BackTopComponent=This is a Back window"
})
public final class BackTopComponent extends TopComponent {

    NotifyDescriptor nd;
     String separador = System.getProperty("file.separator");
     String userhome = System.getProperty("user.home");

    public BackTopComponent() {
        
        initComponents();
        setName(Bundle.CTL_BackTopComponent());
        setToolTipText(Bundle.HINT_BackTopComponent());
        jTextFieldFolder.setText("Descargas");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFolder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBackup = new javax.swing.JTextField();
        jButtonRestore = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDatabase = new javax.swing.JTextField();
        jButtonBackup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/avbravo/mback/icon/folder.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jLabel3.text")); // NOI18N

        jTextFieldFolder.setText(org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jTextFieldFolder.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jLabel1.text")); // NOI18N

        jTextFieldBackup.setText(org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jTextFieldBackup.text")); // NOI18N

        jButtonRestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/avbravo/mback/icon/restore.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButtonRestore, org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jButtonRestore.text")); // NOI18N
        jButtonRestore.setToolTipText(org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jButtonRestore.toolTipText")); // NOI18N
        jButtonRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestoreActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jLabel2.text")); // NOI18N

        jTextFieldDatabase.setText(org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jTextFieldDatabase.text")); // NOI18N

        jButtonBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/avbravo/mback/icon/save.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButtonBackup, org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jButtonBackup.text")); // NOI18N
        jButtonBackup.setToolTipText(org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jButtonBackup.toolTipText")); // NOI18N
        jButtonBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackupActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/avbravo/mback/icon/mongodb-icon-32.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(BackTopComponent.class, "BackTopComponent.jLabel6.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 276, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldDatabase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBackup)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFolder, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBackup))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRestore)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBackup))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRestore))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackupActionPerformed
        try {
            String comando = "";
            DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
            Date date = new Date();
            String timeAndDate = dateFormat.format(date);
            String name = jTextFieldDatabase.getText().trim() + timeAndDate;
          if(jTextFieldFolder.getText().equals("")){
               informacion("Indique el nombre del directorio de trabajo");
               return;
          }
          if(jTextFieldDatabase.getText().equals("")){
               informacion("Indique el nombre de la base de datos");
               return;
          }
            String dir = userhome + separador + jTextFieldFolder.getText().trim()+separador+name;
            comando = "mongodump -d " + jTextFieldDatabase.getText().trim() + " -o " + dir ;

            Process proc = Runtime.getRuntime().exec(comando);
            if (proc.getErrorStream() == null) {
                advertencia("error backup");
                return;
            }
           
            informacion(NbBundle.getMessage(BackTopComponent.class, "backuprealizado") + " " + name);
        } catch (Exception e) {
            error(e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButtonBackupActionPerformed

    private void jButtonRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestoreActionPerformed
        try {
            String comando = "";

           
            String dir = userhome + separador + jTextFieldFolder.getText().trim() + separador + jTextFieldBackup.getText().trim();

            comando = "mongorestore " + dir;

            Process proc = Runtime.getRuntime().exec(comando);
            if (proc.getErrorStream() == null) {
                advertencia("error backup");
                return;
            }
            //Guarda la ruta del backup
            NbPreferences.forModule(BackTopComponent.class).put("pathbackupfolder", jTextFieldDatabase.getText());

            informacion(NbBundle.getMessage(BackTopComponent.class, "restorerealizado"));
        } catch (Exception e) {
            error(e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButtonRestoreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackup;
    private javax.swing.JButton jButtonRestore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldBackup;
    private javax.swing.JTextField jTextFieldDatabase;
    private javax.swing.JTextField jTextFieldFolder;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    public void informacion(String msg) {
        try {
            nd = new NotifyDescriptor.Message(msg, NotifyDescriptor.Message.INFORMATION_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        } catch (Exception ex) {
            nd = new NotifyDescriptor.Message("Informacion() " + ex.getLocalizedMessage(), NotifyDescriptor.Message.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        }
    }

    /*
     * Mensaje Advertencia
     */

    public void advertencia(String msg) {
        try {
            nd = new NotifyDescriptor.Message(msg, NotifyDescriptor.Message.WARNING_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        } catch (Exception ex) {
            nd = new NotifyDescriptor.Message("Advertencia() " + ex.getLocalizedMessage(), NotifyDescriptor.Message.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        }
    }

    /*
     * Mensaje Error
     */

    public void error(String msg) {
        try {
            nd = new NotifyDescriptor.Message(msg, NotifyDescriptor.Message.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        } catch (Exception ex) {
            nd = new NotifyDescriptor.Message("Error() " + ex.getLocalizedMessage(), NotifyDescriptor.Message.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        }
    }
}
