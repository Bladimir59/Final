package practicafinal;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


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
        Jugador esJugador=new Jugador(Nombre, Ide);
        esJugador.setExperiencia(0);
        esJugador.setGanados(0);
        esJugador.setJuegosJugados(0);
        esJugador.setNivel(1);
        esJugador.setOro(1000);
        esJugador.setPerdidos(0);
        esJugador.setRendido(0);
        ListadoJugadore.add(esJugador);
    }    
    
    // arreglo de lista de vehiculos
    ArrayList<Vehiculo> ListadoVehiculos=new ArrayList<>();

    public ArrayList<Vehiculo> getListadoVehiculos() {
        return ListadoVehiculos;
    }   

    public ArrayList<Armas> getListadoArmas() {
        return ListadoArmas;
    }

    public void setListadoArmas(ArrayList<Armas> ListadoArmas) {
        this.ListadoArmas = ListadoArmas;
    }
    
    public void AgregarVehiculoAvion(String Nombre,String Tipo,String Dueño){
        Vehiculo esAvion=new Avion(0);
        esAvion.setNombre(Nombre);
        esAvion.setTipo(Tipo);
        esAvion.setNivel(1);
        esAvion.setAtaque(100);
        esAvion.setDefensa(50);
        esAvion.setEstado(true);
        esAvion.setHP(1000);
        esAvion.setPP(50);
        esAvion.setPropietario(Dueño);
        esAvion.setPunteria(50);
        esAvion.setEnemigoDestruido(0);
        ListadoVehiculos.add(esAvion);
    }   
    public void AgregarVehiculoTanque(String Nombre,String Tipo,String Dueño){
        Vehiculo esTanque=new Tanque(0);
        esTanque.setNombre(Nombre);
        esTanque.setTipo(Tipo);
        esTanque.setNivel(1);
        esTanque.setAtaque(100);
        esTanque.setDefensa(50);
        esTanque.setEstado(true);
        esTanque.setHP(100);
        esTanque.setPP(50);
        esTanque.setPropietario(Dueño);
        esTanque.setPunteria(10);
        esTanque.setEnemigoDestruido(0);
        ListadoVehiculos.add(esTanque);
    }
    // arreglo de lista de armas
    ArrayList<Armas> ListadoArmas=new ArrayList<>();
    public void AgregarArma(int punteria,int ataque,int precio,String nombre){
        ListadoArmas.add(new Armas(punteria, ataque, precio,nombre));
    }    
    // arrlego de lista de battallas
//    ArrayList<Escenario> ListadoBatallas=new ArrayList<>();
//    public void GuardarPartida(){
//        ListadoBatallas.add(new Escenario());
//    }

    public void Guarda(){
        try {
            ObjectOutputStream Escribiendo_Jugadores=new ObjectOutputStream(new FileOutputStream("Jugadores.dat"));
            Escribiendo_Jugadores.writeObject(ListadoJugadore);
            Escribiendo_Jugadores.close();
            ObjectOutputStream Escribiendo_vehiculos=new ObjectOutputStream(new FileOutputStream("Vehiculos.dat"));
            Escribiendo_vehiculos.writeObject(ListadoVehiculos);
            Escribiendo_vehiculos.close();
            ObjectOutputStream Escribiendo_Armas=new ObjectOutputStream(new FileOutputStream("Armas.dat"));
            Escribiendo_Armas.writeObject(ListadoArmas);
            Escribiendo_Armas.close();
            
        } catch (Exception e) {
        }
    }
    public void Recuperar(){
        try {
            ObjectInputStream Recuperando_Jugadores=new ObjectInputStream(new FileInputStream("Jugadores.dat"));
            ListadoJugadore=(ArrayList<Jugador>)Recuperando_Jugadores.readObject();
            Recuperando_Jugadores.close();
            ObjectInputStream Recuperando_Vehiculos=new ObjectInputStream(new FileInputStream("Vehiculos.dat"));
            ListadoVehiculos=(ArrayList<Vehiculo>)Recuperando_Vehiculos.readObject();
            Recuperando_Vehiculos.close();
            ObjectInputStream Recuperando_Armas=new ObjectInputStream(new FileInputStream("listado.dat"));
            ListadoArmas=(ArrayList<Armas>)Recuperando_Armas.readObject();
            Recuperando_Armas.close();
        } catch (Exception e) {
        }
    }

    public void setListadoJugadore(ArrayList<Jugador> ListadoJugadore) {
        this.ListadoJugadore = ListadoJugadore;
    }

    public void setListadoVehiculos(ArrayList<Vehiculo> ListadoVehiculos) {
        this.ListadoVehiculos = ListadoVehiculos;
    }
    public void escribir2(String linea){
        Scanner entrada=new Scanner(System.in);
        //éste método permite escribir si no existe y actualizar (agregar) si existe
	//  se crea pw como un nuevo escritor, que utiliza una bufferización del archivo, el "true" activa la edición y se coloca al final  
	try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("prueba.html", true)))) {
            System.out.println("<HTML>");
            System.out.println("<TITLE>Título del documento HTML</TITLE>");
            System.out.println("</HTML>");
            System.out.println("<BODY>");
            System.out.println("<ol>");
            System.out.println("<li>");
            
            pw.println(linea);
            
            System.out.println("</li>");
            System.out.println("/<ol>");
            System.out.println("</BODY>");
            System.out.println("/<HTML>");
	}catch (IOException e) {
            System.err.println(e);
      	}		
	}

}
