package practicafinal;

import InterfacesGraficas.Escenario;
import java.util.ArrayList;

/**
 *
 * @author Bladimir
 */
public class Archivo {
    // arreglo para juagadores 
    ArrayList<Jugador> ListadoJugadore=new ArrayList<>();
    public void AgregarJugador(){
        
        ListadoJugadore.add(new Jugador(Nombre, IDE));
    }   
    // arreglo de lista de vehiculos
    ArrayList<Vehiculo> ListadoVehiculos=new ArrayList<>();
    public void AgregarVehiculo(){
        String tipo;
        switch("tipo"){
            case "Avion":
                ListadoVehiculos.add(new Avion(tipo, tipo, 0, 0, 0, 0, true, 0, 0, 0));
                break;
            case "Tanque":
                ListadoVehiculos.add(new Tanque(tipo, tipo, 0, 0, 0, 0, true, 0, 0, 0));
                break;
        }
    }   
    // arreglo de lista de armas
    ArrayList<Armas> ListadoArmas=new ArrayList<>();
    public void AgregarArma(){
        ListadoArmas.add(new Armas(0, 0, Vehiculo));
    }    
    // arrlego de lista de battallas
    ArrayList<Escenario> ListadoBatallas=new ArrayList<>();
    public void GuardarPartida(){
        ListadoBatallas.add(new Escenario());
    }
    
}
