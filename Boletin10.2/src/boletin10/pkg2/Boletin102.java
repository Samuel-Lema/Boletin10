package boletin10.pkg2;

import javax.swing.JOptionPane;

public class Boletin102 {

    public static void main(String[] args) {
        
        int num = (int) (Math.random() * 50) + 1;
        
        int comparar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número de oportunidades:"));
        
        for(int i=0;i < comparar;i++){
            
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
            
            if(num2 == num){
                
                JOptionPane.showMessageDialog(null,"Numero Correcto."); break;
            } else if(num2 > num + 20 || num2 < num -20) {
                
                JOptionPane.showMessageDialog(null,"Moi lonxe");
            } else if(num2 <= num + 20 && num2 >= num + 10 || num2 >= num -20 && num2 <= num - 10) {
                
                JOptionPane.showMessageDialog(null,"Lonxe");
            }  else if(num2 < num + 10 && num2 > num + 5 || num2 >= num -10 && num2 <= num - 5) {
                
                JOptionPane.showMessageDialog(null,"Preto");
            }  else if(num2 <= num + 5 || num2 >= num - 5) {
                
                JOptionPane.showMessageDialog(null,"Moi preto");
            }
        }
    }
    
}
