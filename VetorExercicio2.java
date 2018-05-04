import javax.swing.JOptionPane;

    public class VetorExercicio2{

    public static void main(String[] args){

       String nomes[] = new String[10]; 
       
       nomes[0] = "GORILA ";   
       nomes[1] = "SABINO ";     
       nomes[2] = "GOLIMAR";
       nomes[3] = "AUFRANAZIO";
       nomes[4] = "SOPA";
       nomes[5] = "SAMBA";
       nomes[6] = "MAMBA NEGRA";
       nomes[7] = "RICHARD HASMUSSI";    
       nomes[8] = "EVERSON ZOIO";    
       nomes[9] = "ALEKI";    

       

       
    JOptionPane.showMessageDialog(null, "" + nomes[0] + "\n" + nomes[1] + "\n" + nomes[2] + 
                                      "\n" + nomes[3] + "\n" + nomes[4] + "\n" + nomes[5] + 
                                      "\n" + nomes[6] + "\n" + nomes[7] + "\n" + nomes[8] +
                                      "\n" + nomes[9]);

     }
    }    