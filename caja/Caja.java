package caja;
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    Caja ()
    {
        ancho = 3;
        alto =  2;
        profundo = 6;
    }
   public int CalculaVolumen ()
   {
       int vol;
       return vol = ancho * alto * profundo ;
   }
    public int calcularVolumen(int ancho, int alto, int profundo) {
        return ancho * alto * profundo;
    }
}
