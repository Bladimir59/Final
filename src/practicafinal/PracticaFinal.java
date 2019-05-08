package practicafinal;

import InterfacesGraficas.Inicio;
import java.io.File;

/**
 *
 * @author Bladimir
 */
public class PracticaFinal {

    public static void main(String[] args) {
         File carpeta = new File("Player");
        if (!carpeta.exists()) {
            carpeta.mkdir();
            
        }
        Inicio nuevo=new Inicio();
        nuevo.show();
        
        
        
    }
    
}
