/*
 * WANDORA
 * Knowledge Extraction, Management, and Publishing Application
 * http://wandora.org
 * 
 * Copyright (C) 2004-2016 Wandora Team
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * 
 *
 * MemoryConfiguration.java
 *
 * Created on 24. marraskuuta 2005, 13:42
 */

package org.wandora.topicmap.memory;



import javax.swing.*;
import org.wandora.topicmap.*;
import org.wandora.application.*;
import org.wandora.application.gui.*;
import org.wandora.application.gui.simple.*;
import org.wandora.utils.*;
import java.util.*;
import static org.wandora.utils.Tuples.*;
/**
 *
 * @author  olli
 */
public class MemoryConfiguration extends TopicMapConfigurationPanel {
    public static final String LOAD_MINI_SCHEMA_PARAM = "LOAD_MINI_SCHEMA_PARAM";
    
    Wandora admin = null;
    
    
    
    /** Creates new form MemoryConfiguration */
    public MemoryConfiguration(Wandora admin) {
        initComponents();
    }

    public String getParameters() {
        if(loadMiniSchemaRadioButton.isSelected()) {
            return LOAD_MINI_SCHEMA_PARAM;
        }
        if(loadRadioButton.isSelected())
            return sourceTextField.getText();
        else return "";
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        emptyRadioButton = new org.wandora.application.gui.simple.SimpleRadioButton();
        loadMiniSchemaRadioButton = new org.wandora.application.gui.simple.SimpleRadioButton();
        loadXTMPanel = new javax.swing.JPanel();
        loadRadioButton = new org.wandora.application.gui.simple.SimpleRadioButton();
        sourceTextField = new org.wandora.application.gui.simple.SimpleField();
        browseButton = new org.wandora.application.gui.simple.SimpleButton();

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);

        buttonGroup1.add(emptyRadioButton);
        emptyRadioButton.setSelected(true);
        emptyRadioButton.setText("Empty");
        emptyRadioButton.setToolTipText("Leave the created topic map layer empty");
        emptyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 5);
        add(emptyRadioButton, gridBagConstraints);

        buttonGroup1.add(loadMiniSchemaRadioButton);
        loadMiniSchemaRadioButton.setText("Load mini schema");
        loadMiniSchemaRadioButton.setToolTipText("Load minimal Wandora schema to the created topic map");
        loadMiniSchemaRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        loadMiniSchemaRadioButton.setPreferredSize(new java.awt.Dimension(110, 23));
        loadMiniSchemaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMiniSchemaRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 5);
        add(loadMiniSchemaRadioButton, gridBagConstraints);

        loadXTMPanel.setLayout(new java.awt.GridBagLayout());

        buttonGroup1.add(loadRadioButton);
        loadRadioButton.setText("Load XTM");
        loadRadioButton.setToolTipText("Load given XTM topic map the created topic map layer");
        loadRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        loadXTMPanel.add(loadRadioButton, gridBagConstraints);

        sourceTextField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        loadXTMPanel.add(sourceTextField, gridBagConstraints);

        browseButton.setText("Browse");
        browseButton.setEnabled(false);
        browseButton.setMargin(new java.awt.Insets(2, 6, 2, 6));
        browseButton.setMinimumSize(new java.awt.Dimension(69, 25));
        browseButton.setPreferredSize(new java.awt.Dimension(69, 25));
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 8);
        loadXTMPanel.add(browseButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        add(loadXTMPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void loadMiniSchemaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMiniSchemaRadioButtonActionPerformed
        sourceTextField.setEnabled(false);
        browseButton.setEnabled(false);  
    }//GEN-LAST:event_loadMiniSchemaRadioButtonActionPerformed

    private void loadRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadRadioButtonActionPerformed
        sourceTextField.setEnabled(true);
        browseButton.setEnabled(true);
    }//GEN-LAST:event_loadRadioButtonActionPerformed

    private void emptyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyRadioButtonActionPerformed
        sourceTextField.setEnabled(false);
        browseButton.setEnabled(false);        
    }//GEN-LAST:event_emptyRadioButtonActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        JFileChooser fc=new JFileChooser();
        int c=fc.showOpenDialog(this.getParent());
        if(c==JFileChooser.APPROVE_OPTION){
            sourceTextField.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton emptyRadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton loadMiniSchemaRadioButton;
    private javax.swing.JRadioButton loadRadioButton;
    private javax.swing.JPanel loadXTMPanel;
    private javax.swing.JTextField sourceTextField;
    // End of variables declaration//GEN-END:variables
    
}
