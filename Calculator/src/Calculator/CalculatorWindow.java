/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import jdk.internal.org.objectweb.asm.tree.analysis.Interpreter;

/**
 *
 * @author star_destroyer
 */
public class CalculatorWindow extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorWindow
     */
    public CalculatorWindow() {
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

        equation = new javax.swing.JTextField();
        button_0 = new javax.swing.JButton();
        button_comma = new javax.swing.JButton();
        button_3 = new javax.swing.JButton();
        button_1 = new javax.swing.JButton();
        button_2 = new javax.swing.JButton();
        button_6 = new javax.swing.JButton();
        button_4 = new javax.swing.JButton();
        button_5 = new javax.swing.JButton();
        button_9 = new javax.swing.JButton();
        button_7 = new javax.swing.JButton();
        button_8 = new javax.swing.JButton();
        button_backspace = new javax.swing.JButton();
        button_multiply = new javax.swing.JButton();
        button_plus = new javax.swing.JButton();
        button_equals = new javax.swing.JButton();
        button_clear = new javax.swing.JButton();
        button_divide = new javax.swing.JButton();
        button_minus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        equation.setEditable(false);
        equation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                equationKeyPressed(evt);
            }
        });

        button_0.setText("0");
        button_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_0ActionPerformed(evt);
            }
        });

        button_comma.setText(",");
        button_comma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_commaActionPerformed(evt);
            }
        });

        button_3.setText("3");
        button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_3ActionPerformed(evt);
            }
        });

        button_1.setText("1");
        button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_1ActionPerformed(evt);
            }
        });

        button_2.setText("2");
        button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2ActionPerformed(evt);
            }
        });

        button_6.setText("6");
        button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_6ActionPerformed(evt);
            }
        });

        button_4.setText("4");
        button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_4ActionPerformed(evt);
            }
        });

        button_5.setText("5");
        button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_5ActionPerformed(evt);
            }
        });

        button_9.setText("9");
        button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_9ActionPerformed(evt);
            }
        });

        button_7.setText("7");
        button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_7ActionPerformed(evt);
            }
        });

        button_8.setText("8");
        button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_8ActionPerformed(evt);
            }
        });

        button_backspace.setText("B");
        button_backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backspaceActionPerformed(evt);
            }
        });

        button_multiply.setText("*");
        button_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_multiplyActionPerformed(evt);
            }
        });

        button_plus.setText("+");
        button_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_plusActionPerformed(evt);
            }
        });

        button_equals.setText("=");
        button_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_equalsActionPerformed(evt);
            }
        });

        button_clear.setText("C");
        button_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_clearActionPerformed(evt);
            }
        });

        button_divide.setText("/");
        button_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_divideActionPerformed(evt);
            }
        });

        button_minus.setText("-");
        button_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_minusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equation)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_comma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(button_equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_7)
                            .addComponent(button_8)
                            .addComponent(button_9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_4)
                            .addComponent(button_5)
                            .addComponent(button_6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_1)
                            .addComponent(button_2)
                            .addComponent(button_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_0)
                            .addComponent(button_comma)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button_backspace)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_multiply)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_plus))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button_clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_divide)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_minus)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_equals)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_0ActionPerformed
        equation.setText(equation.getText()+"0");
    }//GEN-LAST:event_button_0ActionPerformed

    private void button_commaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_commaActionPerformed
        equation.setText(equation.getText()+".");       
    }//GEN-LAST:event_button_commaActionPerformed

    private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_3ActionPerformed
        equation.setText(equation.getText()+"3");
    }//GEN-LAST:event_button_3ActionPerformed

    private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_1ActionPerformed
        equation.setText(equation.getText()+"1");
    }//GEN-LAST:event_button_1ActionPerformed

    private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2ActionPerformed
        equation.setText(equation.getText()+"2");
    }//GEN-LAST:event_button_2ActionPerformed

    private void button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_6ActionPerformed
        equation.setText(equation.getText()+"6");
    }//GEN-LAST:event_button_6ActionPerformed

    private void button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_4ActionPerformed
        equation.setText(equation.getText()+"4");
    }//GEN-LAST:event_button_4ActionPerformed

    private void button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_5ActionPerformed
        equation.setText(equation.getText()+"5");
    }//GEN-LAST:event_button_5ActionPerformed

    private void button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_9ActionPerformed
        equation.setText(equation.getText()+"9");
    }//GEN-LAST:event_button_9ActionPerformed

    private void button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_7ActionPerformed
        equation.setText(equation.getText()+"7");
    }//GEN-LAST:event_button_7ActionPerformed

    private void button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_8ActionPerformed
        equation.setText(equation.getText()+"8");
    }//GEN-LAST:event_button_8ActionPerformed

    private void button_backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backspaceActionPerformed
        if(!equation.getText().equals(""))
        {
            try {
                equation.setText(equation.getText(0, equation.getText().length()-1));
            } catch (BadLocationException ex) {
                Logger.getLogger(CalculatorWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_button_backspaceActionPerformed

    private void button_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_multiplyActionPerformed
        equation.setText(equation.getText()+"*");
    }//GEN-LAST:event_button_multiplyActionPerformed

    private void button_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_plusActionPerformed
        equation.setText(equation.getText()+"+");
    }//GEN-LAST:event_button_plusActionPerformed

    private void button_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_equalsActionPerformed
//        equation.setText("");
        equation.setText(doubleToString(solve(stringToArray(equation.getText()))));        
    }//GEN-LAST:event_button_equalsActionPerformed

    private void button_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_clearActionPerformed
        equation.setText(null);
    }//GEN-LAST:event_button_clearActionPerformed

    private void button_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_divideActionPerformed
        equation.setText(equation.getText()+"/");
    }//GEN-LAST:event_button_divideActionPerformed

    private void button_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_minusActionPerformed
        equation.setText(equation.getText()+"-");
    }//GEN-LAST:event_button_minusActionPerformed

    private void equationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationKeyPressed
