
package practicafinal;

import java.io.Serializable;

/**
 *
 * @author Bladimir
 */
public class Armas implements Serializable{
    private int Punteria;
    private int Ataque;
    private String Vehiculo;
    private int costo;
    private String Nombre;

    public Armas(int Punteria, int Ataque,int costo,String Nombre) {
        this.Punteria = Punteria;
        this.Ataque = Ataque;
        this.costo = costo;
        this.Nombre=Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public int getPunteria() {
        return Punteria;
    }

    public void setPunteria(int Punteria) {
        this.Punteria = Punteria;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
}
