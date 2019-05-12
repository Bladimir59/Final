
package practicafinal;

/**
 *
 * @author Bladimir
 */
public class Armas {
    private int Punteria;
    private int Ataque;
    private String Vehiculo;
    private int costo;

    public Armas(int Punteria, int Ataque, String Vehiculo, int costo) {
        this.Punteria = Punteria;
        this.Ataque = Ataque;
        this.Vehiculo = Vehiculo;
        this.costo = costo;
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
