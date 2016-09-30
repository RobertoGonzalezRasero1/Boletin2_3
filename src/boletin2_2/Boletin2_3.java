/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import javax.swing.JOptionPane;



/**
 *
 * @author rgonzalezrasero
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double  euro;   
        double dolares=1.12;
        double conversion;
         euro = Double.parseDouble(JOptionPane.showInputDialog("euro"));   
         conversion = euro*1.12;
          JOptionPane.showMessageDialog(null,"conversion = "+ conversion);
                 
    }
    
}
