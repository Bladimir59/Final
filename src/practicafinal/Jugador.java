package practicafinal;

import InterfacesGraficas.CrearVehiculo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Bladimir
 */
public class Jugador implements Serializable{
    private String Nombre;
    private String IDE;
    private int Nivel;
    private int Oro;
    private int Experiencia;
    private int JuegosJugados;
    private int ganados;
    private int perdidos;
    private int rendido;
    
    private ArrayList<Vehiculo> nuevoVehiculo;
    private int UsarVehiculo;
    
    
    
    public Jugador(String Nombre, String IDE) {
        this.Nombre = Nombre;
        this.IDE = IDE;
    }

    public void addVehiculo(Vehiculo paraAgregar){
        nuevoVehiculo.add(paraAgregar);
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

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getOro() {
        return Oro;
    }

    public void setOro(int Oro) {
        this.Oro = Oro;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    public int getJuegosJugados() {
        return JuegosJugados;
    }

    public void setJuegosJugados(int JuegosJugados) {
        this.JuegosJugados = JuegosJugados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getRendido() {
        return rendido;
    }

    public void setRendido(int rendido) {
        this.rendido = rendido;
    }

    public ArrayList<Vehiculo> getNuevoVehiculo() {
        return nuevoVehiculo;
    }

    public void setNuevoVehiculo(ArrayList<Vehiculo> nuevoVehiculo) {
        this.nuevoVehiculo = nuevoVehiculo;
    }

    public int getUsarVehiculo() {
        return UsarVehiculo;
    }

    public void setUsarVehiculo(int UsarVehiculo) {
        this.UsarVehiculo = UsarVehiculo;
    }
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
}
