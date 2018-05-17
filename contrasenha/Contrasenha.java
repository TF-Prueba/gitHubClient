package contrasenha;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Contrasenha {
    
    public String dato= " " ; 
    Contrasenha () //Metodo constructor
    {
      dato= " " ; 
    }
    
    public void solicita ()
    {
        /*Scanner leer= new Scanner (System.in);
        System.out.println("Escriba dato");
        dato=leer.next();*/
        dato=JOptionPane.showInputDialog("Escriba dato");       
    }
    public void genera ()
    {
        char caracter1,  caracter4; 
        String caracter3;
        int caracter2, caracter5;
      
            caracter1=dato.charAt(2);
            caracter2=dato.length();
            caracter3=dato.toUpperCase();
            caracter4= caracter3.charAt((caracter2-1));  
            caracter5=caracter2/2;
            
            //String cadena1 = new String(caracter1);
                   
            JOptionPane.showMessageDialog(null,"La clave es: " +caracter1+caracter2+caracter3+caracter4+caracter5);    
    }   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contrasenha mostrar  = new Contrasenha();
        mostrar.solicita();
        mostrar.genera();
    }
    
}
