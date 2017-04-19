/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.a13;
import javax.swing.JOptionPane;
/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHA13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    double e, p, imc;
    e= valores("Introduce la estatura");
    p= valores ("Introduce el peso");
    imc= p/ Math.pow (e,2);
    if (imc > 25){
            JOptionPane.showMessageDialog (null, "Tu imc es "+ imc+ " Estas en sobrepeso");
        }else if (imc < 18){
         JOptionPane.showMessageDialog (null, "Tu imc es "+ imc+ " Estas en desnutrición");
        }else {
            JOptionPane.showMessageDialog (null, "Tu imc es "+ imc+ " Estas en peso normal");
}
   
    
    
    }
 public static double valores (String mensaje){
     boolean flag;
     double dato=0;
     do{
         try{
             String usuario= JOptionPane.showInputDialog (null, mensaje);
             dato= Double.parseDouble (usuario);
             flag=false;
            } 
         catch (Exception Ex){
             JOptionPane.showMessageDialog (null, "Error");
             flag=true;
         }
     } while (flag);
      return dato;
 }

}
