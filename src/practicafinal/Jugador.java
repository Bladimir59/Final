package practicafinal;

import InterfacesGraficas.CrearVehiculo;
import java.util.ArrayList;

/**
 *
 * @author Bladimir
 */
public class Jugador {
    private String Nombre;
    private String IDE;
    ArrayList<Vehiculo> nuevoVehiculo=new ArrayList();
    
    CrearVehiculo entrada=new CrearVehiculo();

    
    
    public void nuevos(){
        String nombre,tipo;
        nombre=entrada.getNom();
        tipo=entrada.getTip();
        System.out.println(""+tipo+"");
        switch("tipo"){
            case "Avion":
                nuevoVehiculo.add(new Avion(nombre, tipo, 0, 0, 0, 0, true, 0, 0, 0));
                break;
            case "Tanque":
                nuevoVehiculo.add(new Tanque(nombre, tipo, 0, 0, 0, 0, true, 0, 0, 0));
                break;
        }
    }
    

    public Jugador(String Nombre, String IDE) {
        this.Nombre = Nombre;
        this.IDE = IDE;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
}
