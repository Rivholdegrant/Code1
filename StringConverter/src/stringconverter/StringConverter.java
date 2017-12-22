/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconverter;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
/**
 *
 * @author Rivs
 */
public class StringConverter extends javax.swing.JFrame {

    /**
     * Creates new form StringConverter
     */
    public StringConverter() {
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

        inputFrame = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputFrame = new javax.swing.JTextArea();
        buttonConvert = new javax.swing.JButton();
        buttonConvertAndCopy = new javax.swing.JButton();
        buttonCopy = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatLog converter");
        setResizable(false);

        inputFrame.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        inputFrame.setToolTipText("Yup, here");
        inputFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFrameActionPerformed(evt);
            }
        });
        inputFrame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputFrameKeyPressed(evt);
            }
        });

        jLabel1.setText("Paste original chat log");

        jLabel2.setText("Below will be formatted copy-ready text");

        outputFrame.setColumns(20);
        outputFrame.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        outputFrame.setRows(5);
        outputFrame.setToolTipText("Convert something, feed the hungry output field!");
        jScrollPane1.setViewportView(outputFrame);

        buttonConvert.setText("Convert");
        buttonConvert.setPreferredSize(new java.awt.Dimension(80, 32));
        buttonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertActionPerformed(evt);
            }
        });

        buttonConvertAndCopy.setText("Convert and copy");
        buttonConvertAndCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertAndCopyActionPerformed(evt);
            }
        });

        buttonCopy.setText("Copy");
        buttonCopy.setMinimumSize(new java.awt.Dimension(60, 32));
        buttonCopy.setPreferredSize(new java.awt.Dimension(80, 32));
        buttonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyActionPerformed(evt);
            }
        });

        buttonClear.setText("Clear");
        buttonClear.setMinimumSize(new java.awt.Dimension(60, 32));
        buttonClear.setPreferredSize(new java.awt.Dimension(80, 32));
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonConvertAndCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConvertAndCopy)
                    .addComponent(buttonCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFrameActionPerformed

    private void buttonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyActionPerformed
        outputFrame.selectAll();
        outputFrame.copy();   
    }//GEN-LAST:event_buttonCopyActionPerformed

    private void buttonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertActionPerformed
        outputFrame.setText(convert(inputFrame.getText()));  
        System.out.println(convert(inputFrame.getText()));
    }//GEN-LAST:event_buttonConvertActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        inputFrame.setText("");
        outputFrame.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonConvertAndCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertAndCopyActionPerformed
        outputFrame.setText(convert(inputFrame.getText()));
        outputFrame.selectAll();
        outputFrame.copy();       
    }//GEN-LAST:event_buttonConvertAndCopyActionPerformed

    private void inputFrameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFrameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            buttonConvertAndCopy.doClick();
        }            
    }//GEN-LAST:event_inputFrameKeyPressed

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
            java.util.logging.Logger.getLogger(StringConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringConverter().setVisible(true);
            }
        });
    }
    public String convert(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        try
        {
            Pattern pattern_detail  =	 Pattern.compile("(\\d\\d?/\\d\\d/\\d{4} \\d\\d?:\\d{2}:\\d{2})\\s\\-\\s(.*)\\s\\(Additional comments\\)(.*)");	// for each line 
            Pattern pattern_general =	 Pattern.compile("(?=\\d\\d?/\\d\\d/\\d{4}\\s\\d\\d?:\\d{2}:\\d{2}\\s\\-\\s)"); 								// for seperating into lines	

            String[] temp = pattern_general.split(str);

            ArrayList<String> list = new ArrayList<>();    
            for(int i=0 ; i<temp.length ;i++)	// repairing lines as first digit gets separated and adding outcome lines to array
            {
              list.add(temp[i]+temp[++i]);
            }

            ArrayList<String> list2 = new ArrayList<>();

            for(String li:list) // formatting each line to desired template and reversing the order (initially youngest messages are on the top)
            {
              Matcher matcher = pattern_detail.matcher(li);
              matcher.matches();
              list2.add(0, String.format("%-25s", matcher.group(1))+String.format("%-25s", matcher.group(2))+" : "+matcher.group(3));
            }

            String output = "";
            for(String li:list2)	// creating string output
            {
              output += li + "\n";
            } 
            return output;
        }catch(Exception e)
        {
            return "Something went not yes :((";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonConvert;
    private javax.swing.JButton buttonConvertAndCopy;
    private javax.swing.JButton buttonCopy;
    private javax.swing.JTextField inputFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputFrame;
    // End of variables declaration//GEN-END:variables
}