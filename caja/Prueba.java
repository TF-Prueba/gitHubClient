package caja;
public class Prueba {
     public static void main(String[] args) {
        int ancho = 5;
        int alto = 2;
        int profundo = 6;

        Caja caja1 = new Caja();
        int res1=caja1.CalculaVolumen();
        int res2=caja1.calcularVolumen(ancho, alto, profundo);
        
        System.out.println("resultado de caja 1:" + res1);
        System.out.println("resultado de caja 2:" + res2);
       
    }
    
    
}
