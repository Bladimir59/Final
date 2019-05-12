package practicafinal;

import InterfacesGraficas.Menu;
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
        
        Menu ir=new Menu();               
        ir.show(true);
        
        
    }
    
}
