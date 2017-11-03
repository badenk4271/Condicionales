/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB01
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     float nota1, nota2, nota3, promedio;
    nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota"));
    nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota"));
    nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota"));
    
    promedio = (nota1 + nota2 + nota3)/3;
    JOptionPane.showMessageDialog(null,"su promedio es: "+promedio);
   // Si la condicion se cumple se ejecuta este codigo
    if (promedio>=4) //Aqui va una condicion 
    { 
      
    JOptionPane.showMessageDialog(null,"Aprobo");
      
    }
    
    else//Si no se cumple la condicion se ejecuta esto
        JOptionPane.showMessageDialog(null,"Reprobo");
            
    
}
    } 



