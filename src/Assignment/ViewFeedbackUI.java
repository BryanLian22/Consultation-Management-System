/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ViewFeedbackUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewFeedbackUI
     */
    public ViewFeedbackUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        viewfeedback_area = new javax.swing.JTextArea();
        Name_label = new javax.swing.JLabel();
        Name_field = new javax.swing.JTextField();
        Search_button = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewfeedback_area.setColumns(20);
        viewfeedback_area.setRows(5);
        jScrollPane1.setViewportView(viewfeedback_area);

        Name_label.setText("Search for Student Name :");

        Name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_fieldActionPerformed(evt);
            }
        });

        Search_button.setText("Search");
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });

        Back_button.setText("Lecturer Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(Search_button)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_button)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_label)
                    .addComponent(Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_button))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_fieldActionPerformed

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
        // Get student name from Name_field
    String studentName = Name_field.getText();

    // Validate if the field is filled
    if (studentName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Student Name must not be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Open the feedback file and search for feedback for the student
    File feedbackFile = new File("feedback_data.txt");
    if (!feedbackFile.exists()) {
        JOptionPane.showMessageDialog(this, "No feedback data found.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    StringBuilder feedbackResults = new StringBuilder();

    try (BufferedReader reader = new BufferedReader(new FileReader(feedbackFile))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 3 && data[0].equalsIgnoreCase(studentName)) {
                // Append matching feedback for the student
                feedbackResults.append("Lecturer: ").append(data[1]).append("\n")
                               .append("Feedback: ").append(data[2]).append("\n")
                               .append("-------------------------------------------------------------\n"); // Add row of dashes to separate feedback
            }
        }

        // Display results in the text area
        if (feedbackResults.length() == 0) {
            viewfeedback_area.setText("No feedback found for this student.");
        } else {
            viewfeedback_area.setText(feedbackResults.toString());
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading feedback data.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_Search_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFeedbackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFeedbackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFeedbackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFeedbackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFeedbackUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JTextField Name_field;
    private javax.swing.JLabel Name_label;
    private javax.swing.JButton Search_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea viewfeedback_area;
    // End of variables declaration//GEN-END:variables
}
