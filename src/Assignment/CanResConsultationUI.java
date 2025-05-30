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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CanResConsultationUI extends javax.swing.JFrame {

    /**
     * Creates new form CancelConsultationUI
     */
    public CanResConsultationUI() {
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

        text_label = new javax.swing.JLabel();
        Name_label = new javax.swing.JLabel();
        Name_field = new javax.swing.JTextField();
        Search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Appointment_area = new javax.swing.JTextArea();
        Date_label = new javax.swing.JLabel();
        Date_field = new javax.swing.JTextField();
        Confirm_button = new javax.swing.JButton();
        Time_label = new javax.swing.JLabel();
        Time_field = new javax.swing.JTextField();
        Back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ResDateCom_button = new javax.swing.JComboBox<>();
        ResTimeCom_button = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Namecombo_button = new javax.swing.JComboBox<>();
        Reschedule_button = new javax.swing.JButton();
        OldDate_field = new javax.swing.JTextField();
        OldTime_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text_label.setText("Cancel Consultation");

        Name_label.setText("Your Name :");

        Search_button.setText("Search");
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });

        Appointment_area.setColumns(20);
        Appointment_area.setRows(5);
        jScrollPane1.setViewportView(Appointment_area);

        Date_label.setText("Date to cancel :");

        Confirm_button.setText("Confirm");
        Confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_buttonActionPerformed(evt);
            }
        });

        Time_label.setText("Time to cancel :");

        Back_button.setText("Dashboard");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Reschedule");

        jLabel2.setText("Old Date :");

        jLabel3.setText("Old Time :");

        jLabel4.setText("Lecturer Name :");

        Namecombo_button.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof. Ali", "Prof. Abu", "Prof. Lee", "Hang Tuah" }));
        Namecombo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Namecombo_buttonActionPerformed(evt);
            }
        });

        Reschedule_button.setText("Reschedule");
        Reschedule_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reschedule_buttonActionPerformed(evt);
            }
        });

        jLabel5.setText("New Date :");

        jLabel6.setText("New Time :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reschedule_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(text_label))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Name_label)
                                .addGap(34, 34, 34)
                                .addComponent(Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Search_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Time_label)
                                .addGap(18, 18, 18)
                                .addComponent(Time_field, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Confirm_button))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(OldTime_field, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Date_label)
                                                .addGap(18, 18, 18)
                                                .addComponent(Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1))
                                        .addGap(12, 12, 12)
                                        .addComponent(ResTimeCom_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(OldDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(Namecombo_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ResDateCom_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(86, 86, 86)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(text_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_label)
                    .addComponent(Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date_label)
                    .addComponent(Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time_label)
                    .addComponent(Time_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirm_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ResDateCom_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(Namecombo_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OldDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ResTimeCom_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OldTime_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addComponent(Back_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reschedule_button)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        Dashboard DashboardScreen = new Dashboard();
        DashboardScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
    // Get the name from the Name_field
    String studentName = Name_field.getText().trim();

    // Check if Name_field is filled
    if (studentName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a student name.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Exit the method if Name_field is empty
    }

    // Read the consultation slots from the file and find appointments made by the student
    File file = new File("consultations.txt");
    StringBuilder appointments = new StringBuilder();
    boolean foundAppointments = false;

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 4) {
                String professor = data[0];
                String date = data[1];
                String time = data[2];
                String student = data[3];

                // Check if the student name matches
                if (student.equalsIgnoreCase(studentName)) {
                    // Append the found appointment to the StringBuilder
                    appointments.append("Lecturer: ").append(professor)
                                .append(", Date: ").append(date)
                                .append(", Time: ").append(time)
                                .append("\n");
                    foundAppointments = true;
                }
            }
        }

        // If no appointments were found for the student
        if (!foundAppointments) {
            appointments.append("No appointments found for student: ").append(studentName).append("\n");
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading consultation slots.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    // Load rescheduling requests for the student
    appointments.append("\n--- Rescheduling Requests ---\n");
    File reschedulingFile = new File("rescheduling_requests.txt");
    boolean foundRequests = false;

    try (BufferedReader br = new BufferedReader(new FileReader(reschedulingFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 6) {
                String storedStudentName = data[5].trim();
                if (storedStudentName.equalsIgnoreCase(studentName)) {
                    foundRequests = true;
                    appointments.append("Old Date: ").append(data[0])
                                .append(", Old Time: ").append(data[1])
                                .append("\nLecturer: ").append(data[2])
                                .append("\nNew Date: ").append(data[3])
                                .append(", New Time: ").append(data[4]).append(" (Waiting Permission)\n\n");
                }
            }
        }

        if (!foundRequests) {
            appointments.append("No rescheduling requests found for student: ").append(studentName).append("\n");
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Reading file", "Success", JOptionPane.INFORMATION_MESSAGE);
        e.printStackTrace();
    }

    // Display all the appointments and rescheduling requests in the Appointment_area JTextArea
    Appointment_area.setText(appointments.toString());
    }//GEN-LAST:event_Search_buttonActionPerformed

    private void Confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_buttonActionPerformed
     // Get values from the Name_field, Date_field, and Time_field
    String name = Name_field.getText().trim();  // Student name entered by the user
    String date = Date_field.getText().trim();  // Date entered by the user
    String time = Time_field.getText().trim();  // Time entered by the user

    // Check if Name_field, Date_field, and Time_field are filled
    if (name.isEmpty() || date.isEmpty() || time.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter Name, Date, and Time.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Exit the method if any field is empty
    }

    // Validate Date format (yyyy-MM-dd)
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    try {
        dateFormat.parse(date);  // This will throw ParseException if the date is not valid
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid date format! Please use YYYY-MM-DD.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate Time format (HH:mm)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    timeFormat.setLenient(false);
    try {
        timeFormat.parse(time);  // This will throw ParseException if the time is not valid
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid time format! Please use HH:mm.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Now that name, date, and time are validated, proceed to remove the appointment from the file
    File file = new File("consultations.txt");
    File tempFile = new File("temp_consultations.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(file));
         BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

        String line;
        boolean appointmentRemoved = false;

        // Read through each line in the consultations.txt file
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 4) {
                String storedName = data[3].trim();  // Stored name
                String storedDate = data[1].trim();  // Stored date
                String storedTime = data[2].trim();  // Stored time

                // If the name, date, and time match the student's appointment, skip writing this line (i.e., remove it)
                if (storedName.equals(name) && storedDate.equals(date) && storedTime.equals(time)) {
                    appointmentRemoved = true;  // Appointment found and removed
                    continue;  // Skip writing this line to the temp file
                }
            }

            // If the line is not removed, write it to the temp file
            bw.write(line);
            bw.newLine();
        }

        if (appointmentRemoved) {
            JOptionPane.showMessageDialog(this, "Appointment removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No appointment found for the given Name, Date, and Time.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "An error occurred while processing the file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    // After processing, replace the original file with the updated temp file
    if (tempFile.exists()) {
        file.delete();  // Delete the original file
        tempFile.renameTo(file);  // Rename the temp file to the original file name
    }
    }//GEN-LAST:event_Confirm_buttonActionPerformed

    private void Reschedule_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reschedule_buttonActionPerformed
    // Get values from the fields
    String oldDate = OldDate_field.getText().trim();
    String oldTime = OldTime_field.getText().trim();
    String newLecturerName = Namecombo_button.getSelectedItem().toString().trim();
    String newDate = ResDateCom_button.getSelectedItem() != null ? ResDateCom_button.getSelectedItem().toString().trim() : "";
    String newTime = ResTimeCom_button.getSelectedItem() != null ? ResTimeCom_button.getSelectedItem().toString().trim() : "";
    String studentName = Name_field.getText().trim();

    // Validate fields
    if (oldDate.isEmpty() || oldTime.isEmpty() || newLecturerName.equals("Choose") || newDate.isEmpty() || newTime.isEmpty() || studentName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields: Old Date, Old Time, Lecturer Name, New Date, New Time, and Student Name.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if a rescheduling request already exists for the same Old Date and Old Time
    if (isReschedulingRequested(oldDate, oldTime, studentName)) {
        JOptionPane.showMessageDialog(this, "A rescheduling request already exists for this appointment.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate old date format (yyyy-MM-dd)
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    try {
        dateFormat.parse(oldDate);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid Old Date format! Please use YYYY-MM-DD.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate old time format (HH:mm)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    timeFormat.setLenient(false);
    try {
        timeFormat.parse(oldTime);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid Old Time format! Please use HH:mm.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the new time is valid for the lecturer in consultation_slots.txt
    File slotsFile = new File("consultation_slots.txt");
    boolean isTimeValidForLecturer = false;

    try (BufferedReader br = new BufferedReader(new FileReader(slotsFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length >= 3) {
                String lecturerName = data[0].trim();
                String slotDate = data[1].trim();
                String slotTime = data[2].trim();

                if (lecturerName.equals(newLecturerName) && slotDate.equals(newDate) && slotTime.equals(newTime)) {
                    isTimeValidForLecturer = true;
                    break;
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "An error occurred while reading the consultation slots file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return;
    }

    if (!isTimeValidForLecturer) {
        JOptionPane.showMessageDialog(this, "The selected date and time are not available for " + newLecturerName + ". Please choose a valid date and time.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Save the rescheduling request to rescheduling_requests.txt
    File reschedulingFile = new File("rescheduling_requests.txt");

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(reschedulingFile, true))) {
        bw.write(oldDate + "," + oldTime + "," + newLecturerName + "," + newDate + "," + newTime + "," + studentName);
        bw.newLine();
        JOptionPane.showMessageDialog(this, "Rescheduling request submitted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "An error occurred while saving the rescheduling request.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    
    }
    private boolean isReschedulingRequested(String oldDate, String oldTime, String studentName) {
    File reschedulingFile = new File("rescheduling_requests.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(reschedulingFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length >= 6) {
                String storedOldDate = data[0].trim();
                String storedOldTime = data[1].trim();
                String storedStudent = data[5].trim();

                // Check if the request matches the same old date, old time, and student
                if (storedOldDate.equals(oldDate) && storedOldTime.equals(oldTime) && storedStudent.equals(studentName)) {
                    return true; // Rescheduling request already exists
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Checking file to see if request is made before.", "success", JOptionPane.INFORMATION_MESSAGE);
        e.printStackTrace();
    }
    return false; // No matching request found

    }//GEN-LAST:event_Reschedule_buttonActionPerformed
private void loadReschedulingRequests(String studentName) {
        Appointment_area.setText("");

        File reschedulingFile = new File("rescheduling_requests.txt");
        if (!reschedulingFile.exists()) {
            Appointment_area.setText("No rescheduling requests found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(reschedulingFile))) {
            String line;
            boolean foundRequest = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    String storedStudentName = data[5].trim();
                    if (storedStudentName.equals(studentName)) {
                        foundRequest = true;
                        Appointment_area.append(
                            "Reschedule Request:\n" +
                            "Old Date: " + data[0].trim() + "\n" +
                            "Old Time: " + data[1].trim() + "\n" +
                            "Lecturer: " + data[2].trim() + "\n" +
                            "New Date: " + data[3].trim() + "\n" +
                            "New Time: " + data[4].trim() + " (Waiting Permission)\n\n"
                        );
                    }
                }
            }

            if (!foundRequest) {
                Appointment_area.setText("No rescheduling requests found for " + studentName + ".");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading rescheduling requests.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
}
    private void Namecombo_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Namecombo_buttonActionPerformed
           // Clear the ResDateCom_button and ResTimeCom_button values
    ResDateCom_button.removeAllItems();
    ResTimeCom_button.removeAllItems();

    // Get selected lecturer's name
    String selectedLecturer = Namecombo_button.getSelectedItem().toString();

    if (selectedLecturer.equals("Choose")) {
        return;  // If no lecturer is selected, do nothing
    }

    // Read available slots from "consultation_slots.txt"
    File file = new File("consultation_slots.txt");
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 3) {
                String lecturerName = data[0].trim();
                String date = data[1].trim();
                String time = data[2].trim();

                // Populate ResDateCom_button and ResTimeCom_button if lecturer matches
                if (lecturerName.equals(selectedLecturer)) {
                    if (((DefaultComboBoxModel) ResDateCom_button.getModel()).getIndexOf(date) == -1) {
                        ResDateCom_button.addItem(date);  // Avoid duplicate dates
                    }
                    if (((DefaultComboBoxModel) ResTimeCom_button.getModel()).getIndexOf(time) == -1) {
                        ResTimeCom_button.addItem(time);  // Avoid duplicate times
                    }
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading consultation slots.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_Namecombo_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(CanResConsultationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CanResConsultationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CanResConsultationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CanResConsultationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CanResConsultationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Appointment_area;
    private javax.swing.JButton Back_button;
    private javax.swing.JButton Confirm_button;
    private javax.swing.JTextField Date_field;
    private javax.swing.JLabel Date_label;
    private javax.swing.JTextField Name_field;
    private javax.swing.JLabel Name_label;
    private javax.swing.JComboBox<String> Namecombo_button;
    private javax.swing.JTextField OldDate_field;
    private javax.swing.JTextField OldTime_field;
    private javax.swing.JComboBox<String> ResDateCom_button;
    private javax.swing.JComboBox<String> ResTimeCom_button;
    private javax.swing.JButton Reschedule_button;
    private javax.swing.JButton Search_button;
    private javax.swing.JTextField Time_field;
    private javax.swing.JLabel Time_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel text_label;
    // End of variables declaration//GEN-END:variables
}
