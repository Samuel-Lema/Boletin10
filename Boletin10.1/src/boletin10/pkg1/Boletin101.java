package boletin10.pkg1;

import javax.swing.JOptionPane;

public class Boletin101 {

    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero a adivinar:"));
        
        int comparar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número de oportunidades:"));
        
        for(int i=0;i < comparar;i++){
            
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número:"));
            
            if(num2 == num){
                
                JOptionPane.showMessageDialog(null,"Numero Correcto."); break;
            } else {
                
                JOptionPane.showMessageDialog(null,"Inténtalo de nuevo.");
            }
        }
    }
    
}
