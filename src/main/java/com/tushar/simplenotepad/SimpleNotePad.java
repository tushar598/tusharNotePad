
package com.tushar.simplenotepad;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SimpleNotePad {

    public static void main(String[] args) {
        
        TextEditorGui obj = new TextEditorGui();
               ImageIcon image = new ImageIcon("C:\\Users\\91999\\Documents\\NetBeansProjects\\SimpleNotePad\\src\\main\\java\\com\\tushar\\simplenotepad\\logo.png");
        
          obj.setIconImage(image.getImage());
       
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("Notepad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
    }
}