//        System.out.println(evt.getKeyCode());

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){            
            button_equals.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            button_backspace.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_DELETE){
            button_clear.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ADD){
            button_plus.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_SUBTRACT){
            button_minus.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_MULTIPLY){
            button_multiply.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_DIVIDE){
            button_divide.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_COMMA || evt.getKeyCode()==110){
            button_comma.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD0){
            button_0.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD1){
            button_1.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD2){
            button_2.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD3){
            button_3.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD4){
            button_4.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD5){
            button_5.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD6){
            button_6.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD7){
            button_7.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD8){
            button_8.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_NUMPAD9){
            button_9.doClick();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            button_equals.doClick();
        }
    }//GEN-LAST:event_equationKeyPressed
    private ArrayList<String> stringToArray(String str)
    {
        ArrayList<String> temp = new ArrayList();
        int ai =0;
        for(int i=0 ; i<str.length() ; i++)
        {            
            if(temp.isEmpty() || ai==temp.size())
            {
                temp.add(ai, "");
            } 
            if(i==0 && str.charAt(0)=='-')
            {
                temp.add(ai++, "0");
                temp.add(ai++, "-");
                continue;
            }
            if(str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='*' || str.charAt(i)=='/')
            {                
                if(str.charAt(i-1)=='+' || str.charAt(i-1)=='-' || str.charAt(i-1)=='*' || str.charAt(i-1)=='/') continue;                                    
                
                ai++;
                temp.add(ai++, ""+str.charAt(i));                
            }
            else
            {
                if(str.charAt(i)==',' || str.charAt(i)=='.')
                {
                    if(str.charAt(i-1)==',' || str.charAt(i-1)=='.')continue; 
                    temp.set(ai, temp.get(ai)+'.');
                }
                else                    
                {
                    if(str.charAt(i)>='0' && str.charAt(i)<='9')
                    {                      
                        temp.set(ai, temp.get(ai)+str.charAt(i));
                    }
                }
            }
        }
//        for(int i=0;i<temp.size() ; i++)
//        {
//            System.out.println(temp.get(i));
//        }
        return temp;
    }
    private Double solve(ArrayList<String> equation)
    {
        int i = 1;
        boolean checkMul = false;
        while(equation.size()>1)
        {
            Double temp=0.0;
            if(equation.size()>2)
            {
                if(equation.get(i).equals("*"))
                {
                    temp = Double.parseDouble(equation.get(i-1)) * Double.parseDouble(equation.get(i+1));
                }
                else if(equation.get(i).equals("/"))
                {
                    temp = Double.parseDouble(equation.get(i-1)) / Double.parseDouble(equation.get(i+1));
                }
                else
                {                    
                    if(i==equation.size()-1)
                    {
                        checkMul=true;
                        i=1;
                    }else
                    {
                        i++;
                        continue;
                    }
                }
                if(checkMul)
                {    
                    if(equation.get(i).equals("+"))
                    {
                        temp = Double.parseDouble(equation.get(i-1)) + Double.parseDouble(equation.get(i+1));
                    }
                    else if(equation.get(i).equals("-"))
                    {
                        temp = Double.parseDouble(equation.get(i-1)) - Double.parseDouble(equation.get(i+1));
                    }                    
                }
                equation.set(i, ""+temp);
                equation.remove(i+1);
                equation.remove(i-1);
                i=1;
            }
            else break;
        }
        
        return Double.parseDouble(equation.get(0));
    }
    private String doubleToString(Double num)
    {
        return num.intValue()==num ? ""+num.intValue() : ""+num;
    }
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
            java.util.logging.Logger.getLogger(CalculatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_0;
    private javax.swing.JButton button_1;
    private javax.swing.JButton button_2;
    private javax.swing.JButton button_3;
    private javax.swing.JButton button_4;
    private javax.swing.JButton button_5;
    private javax.swing.JButton button_6;
    private javax.swing.JButton button_7;
    private javax.swing.JButton button_8;
    private javax.swing.JButton button_9;
    private javax.swing.JButton button_backspace;
    private javax.swing.JButton button_clear;
    private javax.swing.JButton button_comma;
    private javax.swing.JButton button_divide;
    private javax.swing.JButton button_equals;
    private javax.swing.JButton button_minus;
    private javax.swing.JButton button_multiply;
    private javax.swing.JButton button_plus;
    private javax.swing.JTextField equation;
    // End of variables declaration//GEN-END:variables
}
