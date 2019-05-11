
package practicafinal;

/**
 *
 * @author Bladimir
 */
public class Armas {
    private int Punteria;
    private int Ataque;
    private String Vehiculo;

    public Armas(int Punteria, int Ataque, String Vehiculo) {
        this.Punteria = Punteria;
        this.Ataque = Ataque;
        this.Vehiculo = Vehiculo;
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
    
    
}
