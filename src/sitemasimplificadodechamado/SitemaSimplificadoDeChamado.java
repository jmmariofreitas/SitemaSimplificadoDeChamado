
package sitemasimplificadodechamado;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author satarosa
 */
public class SitemaSimplificadoDeChamado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date nt = new Date();
        int num1 = 18052016;
       
        int dataAtual = 18052016;
        Chamados ch = new Chamados();
        
       
       
        int numero = 0;
        
       if(num1 <= dataAtual){
            
            
           // dafda.setVisible(true);
           
       }else{
           numero = 1;
           int q = 0;
           while(numero == 1){
                JOptionPane.showMessageDialog(null, "Chame o administrador do sistema! ");
                ch.setVisible(false);
               q++;
               if(q >= 5){
                   JOptionPane.showMessageDialog(null, " Sua Licensa de Uso expirou! ");
                ch.setVisible(false);
              
               }
           }
           JOptionPane.showMessageDialog(null, "Chame o administrador do sistema! ");
            ch.setVisible(false);
           
       }
        
       
        
        //ch.setVisible(false);
    }
    
}
