/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LecViewRequest extends javax.swing.JFrame {

    /**
     * Creates new form LecViewRequest
     */
    public LecViewRequest() {
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

        LecName_label = new javax.swing.JLabel();
        LecName_button = new javax.swing.JComboBox<>();
        Search_button = new javax.swing.JButton();
        Date_label = new javax.swing.JLabel();
        Time_label = new javax.swing.JLabel();
        Enter_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Rescheduling_area = new javax.swing.JTextArea();
        Name_label = new javax.swing.JLabel();
        Name_field = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Back_button = new javax.swing.JButton();
        Date_field = new javax.swing.JTextField();
        Time_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LecName_label.setText("Lecturer Name :");

        LecName_button.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof. Ali", "Prof. Abu", "Prof. Lee", "Hang Tuah" }));

        Search_button.setText("Search");
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });

        Date_label.setText("New Date :");

        Time_label.setText("New Time :");

        Enter_button.setText("Enter");
        Enter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_buttonActionPerformed(evt);
            }
        });

        Rescheduling_area.setColumns(20);
        Rescheduling_area.setRows(5);
        jScrollPane1.setViewportView(Rescheduling_area);

        Name_label.setText("Student Name :");

        Back_button.setText("Dashboard");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Date_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LecName_label)
                                .addGap(27, 27, 27)
                                .addComponent(LecName_button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Back_button, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Enter_button, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Search_button, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name_label)
                            .addComponent(Time_label))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name_field, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(Time_field)
                            .addComponent(Date_field))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LecName_label)
                    .addComponent(LecName_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_button))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date_label)
                    .addComponent(Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time_label)
                    .addComponent(Time_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name_label)
                    .addComponent(Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enter_button)
                    .addComponent(Back_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        LecturerDashboardUI lecturerdashboard = new LecturerDashboardUI();
        lecturerdashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
            // Get the lecturer's name from the LecName_button ComboBox
    String selectedLecturer = LecName_button.getSelectedItem().toString().trim();

    // Check if a lecturer is selected
    if (selectedLecturer.equals("Choose")) {
        JOptionPane.showMessageDialog(this, "Please select a lecturer name.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Read the rescheduling_requests.txt file and find requests for the selected lecturer
    File reschedulingFile = new File("rescheduling_requests.txt");
    StringBuilder reschedulingRequests = new StringBuilder();
    boolean foundRequests = false;

    if (!reschedulingFile.exists()) {
        JOptionPane.showMessageDialog(this, "No rescheduling requests found.", "Information", JOptionPane.INFORMATION_MESSAGE);
        Rescheduling_area.setText("No rescheduling requests available.");
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(reschedulingFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length >= 6) {
                String oldDate = data[0].trim();
                String oldTime = data[1].trim();
                String lecturerName = data[2].trim();
                String newDate = data[3].trim();
                String newTime = data[4].trim();
                String studentName = data[5].trim();

                // Check if the request is for the selected lecturer
                if (lecturerName.equalsIgnoreCase(selectedLecturer)) {
                    reschedulingRequests.append("Student: ").append(studentName)
                            .append("\nOld Date: ").append(oldDate)
                            .append("\nOld Time: ").append(oldTime)
                            .append("\nNew Date: ").append(newDate)
                            .append("\nNew Time: ").append(newTime)
                            .append("\n----------------------\n");
                    foundRequests = true;
                }
            }
        }

        if (foundRequests) {
            Rescheduling_area.setText(reschedulingRequests.toString()); // Display requests in JTextArea
        } else {
            Rescheduling_area.setText("No rescheduling requests for " + selectedLecturer + ".");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading rescheduling requests file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_Search_buttonActionPerformed

    private void Enter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_buttonActionPerformed
    // Get values from the fields
    String studentName = Name_field.getText().trim();
    String newDate = Date_field.getText().trim();
    String newTime = Time_field.getText().trim();

    // Check if any field is empty
    if (studentName.isEmpty() || newDate.isEmpty() || newTime.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Error: Please fill in all fields (Student Name, New Date, and New Time).", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Exit the method if any field is empty
    }

    // Validate date format (yyyy-MM-dd)
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    try {
        dateFormat.parse(newDate);  // This will throw ParseException if the date is not valid
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid date format! Please use YYYY-MM-DD.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate time format (HH:mm)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    timeFormat.setLenient(false);
    try {
        timeFormat.parse(newTime);  // This will throw ParseException if the time is not valid
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid time format! Please use HH:mm.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check the rescheduling_requests.txt file for the existing request for this student
    File rescheduleRequestFile = new File("rescheduling_requests.txt");
    boolean isRequestExist = false;
    String lecturerName = "";
    String lineToRemove = "";  // Line to be removed from the rescheduling_requests.txt

    try (BufferedReader br = new BufferedReader(new FileReader(rescheduleRequestFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length >= 6) {
                String storedStudentName = data[5].trim();  // Student name from request file
                String requestNewDate = data[3].trim();      // New date
                String requestNewTime = data[4].trim();      // New time

                // Check if the student has already made a rescheduling request for this appointment
                if (storedStudentName.equals(studentName) && requestNewDate.equals(newDate) && requestNewTime.equals(newTime)) {
                    isRequestExist = true; // The request exists for this appointment
                    lecturerName = data[2].trim();  // Lecturer name
                    lineToRemove = line;  // Save the line to be removed from the request file
                    break;
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "An error occurred while reading the rescheduling request file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    if (isRequestExist) {
        // Pop up a JOptionPane for the lecturer to approve or reject the request
        int response = JOptionPane.showOptionDialog(this, 
            "Do you want to approve or reject the rescheduling request for " + studentName + "?\n" +
            "New Date: " + newDate + " at " + newTime, 
            "Approve or Reject Reschedule", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            new Object[] {"Approve", "Reject"}, 
            "Reject");

        // If the lecturer approves
        if (response == JOptionPane.YES_OPTION) {
            // Update the consultation in consultations.txt
            updateConsultation(newDate, newTime, studentName, lecturerName);

            // Remove the request from rescheduling_requests.txt
            removeReschedulingRequest(lineToRemove);
        } else if (response == JOptionPane.NO_OPTION) {
            // Simply remove the request from rescheduling_requests.txt if rejected
            removeReschedulingRequest(lineToRemove);
        }

    } else {
        JOptionPane.showMessageDialog(this, "No matching rescheduling request found for the given student, new date, and new time.", "No Request Found", JOptionPane.INFORMATION_MESSAGE);
    }
}

// Function to update the consultation in consultations.txt
private void updateConsultation(String newDate, String newTime, String studentName, String lecturerName) {
    File consultationsFile = new File("consultations.txt");
    File tempFile = new File("temp_consultations.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(consultationsFile));
         BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

        String line;
        boolean appointmentUpdated = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 4) {
                String storedStudentName = data[3].trim();

                // Check if this is the appointment to be rescheduled
                if (storedStudentName.equals(studentName)) {
                    // Update the appointment with the new date and time
                    bw.write(lecturerName + "," + newDate + "," + newTime + "," + studentName);
                    appointmentUpdated = true;
                } else {
                    // Write the line unchanged
                    bw.write(line);
                }
            } else {
                // Write invalid lines unchanged
                bw.write(line);
            }
            bw.newLine();
        }

        if (appointmentUpdated) {
            JOptionPane.showMessageDialog(this, "Consultation successfully rescheduled.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No matching appointment found for the given student.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "An error occurred while processing the consultations file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    // Replace the old file with the updated file
    if (tempFile.exists()) {
        consultationsFile.delete();
        tempFile.renameTo(consultationsFile);
    }
}

// Function to remove the request from rescheduling_requests.txt
private void removeReschedulingRequest(String lineToRemove) {
    File rescheduleRequestFile = new File("rescheduling_requests.txt");
    File tempFile = new File("temp_rescheduling_requests.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(rescheduleRequestFile));
         BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

        String line;
        while ((line = br.readLine()) != null) {
            // Only write lines that do not match the request to be removed
            if (!line.equals(lineToRemove)) {
                bw.write(line);
                bw.newLine();
            }
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "An error occurred while processing the rescheduling request file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    // Replace the old request file with the updated one
    if (tempFile.exists()) {
        rescheduleRequestFile.delete();
        tempFile.renameTo(rescheduleRequestFile);
    }
    }//GEN-LAST:event_Enter_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(LecViewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecViewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecViewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecViewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecViewRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JTextField Date_field;
    private javax.swing.JLabel Date_label;
    private javax.swing.JButton Enter_button;
    private javax.swing.JComboBox<String> LecName_button;
    private javax.swing.JLabel LecName_label;
    private javax.swing.JTextField Name_field;
    private javax.swing.JLabel Name_label;
    private javax.swing.JTextArea Rescheduling_area;
    private javax.swing.JButton Search_button;
    private javax.swing.JTextField Time_field;
    private javax.swing.JLabel Time_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
