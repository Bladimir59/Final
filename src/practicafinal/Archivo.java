package practicafinal;

import java.util.ArrayList;

/**
 *
 * @author Bladimir
 */
public class Archivo {
    // constructor
    public Archivo(){
        this.ListadoJugadore = new ArrayList<>();
        this.ListadoVehiculos = new ArrayList<>();
        this.ListadoArmas = new ArrayList<>();
    }
    // arreglo para juagadores 
    
    ArrayList<Jugador> ListadoJugadore=new ArrayList<>();
    
    public ArrayList<Jugador> getListadoJugadore() {
        return ListadoJugadore;
    }
    public void AgregarJugador(String Nombre,String Ide){        
        ListadoJugadore.add(new Jugador(Nombre, Ide));
        
    }    
    
    // arreglo de lista de vehiculos
    ArrayList<Vehiculo> ListadoVehiculos=new ArrayList<>();

    public ArrayList<Vehiculo> getListadoVehiculos() {
        return ListadoVehiculos;
    }   
    
    public void AgregarVehiculoAvion(String Nombre,String Tipo,String Dueño){
        Vehiculo esAvion=new Avion(0);
        esAvion.setNombre(Nombre);
        esAvion.setTipo(Tipo);
        esAvion.setNivel(0);
        esAvion.setAtaque(0);
        esAvion.setDefensa(0);
        esAvion.setEstado(true);
        esAvion.setHP(0);
        esAvion.setPP(0);
        esAvion.setPropietario(Dueño);
        esAvion.setPunteria(0);
        ListadoVehiculos.add(esAvion);
    }   
    public void AgregarVehiculoTanque(String Nombre,String Tipo,String Dueño){
        Vehiculo esTanque=new Tanque(0);
        esTanque.setNombre(Nombre);
        esTanque.setTipo(Tipo);
        esTanque.setNivel(0);
        esTanque.setAtaque(0);
        esTanque.setDefensa(0);
        esTanque.setEstado(true);
        esTanque.setHP(0);
        esTanque.setPP(0);
        esTanque.setPropietario(Dueño);
        esTanque.setPunteria(0);
        ListadoVehiculos.add(esTanque);
    }
    // arreglo de lista de armas
    ArrayList<Armas> ListadoArmas=new ArrayList<>();
    public void AgregarArma(int punteria,int ataque,String nameVehiculo,int precio){
        ListadoArmas.add(new Armas(punteria, ataque, nameVehiculo, precio));
    }    
    // arrlego de lista de battallas
//    ArrayList<Escenario> ListadoBatallas=new ArrayList<>();
//    public void GuardarPartida(){
//        ListadoBatallas.add(new Escenario());
//    }

    
}
