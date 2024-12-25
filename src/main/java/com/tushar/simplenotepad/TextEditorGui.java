package com.tushar.simplenotepad;

import static java.awt.AWTEventMulticaster.remove;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class TextEditorGui extends javax.swing.JFrame {

   
   
    String fileName;
    
     private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    
 
    public TextEditorGui() {
        initComponents();
        
 
            // Set tab size and override tab key behavior
    TextArea.setTabSize(10);

    TextArea.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyPressed(java.awt.event.KeyEvent evt) {
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                evt.consume(); // Prevent default tab action
                int caretPosition = TextArea.getCaretPosition();
                try {
                    TextArea.getDocument().insertString(caretPosition, "          ", null); // Insert 10 spaces
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    });
        
    }
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchFrame = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        clearBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        searchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchButtonKeyPressed(evt);
            }
        });

        searchFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFrameActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addGap(18, 18, 18)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(clearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        jMenu2.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jMenu2.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        jMenu2.add(paste);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchTextArea(TextArea , searchFrame.getText());
          

        
    }//GEN-LAST:event_searchButtonActionPerformed

   class myHighlighter extends  DefaultHighlighter.DefaultHighlightPainter{
       
        public myHighlighter(Color c) {
            super(c);
        }
       
   }
   
   DefaultHighlighter.HighlightPainter highlighter = new myHighlighter(Color.yellow);
   
   public void removeHighlighter(JTextComponent textComp)
   {
       Highlighter removeHighlighter = textComp.getHighlighter();
       Highlighter.Highlight[] remove = removeHighlighter.getHighlights();
       
       
       for(int i = 0; i < remove.length;i++)
       {
           if(remove[i].getPainter() instanceof myHighlighter)
           {
               removeHighlighter.removeHighlight(remove[i]);
           }
       }
   }
   
   public void searchTextArea(JTextComponent textComp , String textString)
   {
       removeHighlighter(textComp);
       try
       {
         Highlighter hilight = textComp.getHighlighter();
         Document doc = textComp.getDocument();
         String text = doc.getText(0 , doc.getLength());
         
         int pos = 0;
         
         while((pos = text.toUpperCase().indexOf(textString.toUpperCase(),pos)) >= 0)
         {
             hilight.addHighlight(pos, pos+textString.length(), highlighter);
             pos += textString.length();
         }
         
       }
       catch(Exception e)
       {
           System.out.println("Error during search operation: " + e.getMessage());

       }
   }
   
        public void removeHighlights(JTextComponent textComp) {
        Highlighter highlighter = textComp.getHighlighter();
        Highlighter.Highlight[] highlights = highlighter.getHighlights();

        for(int i = 0; i < highlights.length; i++) {
            if(highlights[i].getPainter() instanceof myHighlighter) {
                highlighter.removeHighlight(highlights[i]);
            }
        }

        
    }
    
    private void searchFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFrameActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
       String copyText = TextArea.getSelectedText();
       StringSelection copySelection = new StringSelection(copyText);
       clipboard.setContents(copySelection, copySelection);
       
    }//GEN-LAST:event_copyActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
     FileDialog fileDialog = new FileDialog(TextEditorGui.this , "Open File" ,FileDialog.LOAD);
     fileDialog.setVisible(true);
     
     if(fileDialog.getFile() != null )
     {
        fileName = fileDialog.getDirectory() + fileDialog.getFile();
        
        setTitle(fileName);
     }
     
  try
  {
     BufferedReader  reader = new BufferedReader(new FileReader(fileName));
     
     StringBuilder sb = new StringBuilder();
     
      String line = null;
      
      while((line = reader.readLine()) != null )
      {
          sb.append(line + "\n");
          TextArea.setText(sb.toString());
      }
      
      reader.close();
  }
    catch(IOException e)
    {
        System.out.println(" File not Found! ");
    }
    }//GEN-LAST:event_openFileActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
       TextArea.setText("");
       setTitle(fileName);
        
    }//GEN-LAST:event_newFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        FileDialog fileDialog = new FileDialog(TextEditorGui.this , "Save File ", FileDialog.SAVE);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null)
        {
            fileName = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(fileName);
        }
        
        try
        {
          FileWriter fileWriter = new FileWriter(fileName);
          fileWriter.write(TextArea.getText());
          setTitle(fileName);
          fileWriter.close();
        }
        catch(IOException ie)
        {
            System.out.println("File not Found ");
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
       String cutString = TextArea.getText();
       StringSelection cutSelection = new StringSelection(cutString);
       clipboard.setContents(cutSelection, cutSelection);
       TextArea.replaceRange("", TextArea.getSelectionStart(), TextArea.getSelectionEnd());
       
    }//GEN-LAST:event_cutActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
      try
      {
          Transferable pasteText = clipboard.getContents(this);
          String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
          TextArea.replaceRange(sel, TextArea.getSelectionStart(),TextArea.getSelectionEnd());
      }
      catch(Exception e)
      {
          System.out.println("Error during paste operation: " + e.getMessage());
        
      }
    }//GEN-LAST:event_pasteActionPerformed

    private void searchButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonKeyPressed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
          
    searchFrame.setText("");
    removeHighlighter(TextArea);
    }//GEN-LAST:event_clearBtnActionPerformed


    
    
    public static void main(String args[]) {
   
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
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
         
         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton clearBtn;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchFrame;
    // End of variables declaration//GEN-END:variables
}
