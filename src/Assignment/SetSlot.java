/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SetSlot extends javax.swing.JFrame {

    /**
     * Creates new form SetSlot
     */
    public SetSlot() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name_label = new javax.swing.JLabel();
        NameCombo_button = new javax.swing.JComboBox<>();
        Date_label = new javax.swing.JLabel();
        Date_field = new javax.swing.JTextField();
        Time_label = new javax.swing.JLabel();
        Time_field = new javax.swing.JTextField();
        Add_button = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Name_label.setText("Choose Name");

        NameCombo_button.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof. Ali", "Prof. Abu", "Prof. Lee", "Hang Tuah" }));

        Date_label.setText("Date");

        Time_label.setText("Time");

        Add_button.setText("Add Slot");
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        Back_button.setText("Back to Lecturer Dashboard");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Time_label)
                            .addComponent(Date_label)
                            .addComponent(Name_label))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Date_field)
                            .addComponent(Time_field)
                            .addComponent(NameCombo_button, 0, 131, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(Add_button)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_label)
                    .addComponent(NameCombo_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date_label)
                    .addComponent(Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Time_label)
                    .addComponent(Time_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_button)
                    .addComponent(Add_button))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
        // Get the selected name, date, and time
    String lecturerName = NameCombo_button.getSelectedItem().toString();
    String consultationDate = Date_field.getText();
    String consultationTime = Time_field.getText();

    // Validate if all fields are filled
    if (lecturerName.equals("Choose") || consultationDate.isEmpty() || consultationTime.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields: Name, Date, and Time.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Exit the method if any field is not filled
    }

    // Validate Date format (YYYY-MM-DD)
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false); // Make sure the date is strictly validated
    try {
        dateFormat.parse(consultationDate); // This will throw an exception if the date is invalid
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid date format! Please use YYYY-MM-DD.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate Time format (24-hour clock: HH:mm)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    timeFormat.setLenient(false); // Make sure the time is strictly validated
    try {
        timeFormat.parse(consultationTime); // This will throw an exception if the time is invalid or not in 24-hour format
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid time format! Please use 24-hour clock (HH:mm).", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Create a new file if it doesn't exist and append the consultation data
    File file = new File("consultation_slots.txt");
    try {
        // If the file doesn't exist, create it
        if (!file.exists()) {
            file.createNewFile();
        }

        // Append the new consultation slot to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(lecturerName + "," + consultationDate + "," + consultationTime);
            writer.newLine();  // Add a new line after the current record
        }

        JOptionPane.showMessageDialog(this, "Consultation slot added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving the consultation slot.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_Add_buttonActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
         LecturerDashboardUI LecturerDashboardUIScreen = new LecturerDashboardUI();
         LecturerDashboardUIScreen.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(SetSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetSlot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_button;
    private javax.swing.JButton Back_button;
    private javax.swing.JTextField Date_field;
    private javax.swing.JLabel Date_label;
    private javax.swing.JComboBox<String> NameCombo_button;
    private javax.swing.JLabel Name_label;
    private javax.swing.JTextField Time_field;
    private javax.swing.JLabel Time_label;
    // End of variables declaration//GEN-END:variables
}
